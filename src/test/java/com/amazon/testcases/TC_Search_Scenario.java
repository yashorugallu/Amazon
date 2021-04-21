package com.amazon.testcases;

import com.amazon.pageObjects.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_Search_Scenario extends BaseTest{

    @Test
    public void searchAndCart() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().window().maximize();
        HomePage hp = new HomePage(driver);
        hp.enterSearchBox("qa testing for beginners");
        System.out.println("search string is successfully entered into search box");
        hp.clickSearchButton();
        System.out.println("search button is clicked successfully");
        Thread.sleep(3000);
//        WebElement we = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[4]/div[2]/a/span[1]/span[1]"));
//        String priceOnSearchPage = we.getText();
//        System.out.println("PriceOnSearchPage: "+priceOnSearchPage);
        hp.clickOnFirstElement();
        System.out.println("First element from the search result is successfully clicked");
        String  priceOnAddtoCartPage = driver.findElement(By.xpath("//*[@id=\"newBuyBoxPrice\"]")).getText();
        System.out.println("PriceOnAddToCartPage: "+priceOnAddtoCartPage);
        hp.clickOnAddToCart();
        System.out.println("item is successfully added to cart");
        String priceOnproceedToCheckout = driver.findElement(By.xpath("//*[@id=\"hlb-subcart\"]/div[1]/span/span[2]")).getText();
        System.out.println("PriceOnProceedToCheckOutPage: "+priceOnproceedToCheckout);
        Assert.assertEquals("Price validation cart Page vs checkout page", priceOnAddtoCartPage, priceOnproceedToCheckout);
        hp.clickOnProceedToCheckOutButton();
        System.out.println("Proceed to checkout button is successfully clicked");
    }
}
