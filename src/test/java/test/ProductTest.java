package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ProductTest extends BaseTest {

    @Test
    public void productPriceShouldBeCorrect() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        assertEquals(cartPage.getProductPrice("Sauce Labs Backpack"), "$29.99",
                "Price is not correct");
    }
}
