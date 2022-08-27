package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage extends BasePage {

    private final By PAGE_COMPLETE = By.tagName("h2");

    public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpenRight() {

        return driver.findElement(PAGE_COMPLETE).isDisplayed();
    }

}