package com.automationteststore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationteststore.models.BillingInfo;

public class GuestCheckoutPage {
      private WebDriver driver; 

       public GuestCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillBillingForm(BillingInfo info) {
    driver.findElement(By.id("guestFrm_firstname")).sendKeys(info.getFirstName());
    driver.findElement(By.id("guestFrm_lastname")).sendKeys(info.getLastName());
    driver.findElement(By.id("guestFrm_email")).sendKeys(info.getEmail());
    driver.findElement(By.id("guestFrm_telephone")).sendKeys(info.getTelephone());
    driver.findElement(By.id("guestFrm_fax")).sendKeys(info.getFax());
    driver.findElement(By.id("guestFrm_company")).sendKeys(info.getCompany());
    driver.findElement(By.id("guestFrm_address_1")).sendKeys(info.getAddress1());
    driver.findElement(By.id("guestFrm_address_2")).sendKeys(info.getAddress2());
    driver.findElement(By.id("guestFrm_city")).sendKeys(info.getCity());
    driver.findElement(By.id("guestFrm_postcode")).sendKeys(info.getZip());
    
    Select countrySelect = new Select(driver.findElement(By.id("guestFrm_country_id")));
    countrySelect.selectByVisibleText(info.getCountry());
    
}

    public void clickConfirmOrderButton() {
       WebElement сonfirmOrderButton = driver.findElement(By.id("checkout_btn"));
       сonfirmOrderButton.click();
    }

}
