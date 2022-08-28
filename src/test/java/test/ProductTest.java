package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
}
/*ƒима, сорри, но можно € не буду удал€ть эти ниже закоментированные черновики? это был путь поиска ошибок
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