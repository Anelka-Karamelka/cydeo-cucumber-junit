package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Etsy_StepDefinitions {

    EtsyPage page=new EtsyPage();

    @Given("User is on Etsy home page")
    public void user_is_on_etsy_home_page() {

        Driver.getDriver().get("https://www.etsy.com ");
    }
    @Then("User sees title is as expected")
    public void user_sees_title_is_as_expected() {

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals("Title is not as expected!",expectedTitle, actualTitle);
    }


    @When("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {

        page.searchBox.sendKeys("Wooden Spoon");

    }

    @And("User clicks search button")
    public void userClicksSearchButton() {

        page.searchButton.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {

        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as expected!",expectedTitle, actualTitle);
    }


    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String string) {

        page.searchBox.sendKeys(string);

    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String string) {

        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(string));
    }
}
