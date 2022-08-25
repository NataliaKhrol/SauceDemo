package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutSecondStepPage extends BasePage {

    private By FINISH_BUTTON = By.id("finish");

    public CheckoutSecondStepPage(WebDriver driver) {
        super(driver);
    }

    public void finishBut() {

        driver.findElement(FINISH_BUTTON).click();
    }

}
