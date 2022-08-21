package locators;

import locators.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaucedemoTest extends BaseTest {
    public SaucedemoTest() {
        super("https://www.saucedemo.com/");
    }

    @Test
    public void findLoginButtonByID() {

        WebElement el = driver.findElement(By.id("login-button"));
        Assert.assertNotNull(el);
    }

    @Test
    public void findLoginButtonByCss() {

        WebElement el = driver.findElement(By.cssSelector("#login-button"));
        Assert.assertNotNull(el);
    }
    @Test
    public void findPasswordFieldByName() {

        WebElement el = driver.findElement(By.name("password"));
        Assert.assertNotNull(el);
    }

 //   @Test
    public void productTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("login-button"));
        driver.findElement(By.cssSelector("#login-button"));
        driver.findElement(By.name("password"));
        driver.get("https://www.saucedemo.com/inventory.html");
        driver.findElement(By.className("inventory_item")); // почему не work
        driver.findElement(By.cssSelector(".inventory_item"));
        // driver.findElement(By.tagName("span")); //?
        driver.findElement(By.linkText("https://www.linkedin.com/company/sauce-labs/"));
        driver.findElement(By.partialLinkText("Twitter"));
        driver.findElement(By.cssSelector("a"));
        driver.findElement(By.cssSelector(".inventory"));
        driver.findElement(By.cssSelector(".social.title"));
        driver.findElement(By.cssSelector(".bm .icon"));
        driver.findElement(By.cssSelector("page_wrapper"));
        driver.findElement(By.cssSelector("li"));
        driver.findElement(By.cssSelector("li.social")); //??
        driver.findElement(By.cssSelector("li[class=social]"));
        driver.findElement(By.cssSelector("class~=list"));
        driver.findElement(By.cssSelector("script[src^='static']")); //???????
        driver.findElement(By.cssSelector("link[href$=css]"));
/*
https://comaqa.gitbook.io/selenium-webdriver-lectures/selenium-webdriver.-slozhnye-voprosy./lokatory.-css-xpath-jquery.
https://html5css.ru/cssref/css_selectors.php
https://habr.com/ru/company/skyeng/blog/588282/
https://flukeout.github.io/
 */


    }
}
