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
        checkoutOverviewPage.clickFinish();
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
        checkoutOverviewPage.clickFinish();
        assertTrue(checkOutCompletePage.isOpenRight(), "Checkout failed");

    }

    @Test
    public void checkOutEmptyFields() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckoutButton();
        checkOutPage.fillInCheckout("", "", "");
        assertEquals(checkOutPage.getError(), "Error: First Name is required", "Error while checking out");

    }
    @Test
    public void checkOutEmptyFieldLastName() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckoutButton();
        checkOutPage.fillInCheckout("Rada", "", "");
        assertEquals(checkOutPage.getError(), "Error: Last Name is required", "Error while checking out");

    }
    @Test
    public void checkOutEmptyFieldZipCode() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckoutButton();
        checkOutPage.fillInCheckout("Rada", "Radan", "");
        assertEquals(checkOutPage.getError(), "Error: Postal Code is required", "Error while checking out");

    }
    @Test
    public void checkOutSpaceInFields() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckoutButton();
        checkOutPage.fillInCheckout(" ", " ", " ");
        assertEquals(checkOutPage.getError(), "Error: First Name is required", "Error while checking out");

    }
}


