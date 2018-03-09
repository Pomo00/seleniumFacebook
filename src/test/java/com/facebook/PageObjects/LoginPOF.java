package com.facebook.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPOF {
    WebDriver driver;

    public LoginPOF(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id ="email")
    @CacheLookup
    public WebElement login;

    @FindBy (name ="pass")
    @CacheLookup
    public WebElement password;

    @FindBy (id ="loginbutton")
    @CacheLookup
    public WebElement submit;


    public void LoginAction(String sLogin, String sPassword){
        login.sendKeys(sLogin);
        password.sendKeys(sPassword);
        submit.click();
    }
}
