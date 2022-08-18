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



    }
}
