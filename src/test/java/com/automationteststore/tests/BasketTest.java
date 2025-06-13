package com.automationteststore.tests;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automationteststore.base.BaseTest;
import com.automationteststore.utils.SeleniumUtils;

public class BasketTest extends BaseTest {

    @Test
    public void sampleTest() {
        List<WebElement> mainpageTitles = driver.findElements(By.tagName("h1")); 
        List<WebElement> addToCartButtons = driver.findElements(By.cssSelector(".fa-cart-plus"));

        SeleniumUtils.scrollToElementFromList(driver, mainpageTitles.get(0));
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 0);
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 1);

        SeleniumUtils.scrollToElementFromList(driver, mainpageTitles.get(1));
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 4);
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 5);
     
        
        try {
            Thread.sleep(1000011);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}