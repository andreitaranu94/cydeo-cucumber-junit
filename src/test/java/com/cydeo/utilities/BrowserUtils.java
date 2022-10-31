package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    public static void switchWindowAndVerify(String expectedURL, String expectedInTitle){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {

            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedURL)){
                break;
            }

        }

        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertEquals(actualTitle, expectedInTitle);

    }

    public static void verifyTitle(String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }


    /**
     * this method will accept a String as expected value and verify actual URL contains the value.
     * @param expectedInURL
     */
    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }

    public static List<String> dropdowmOptionsAsString(WebElement dropdownElement){
        Select select = new Select(dropdownElement);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();


        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement){
            actualOptionsAsString.add(each.getText());
        }
        return actualOptionsAsString;
    }


    /**
     * This method will accept a group radio btns as a List of WebElement
     * It will loop through the List, and  click to radio btn with provided attributeValue
     * @param radioButtons
     * @param attributeValue
     */
    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){

        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }
    }
}
