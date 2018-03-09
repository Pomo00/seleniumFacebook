package automationFramework;

import com.facebook.PageObjects.FriendsPOF;
import com.facebook.PageObjects.LoginPOF;
import com.facebook.PageObjects.LogoutPOF;
import com.facebook.PageObjects.SetupPOF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginAndLogOut {

    WebDriver driver;
    LoginPOF loginPage;
    LogoutPOF logoutPage;
    FriendsPOF friendsPage;

    @BeforeClass
    public void beforeMethod(){
        SetupPOF setupPof = new SetupPOF();
        setupPof.DoSetup();
        driver = setupPof.getDriver();
        loginPage = PageFactory.initElements(driver, LoginPOF.class);
        logoutPage = PageFactory.initElements(driver, LogoutPOF.class);
        friendsPage = PageFactory.initElements(driver, FriendsPOF.class);
    }

    @Test
    public void test(){
        loginPage.LoginAction("testoweyeti@gmail.com", "0-=op[l;'");
        logoutPage.LogoutAction();
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
