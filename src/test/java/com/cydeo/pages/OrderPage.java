package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {

    public OrderPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(name = "name")
    public WebElement nameOfCustomer;

    @FindBy(name = "street")
    public WebElement inputStreet;

    @FindBy(name = "city")
    public WebElement inputCity;


    @FindBy(name = "state")
    public WebElement inputState;

    @FindBy(name = "zip")
    public WebElement inputZip;

    @FindBy(xpath = "(//input[@name='card'])[2]")
    public WebElement cardType;


    @FindBy(name="cardNo")
    public WebElement cardNumber;

    @FindBy(name = "cardExp")
    public WebElement expitarionDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processButton;
}
