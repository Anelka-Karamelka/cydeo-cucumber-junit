package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTable_StepDefinitions {

    WebTablePage webTablePage=new WebTablePage();

    @Given("user is on login page of table app")
    public void user_is_on_login_page_of_table_app() {
        String url= ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);

    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {

        webTablePage.inputUsername.sendKeys(string);


    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTablePage.inputPassword.sendKeys(string);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        webTablePage.loginButton.click();
    }
    @Then("user should sees url contains orders")
    public void user_should_sees_url_contains_orders() {
        BrowserUtils.verifyURLContains("order");
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String psw) {
        webTablePage.login(username,psw);
    }
    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {

//        webTablePage.inputUsername.sendKeys(credentials.get("username"));
//        webTablePage.inputPassword.sendKeys(credentials.get("password"));

        webTablePage.login(credentials.get("username"), credentials.get("password"));
    }


    }

