package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.*;


public class ProductTest extends BaseTest {

    @Test
    public void productPriceShouldBeCorrect() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        assertTrue(cartPage.isOpened());
        assertEquals(cartPage.getProductPrice("Sauce Labs Backpack"), "$29.99",
                "Price is not correct");
    }

    @Test
    public void elementsOfDropdownExist() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
        productsPage.selectButton();
        productsPage.findAllElementsOfDropdown();
    }

    @Test
    public void chooseOption1() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
        productsPage.selectButton();
        productsPage.visibleText("Name (Z to A)");
        productsPage.selectButton();
        assertTrue(productsPage.isSelected(), "Option is not selected");
    }

    @Test
    public void chooseOption2() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
        productsPage.selectButton();
        productsPage.visibleText("Name (A to Z)");
        productsPage.selectButton();
        assertTrue(productsPage.isSelected(), "Option is not selected");
    }

    @Test
    public void chooseOption3() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
        productsPage.selectButton();
        productsPage.visibleText("Price (low to high)");
        productsPage.selectButton();
        assertTrue(productsPage.isSelected(), "Option is not selected");
    }

    @Test
    public void chooseOption4() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
        productsPage.selectButton();
        productsPage.visibleText("Price (high to low)");
        productsPage.selectButton();
        assertTrue(productsPage.isSelected(), "Option is not selected");
    }

    @Test
    public void socialMediaButton() {

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
        driver.findElement(By.linkText("Twitter")).click();
        productsPage.socialMediaCheck();
        productsPage.socialMediaCheck();
        assertTrue(productsPage.isOpen(), "Does not");
    }

    @Test
    public void socialMediaButton2() {

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
        driver.findElement(By.linkText("Facebook")).click();
        productsPage.socialMediaCheck();
    }

    @Test
    public void socialMediaButton3() {

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
        driver.findElement(By.linkText("LinkedIn")).click();
        productsPage.socialMediaCheck();


    }
}


/*����, �����, �� ����� � �� ���� ������� ��� ���� ����������������� ���������? ��� ��� ���� ������ ������
    @Test
    public void chooseOption2() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());

        //WebElement element = driver.findElement(By.xpath("//span[contains(@class, 'select_container')]"));
        WebElement element = driver.findElement(By.cssSelector(".product_sort_container"));
        // System.out.println(element.getTagName());
        // System.out.println(element);
        Select select = new Select(element);
        select.selectByVisibleText("Name (Z to A)");

        element = driver.findElement(By.cssSelector(".product_sort_container"));
        select = new Select(element);
        boolean isSelected = select.getFirstSelectedOption().isSelected();
        assertTrue(isSelected, "Option is not selected");
    }
}
      /*  WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'@saucelabs')]")));
        Set<String> allHandles = driver.getWindowHandles();
        String url = driver.switchTo().window("1").getCurrentUrl();
        assertEquals(url, "https://twitter.com/saucelabs", "Error");



/*

            select.selectByVisibleText("Name (Z to A)");
    boolean isSelected2 = select.getFirstSelectedOption().isSelected();

    assertTrue(isSelected2, "Option is not selected");
}
    }
            }

/*
select.selectByVisibleText("Price (high to low)");
            boolean isSelected3 = select.getFirstSelectedOption().isSelected();
            Assert.assertTrue(isSelected3, "Option is not selected");
            select.selectByVisibleText("Price (low to high)");
            boolean isSelected4 = select.getFirstSelectedOption().isSelected();
            Assert.assertTrue(isSelected4, "Option is not selected");
 */