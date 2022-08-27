package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsPage extends BasePage {

    private final By PAGE_TITLE = By.cssSelector(".title");
    private By FILTER_BUTTON = By.cssSelector(".active_option");


    public ProductsPage(WebDriver driver) {

        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "inventory.html");
    }

    public boolean isOpened() {
        return waitForVisibility(PAGE_TITLE);
        //driver.findElement(PAGE_TITLE).isDisplayed();

    }

    public void addToCart(String product) {
        String locator = String.format("//*[text()='%s']//ancestor::div[@class='inventory_item']//button",
                product);

        driver.findElement(By.xpath(locator)).click();
    }
    public void chooseFilter() {
        WebElement element = driver.findElement(FILTER_BUTTON);
        Select dropDown = new Select(element);
        List<WebElement> option = dropDown.getOptions();
        int size = option.size();
        for (int i = 0; i < size; i++) {
            String options = option.get(i).getText();
            System.out.println(options);
        }
    }

}

    // проверить наличие всех элементов дроп-дауна


