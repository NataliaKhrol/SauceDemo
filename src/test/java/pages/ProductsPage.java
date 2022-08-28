package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class ProductsPage extends BasePage {

    private final By PAGE_TITLE = By.cssSelector(".title");
    private By FILTER_BUTTON = By.cssSelector(".product_sort_container");
    WebElement element;
    Select select;


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

    public void selectButton() {
        element = driver.findElement(FILTER_BUTTON);
        select = new Select(element);
    }

    public void findAllElementsOfDropdown() {
        List<WebElement> option = select.getOptions();
        int size = option.size();
        for (int i = 0; i < size; i++) {
            String options = option.get(i).getText();
            System.out.println(options);
        }
    }

    public void visibleText(String optionName) {
        select.selectByVisibleText(optionName);
    }

    public boolean isSelected() {
        return select.getFirstSelectedOption().isSelected();
    }
}


// проверить наличие всех элементов дроп-дауна

