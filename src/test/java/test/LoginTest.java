package test;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void loginSuccess() {
        loginPage
                .open()
                .login("standard_user", "secret_sauce");

        assertTrue(productsPage.isOpened(), "Login failed");
    }

    @Test
    public void wrongPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("standard_user", "gnhcgmi");
        assertEquals(loginPage.getError(),
                "Epic sadface: Username and password do not match any user in this service",
                "Wrong error message shown");
    }

    @Test
    public void emptyUserName() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("", "secret_sauce");
        // String error = driver.findElement(By.cssSelector("[data-test=error]")).getText();
        assertEquals(loginPage.getError(), "Epic sadface: Username is required", "Wrong error message shown");
    }

    @Test(dataProvider = "loginData") //имя из строки 49
    public void negativeLogin(String userName, String password, String error) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(userName, password);
        assertEquals(loginPage.getError(), error, " Wrong error message shown");
    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "gnhcgmi", "Epic sadface: Username and password do not match" +
                        " any user in this service"},
                {"", "secret_sauce", "Epic sadface: Username is required"}
        };
    }

}
