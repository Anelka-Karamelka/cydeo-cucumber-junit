package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataTablesPage {

    public DataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement loginSearch;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordSearch;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(id = "month")
    public WebElement monthDropdown;
    }


