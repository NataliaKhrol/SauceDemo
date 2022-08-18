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

        /*
<button class="btn btn_primary btn_small btn_inventory"
    data-test="add-to-cart-sauce-labs-backpack"
    id="add-to-cart-sauce-labs-backpack"
    name="add-to-cart-sauce-labs-backpack">Add to cart</button>
        //button[text()='Add to cart']
        //div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item']//button
        //div[text()='Sauce Labs Backpack']//ancestor::div[@class='cart_item']//div[@class='inventory_item_price']
         */


    }
}
