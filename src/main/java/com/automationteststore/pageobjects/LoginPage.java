package com.automationteststore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private final By guestCheckoutRadioButton = By.id("accountFrm_accountguest");
    private final By continueButton = By.cssSelector("button[title='Continue']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGuestCheckoutRadioButton() {
        driver.findElement(guestCheckoutRadioButton).click();
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
}
