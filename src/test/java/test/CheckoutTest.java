package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CheckOutCompletePage;

import static org.testng.Assert.assertTrue;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkOutShouldBeCorrect() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckoutButton();
        checkOutPage.informationShouldBeFilledIn("Rada", "Radan", "12345");
        assertTrue(checkOutPage.isOpened(), "The page failed to open");
        checkoutSecondStepPage.finishBut();
        assertTrue(checkOutCompletePage.isOpenRight(), "Checkout failed");

    }
}



