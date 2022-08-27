package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkOutShouldBeCorrect() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckoutButton();
        checkOutPage.fillInCheckout("Rada", "Radan", "12345");
        assertTrue(checkoutOverviewPage.isOpened(), "The page failed to open");
        checkoutOverviewPage.finishBut();
        assertTrue(checkOutCompletePage.isOpenRight(), "Checkout failed");

    }

    @Test
    public void getTotalShouldBeCorrect() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckoutButton();
        checkOutPage.fillInCheckout("Rada", "Radan", "12345");
        assertTrue(checkoutOverviewPage.isOpened(), "The page failed to open");
        assertEquals(checkoutOverviewPage.getItemCost(), "Item total: $29.99", "Item total error");
        assertEquals(checkoutOverviewPage.getTax(), "Tax: $2.40", "Tax error");
        assertEquals(checkoutOverviewPage.getTotal(), "Total: $32.39", "Total error");
        checkoutOverviewPage.finishBut();
        assertTrue(checkOutCompletePage.isOpenRight(), "Checkout failed");

    }
}



