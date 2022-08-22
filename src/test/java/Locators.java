import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends BaseTest {

    @Test
    public void productTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("login-button"));
        driver.findElement(By.name("password"));
        driver.findElement(By.className("inventory_item"));
        driver.findElement(By.cssSelector("a"));
        driver.findElement(By.linkText("Twitter"));
        driver.findElement(By.cssSelector("a"));
        driver.findElement(By.cssSelector(".inventory"));
        driver.findElement(By.cssSelector(".social.title"));
        driver.findElement(By.cssSelector(".bm .icon"));
        driver.findElement(By.cssSelector("page_wrapper"));
        driver.findElement(By.cssSelector("li"));
        driver.findElement(By.cssSelector("li.social"));
        driver.findElement(By.cssSelector("li[class=social]"));
        driver.findElement(By.cssSelector("class~=list"));
        driver.findElement(By.cssSelector("script[src^='static']"));
        driver.findElement(By.cssSelector("link[href$=css]"));
        driver.findElement(By.xpath("//button[@data-test='remove-sauce-labs-bike-light']"));
        driver.findElement(By.xpath("//button[text()='Remove']"));
        driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]"));
    }
}
