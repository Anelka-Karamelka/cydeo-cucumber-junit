package com.cydeo.step_definitions;


import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In the class we will be able to pass pre- condition
and post conditions to each scenario and each step
 */
public class Hooks {

    @Before (order = 0)
    public void setupScenario(){
        System.out.println("===Setting up browser using cucumber @Before");
    }

    @Before(value = "@login", order = 1)
    public void setupScenarioForLogins(){
        System.out.println("===this will only apply to scenarios with @Blogin tag");
    }
    @Before("@db")
    public void setupForDataBaseScenarios(){
        System.out.println("===this will only apply to scenarios with @db tag");
    }

    @After
    public void tearDownScenario(Scenario scenario){
        //if scenario is failed -->if scenario fails this method will return TRUE boolean value
        if(scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

       // Driver.closeDriver();


       // System.out.println("====Closing browser using cucumber @After");
       // System.out.println("====Scenario ended and take a screenshot if failed");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("===========Applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("=============Applying tearDown using @AfterStep");
    }
}
