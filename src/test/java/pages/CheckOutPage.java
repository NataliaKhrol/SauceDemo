package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class CheckOutPage extends BasePage {


    private By FIRSTNAME_INPUT = By.id("first-name");
    private By LASTNAME_INPUT = By.id("last-name");
    private By ZIPCODE_INPUT = By.id("postal-code");
    private By CONTINUE_BUTTON = By.cssSelector("[data-test=continue]");
    private final By PAGE_TITLE = By.xpath("//span[text()='Checkout: Overview']");


    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "checkout-step-one.html");

    }

    public boolean isOpened() {
        return driver.findElement(PAGE_TITLE).isDisplayed();
    }

    public void informationShouldBeFilledIn(String firstName, String lastName, String zipCode) {

        driver.findElement(FIRSTNAME_INPUT).sendKeys(firstName);
        driver.findElement(LASTNAME_INPUT).sendKeys(lastName);
        driver.findElement(ZIPCODE_INPUT).sendKeys(zipCode);
        driver.findElement(CONTINUE_BUTTON).click();

    }

}
