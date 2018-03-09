package com.facebook.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LogoutPOF {
    final WebDriver driver;

    public LogoutPOF(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id = "userNavigationLabel")
    public WebElement Menu;

    @FindBy(className = "_54nc")
    public WebElement Logout;

    public void LogoutAction(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Menu.click();
        Logout.click();
    }
}
