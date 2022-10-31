package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {
    public void EtsySearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "//span[text()='Etsy']")
    public WebElement titleName;


    @FindBy(css = "[placeholder='Search for anything']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@value='Search']")
    public WebElement searchButton;


}
