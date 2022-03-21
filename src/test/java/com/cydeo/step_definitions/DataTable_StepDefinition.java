package com.cydeo.step_definitions;

import com.cydeo.pages.DataTablesPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DataTable_StepDefinition {

    DataTablesPage dataTablesPage=new DataTablesPage();

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {

        System.out.println(fruits);
    }


    @Given("User is on login page of CRM")
    public void user_is_on_login_page_of_crm() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");
    }
    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials){
           dataTablesPage.loginSearch.sendKeys(credentials.get("username"));
           dataTablesPage.passwordSearch.sendKeys(credentials.get("password"));
           dataTablesPage.loginButton.click();
    }
    @Then("user should see")
    public void user_should_see() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Portal"));
    }

}
