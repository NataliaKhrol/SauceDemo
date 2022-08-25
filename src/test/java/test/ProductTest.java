package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class ProductTest extends BaseTest {

    @Test
    public void productPriceShouldBeCorrect() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        assertTrue(cartPage.isOpened());
        assertEquals(cartPage.getProductPrice("Sauce Labs Backpack"), "$29.99",
                "Price is not correct");
    }
}
