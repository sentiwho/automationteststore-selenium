package com.automationteststore.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StateDropDownWorkaround {
        private WebDriver driver;

     public StateDropDownWorkaround(WebDriver driver) {
        this.driver = driver;
    }


        public void fillStateFieldOnCheckout() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("THIS IS BECAOUSE OF SLEEP LINE IN StateDropDownWorkaround util class ");
        } 
            Select stateDropdown = new Select(driver.findElement(By.id("guestFrm_zone_id")));
            List<WebElement> options = stateDropdown.getOptions();
            if (options.size() > 1) {
                stateDropdown.selectByIndex(1);
            }
                    }
}
