package com.automationteststore;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasketTest extends BaseTest {

    @Test
    public void sampleTest() {
        List<WebElement> h1elements = driver.findElements(By.tagName("h1")); 
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start'})", h1elements.get(0));

        List<WebElement> tobasketbuttons = driver.findElements(By.cssSelector(".fa-cart-plus"));
        tobasketbuttons.get(0).click();
        tobasketbuttons.get(1).click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start'})", h1elements.get(1));
        tobasketbuttons.get(4).click();
        tobasketbuttons.get(5).click();
        
        
        try {
            Thread.sleep(1000011);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}