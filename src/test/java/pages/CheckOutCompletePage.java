package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage extends BasePage {

    // public static boolean isOpened;
    private final By PAGE_COMPLETE = By.cssSelector(".complete-header");

   public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + ".checkout-complete");
    }

    public boolean isOpened() {
        return driver.findElement(PAGE_COMPLETE).isDisplayed();
    }
}