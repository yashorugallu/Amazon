package com.amazon.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver ldriver;
   public HomePage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(id="twotabsearchtextbox")
    WebElement searchBox ;

    @FindBy(id="nav-search-submit-button")
    WebElement searchButton;

    @FindBy(xpath = "//div[@data-index=\"1\"]//a")
    WebElement searchElement;

    @FindBy(id="add-to-cart-button")
    WebElement addToCartButton;

    @FindBy(xpath="//a[@id=\"hlb-ptc-btn-native\"]")
    WebElement proceedToCheckoutButton;

    public void enterSearchBox(String searchString){
        searchBox.sendKeys(searchString);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void clickOnFirstElement(){
        searchElement.click();
    }

    public void clickOnAddToCart(){
        addToCartButton.click();
    }

    public void clickOnProceedToCheckOutButton(){
        proceedToCheckoutButton.click();
    }
}
