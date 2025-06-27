package com.automationteststore.tests;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import com.automationteststore.base.BaseTest;
import com.automationteststore.models.BillingInfo;
import com.automationteststore.pageobjects.CartPage;
import com.automationteststore.pageobjects.GuestCheckoutPage;
import com.automationteststore.pageobjects.LoginPage;
import com.automationteststore.pageobjects.MainPage;
import com.automationteststore.utils.SeleniumUtils;
import com.automationteststore.utils.StateDropDownWorkaround;

public class AddFourProductsAndCompleteGuestCheckout extends BaseTest {

    @Test
    public void addFourProductsToCartAndSuccessCheckout() {
        // try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        //     System.out.println("THE REASON SLEEP LINE WONT MAKE IT SLEEP1");
        // }
        MainPage mainPage = new MainPage(driver);
        CartPage cartPage = new CartPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        GuestCheckoutPage guestCheckoutPage = new GuestCheckoutPage(driver);

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

        cartPage.clickCheckoutButton();

        loginPage.clickGuestCheckoutRadioButton();
        loginPage.clickContinueButton();

        //Иногда выкидывает на этом месте из за пулла стран фейкера(несовпадают названия на сайте и в пулле)
        BillingInfo billing = new BillingInfo();
        guestCheckoutPage.fillBillingForm(billing);
       
        StateDropDownWorkaround state = new StateDropDownWorkaround(driver);
     
        state.fillStateFieldOnCheckout();

        // Селектор такой же как и на странице логина, по этому переиспользую
        loginPage.clickContinueButton();
       guestCheckoutPage.clickConfirmOrderButton();
    } 
}
