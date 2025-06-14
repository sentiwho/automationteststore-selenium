package com.automationteststore.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCartProductRows() {
        WebElement cartTable = driver.findElement(By.cssSelector("table.table-bordered"));
        List<WebElement> allRows = cartTable.findElements(By.cssSelector("tr"));
        // Пропускаем заголовок
        return allRows.subList(1, allRows.size());
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.id("cart_checkout1"));
    }
}
