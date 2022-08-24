package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CheckOutCompletePage;

import static org.testng.Assert.assertTrue;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutShouldPerform() {
        driver.get("https://www.saucedemo.com/cart.html");
        driver.findElement(By.linkText("Checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Rada");
        driver.findElement(By.id("last-name")).sendKeys("radan");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=continue]")).click();
        driver.findElement(By.id("finish")).click();
        boolean isOpened = driver.findElement(By.cssSelector(".complete-header")).isDisplayed();
        assertTrue(isOpened, "The page failed to open");
    }
  /*  @Test
    public void checkOutShouldBeCorrect() {

        checkOutPage.open();
        checkOutPage.checkOut("Rada", "Radan", "12345");
        assertTrue(checkOutCompletePage.isOpened(), "The page failed to open");


        /*driver.findElement(By.id("first-name")).sendKeys("Rada");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=continue]")).click();
        driver.findElement(By.id("finish")).click();
        boolean isOpened = driver.findElement(By.cssSelector(".complete-header")).isDisplayed();
*/
    }

