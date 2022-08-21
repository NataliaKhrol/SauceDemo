import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productPriceShouldBeCorrect() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item']//button"));
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::div[@class='cart_item']//div[@class='inventory_item_price']")).getText();

    }
}
