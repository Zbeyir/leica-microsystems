package com.leica_microsystems.pages;

import com.leica_microsystems.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookiesAkzeptieren;

    @FindBy(xpath = "//a[contains(@href, 'youtube')]")
    public WebElement youtube;

    @FindBy(xpath = "//a[contains(@href, 'instagram')]")
    public WebElement instagram;


    @FindBy(xpath = "//a[contains(@href, 'linkedin')]")
    public WebElement linkedinLink;


}

