package com.facebook.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SetupPOF {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void DoSetup(){
        //CHROME
        System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com");
    }
}
