package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public static final String BASE_URL = "https://www.saucedemo.com/";
    private final By CART = By.id("shopping_cart_container");

    BasePage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void clickCart() {
        clickJS(CART);

        driver.findElement(CART).click();
    }
    public boolean waitForVisibility(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
        //NoSuchElementException
        //TimeOutException
    }

}//это для heroku
public void clickJS(By locator) {
    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(locator))
            .keyDown("0")

    ( (JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(locator));

}