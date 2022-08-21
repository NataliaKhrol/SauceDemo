package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SaucedemoInventoryTest extends BaseTest {
    public SaucedemoInventoryTest() {
        super("https://www.saucedemo.com/inventory.html");

    }
    @BeforeClass
    public void login() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test
    public void findByClassName() {
      //  System.out.println(driver.getPageSource());
        WebElement el =  driver.findElement(By.className("inventory_item"));
        Assert.assertNotNull(el);
    }

    @Test
    public void findByCssClassName() {

        WebElement el = driver.findElement(By.cssSelector(".inventory_item"));
        Assert.assertNotNull(el);
    }

   // @Test
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
