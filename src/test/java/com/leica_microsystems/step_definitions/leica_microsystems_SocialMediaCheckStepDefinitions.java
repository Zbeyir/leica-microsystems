package com.leica_microsystems.step_definitions;

import com.leica_microsystems.pages.BasePage;
import com.leica_microsystems.utilities.BrowserUtils;
import com.leica_microsystems.utilities.ConfigurationReader;
import com.leica_microsystems.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class leica_microsystems_SocialMediaCheckStepDefinitions {

    BasePage basePage = new BasePage();

    @When("user is on the leica microsystems Page")
    public void user_is_on_the_leica_microsystems_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(2);

    }

    @When("user accept Cookies")
    public void user_accept_cookies() {
        basePage.cookiesAkzeptieren.click();
        BrowserUtils.sleep(2);
    }

    @When("user click linkedin Link")
    public void user_click_linkedin_link() {
        basePage.linkedinLink.click();
        BrowserUtils.sleep(2);



    }

    @Then("check user on the linkedin WebSite")
    public void check_user_on_the_facebook_web_site() {

        Assert.assertTrue(BrowserUtils.linkcheck().contains("linkedin"));
    }

    @When("user click instagram Link")
    public void user_click_instagram_link() {
        basePage.instagram.click();
    }

    @Then("check user on the instagram WebSite")
    public void check_user_on_the_instagram_web_site() {

        Assert.assertTrue(BrowserUtils.linkcheck().contains("instagram"));
    }

    @When("user click YouTube Link")
    public void user_click_you_tube_link() {
        basePage.youtube.click();
    }

    @Then("check user on the YouTube WebSite")
    public void check_user_on_the_you_tube_web_site() {
        Assert.assertTrue(BrowserUtils.linkcheck().contains("youtube"));
    }


}