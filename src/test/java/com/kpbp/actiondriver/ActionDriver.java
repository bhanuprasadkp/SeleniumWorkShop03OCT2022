package com.kpbp.actiondriver;

import com.kpbp.selenium.base.Base;
import com.kpbp.selenium.pageobjects.homePage;
import com.kpbp.selenium.pageobjects.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver.Timeouts;

import javax.swing.plaf.basic.DefaultMenuLayout;

public class ActionDriver {

    String browserType="chrome"; // edge/ firefox/ chrome
    public WebDriver driver;
    public WebElement element;

    String url ="https://acme-test.uipath.com/login";
    String txtEmail="bhanuprasadkp@outlook.com";
    String txtPassword="TestersMindSet@12345";
    String strActualResult;

    void setUpApplication(){
        Base driverInstance = new Base();
        driver = driverInstance.getDriverInstance(browserType);
        System.out.println("WebDriver instance is created ");
    }
    @Test(priority = 1)
    void openApplication(){
        setUpApplication();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //driver.quit();

    }

    @Test(priority = 2)
    void loginToApplication()  {
        loginPage login = new loginPage();
        element = login.email(driver);
        element.sendKeys(txtEmail);
        element = login.password(driver);
        element.sendKeys(txtPassword);
        element=login.login(driver);
        element.click();
        element= homePage.validateDashboard(driver);
        strActualResult=element.getText();
        Assert.assertEquals(strActualResult, "Dashboard");
    }

    @Test(priority = 3)
    public void logOutOfApplication(){
        homePage home=new homePage();
        element = home.validateDashboard(driver);
        element.click();
    }

    @Test(priority = 4)
    public void closeApplication(){
        driver.quit();
    }

}
