package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    public WikipediaSearchPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBox;


    @FindBy(xpath = "//button/i[.='Search']")
    public WebElement searchButton;

    @FindBy(id= "firstHeading")
    public WebElement mainHeader;
}
