package com.automationteststore.tests;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import com.automationteststore.base.BaseTest;
import com.automationteststore.pageobjects.CartPage;
import com.automationteststore.pageobjects.MainPage;
import com.automationteststore.utils.SeleniumUtils;

public class CartTest extends BaseTest {

    @Test
    public void addFourProductsToCartAndSuccessCheckout() {
        MainPage mainPage = new MainPage(driver);
        CartPage cartPage = new CartPage(driver);

        List<WebElement> titles = mainPage.getMainPageTitles();
        List<WebElement> addToCartButtons = mainPage.getAddToCartButtons();

        SeleniumUtils.scrollToElement(driver, titles.get(0));
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 0);
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 1);

        SeleniumUtils.scrollToElement(driver, titles.get(1));
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 4);
        SeleniumUtils.clickButtonFromList(driver, addToCartButtons, 5);

        SeleniumUtils.scrollToElement(driver, mainPage.getCartButton());
        mainPage.getCartButton().click();

        int productsAmount = cartPage.getCartProductRows().size();
        assertEquals(4, productsAmount, "Cart supposed to contain 4 items");

        cartPage.getCheckoutButton().click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
