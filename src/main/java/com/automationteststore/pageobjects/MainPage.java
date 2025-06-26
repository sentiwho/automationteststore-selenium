package com.automationteststore.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getMainPageTitles() {
        return driver.findElements(By.tagName("h1"));
    }

    public List<WebElement> getAddToCartButtons() {
        return driver.findElements(By.cssSelector(".fa-cart-plus"));
    }

    // Тут надо оставить геттер кнопки, так как прокручиваем на нее как на элемент в тесте 1
    public WebElement getCartButton() {
        return driver.findElement(By.cssSelector("a[href*='checkout/cart']"));
    }
}   
