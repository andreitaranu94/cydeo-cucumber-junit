package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Etsy_StepDefinitions {
    EtsySearchPage etsySearchPage = new EtsySearchPage();


    @Then("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {

        String expectedTitle = "Etsy";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not expected!", expectedTitle, actualTitle);

    }


    @Given("User is on etsy")
    public void user_is_on_https_www_etsy_com() {

        Driver.getDriver().get("https://www.etsy.com");

    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.searchBox.sendKeys("Wooden Spoon"+ Keys.ENTER);
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {

        etsySearchPage.searchButton.click();
    }

@Then("User sees Wooden Spoon is in the title")
    public void user_sees_Wooden_Spoon_is_in_the_title(){

    String expectedTitle = "Etsy";
    String actualTitle = Driver.getDriver().getTitle();

    Assert.assertEquals("Title is not expected!", expectedTitle, actualTitle);

}


}
