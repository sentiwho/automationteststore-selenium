package com.automationteststore.tests;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automationteststore.base.BaseTest;
import com.automationteststore.utils.SeleniumUtils;

public class CartTest extends BaseTest {

    @Test
    public void addFourProductsToCartAndSuccessCheckout() { 
        List<WebElement> mainpageTitles = driver.findElements(By.tagName("h1")); 
        List<WebElement> addToCartButtons = driver.findElements(By.cssSelector(".fa-cart-plus"));
        WebElement cartButton =  driver.findElement(By.cssSelector("a[href*='checkout/cart']"));    


        SeleniumUtils.scrollToElement(driver, mainpageTitles.get(0));
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 0);
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 1);

        SeleniumUtils.scrollToElement(driver, mainpageTitles.get(1));
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 4);
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 5);
     
       SeleniumUtils.scrollToElement(driver, cartButton);
       cartButton.click();
       WebElement cartTable = driver.findElement(By.cssSelector("table.table-bordered"));
        List<WebElement> allRows = cartTable.findElements(By.cssSelector("tr"));
        List<WebElement> productRows = allRows.subList(1, allRows.size());
        int productsAmount = productRows.size();

        assertEquals(4, productsAmount, "Cart supposed to contain 4 items");


       driver.findElement(By.id("cart_checkout1")).click();
        
        
        
        try {
            Thread.sleep(1000011);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}