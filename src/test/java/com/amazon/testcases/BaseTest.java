package com.amazon.testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;
    public String baseUrl = "https://www.amazon.com";

    @BeforeClass
    public static void  setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/yashswathi/IdeaProjects/Amazon/Drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
