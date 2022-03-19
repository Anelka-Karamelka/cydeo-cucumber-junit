package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {


    public EtsyPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="//input[@name='search_query']")
    public WebElement searchBox;


   @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement searchButton;

  // @FindBy(xpath = "//title[.='Wooden spoon | Etsy']")
   // public WebElement title;
}
