package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearPage {

    public SmartBearPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']")
    public WebElement loginButton;

    @FindBy(linkText = "Order")
    public WebElement orderButton;

    @FindBy(xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement albumDropdown;

    @FindBy(xpath = "//input[contains(@id,'ctl')]")
    public List<WebElement> searchingBoxes;

    @FindBy(xpath = "//a[.='Process']")
    public WebElement processButton;

    @FindBy(xpath = "//*[.='John Wick']")
    public WebElement johnWick;

    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrders;






}
