package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class SmartBear_StepDefinitions {

    SmartBearPage smartBearPage = new SmartBearPage();


    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {

        String url =
                "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx";
        Driver.getDriver().get(url);
        smartBearPage.username.sendKeys("Tester");
        smartBearPage.password.sendKeys("test");
        smartBearPage.loginButton.click();
    }

    @Given("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
        BrowserUtils.sleep(2);
        smartBearPage.orderButton.click();
    }

    @Given("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        Select select = new Select(smartBearPage.albumDropdown);
        select.selectByVisibleText("FamilyAlbum");

    }

    @When("User enters information:")
    public void user_enters_information(Map<String, String> infoList) {
        smartBearPage.searchingBoxes.clear();
        smartBearPage.searchingBoxes.get(0).sendKeys(infoList.get("quantity"));
        smartBearPage.searchingBoxes.get(4).sendKeys(infoList.get("customer Name"));
        smartBearPage.searchingBoxes.get(5).sendKeys(infoList.get("street"));
        smartBearPage.searchingBoxes.get(6).sendKeys(infoList.get("city"));
        smartBearPage.searchingBoxes.get(7).sendKeys(infoList.get("state"));
        smartBearPage.searchingBoxes.get(8).sendKeys(infoList.get("zipcode"));
        smartBearPage.searchingBoxes.get(9).click();
        smartBearPage.searchingBoxes.get(12).sendKeys(infoList.get("card number"));
        smartBearPage.searchingBoxes.get(13).sendKeys(infoList.get("expiration date"));

    }

    @Then("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.processButton.click();
    }

    @Then("User verifies John Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {
        smartBearPage.viewAllOrders.click();
        Assert.assertTrue(smartBearPage.johnWick.isDisplayed());
    }


//     SCENARIO OUTLINE EXAMPLE

    @When("User fills out the form as followed from the table below:")
    public void user_fills_out_the_form_as_followed_from_the_table_below() {
        BrowserUtils.sleep(2);
        smartBearPage.orderButton.click();
    }

    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        Select select = new Select(smartBearPage.albumDropdown);
        select.selectByVisibleText(string);
    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        smartBearPage.quantitySearch.sendKeys(string);
    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBearPage.customerNameSearch.sendKeys(string);
    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearPage.streetSearch.sendKeys(string);
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearPage.citySearch.sendKeys(string);
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearPage.stateSearch.sendKeys(string);
    }

    @When("User enters {string} to zip")
    public void user_enters_to_zip(String string) {
        smartBearPage.zipSearch.sendKeys(string);
    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        smartBearPage.cardType.click();
    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearPage.cardNumberSearch.sendKeys(string);
    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearPage.expireDateSearch.sendKeys(string);
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {

        for (WebElement each : smartBearPage.viewAllOrders2) {
            if (each.equals(string)) {
                Assert.assertTrue("Name doesn't match", each.isDisplayed());
            }
        }
    }
}