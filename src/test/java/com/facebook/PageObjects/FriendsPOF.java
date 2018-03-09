package com.facebook.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FriendsPOF {
    WebDriver driver;

    public FriendsPOF(WebDriver driver){
        this.driver = driver;
    }
    @FindBy (xpath = "//*[@data-click='profile_icon']")
    WebElement profile;

    @FindBy (xpath = "//a[@data-tab-key='friends']")
     WebElement friends;

    @FindBy (className = "uiList _262m _4kg")
    WebElement friendsList;

    public void GoToFriends(){
        profile.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(friends));
        friends.click();
        friendsList.click();
    }
}
