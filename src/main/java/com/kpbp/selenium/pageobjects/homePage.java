package com.kpbp.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

    public static WebElement dashBoard;
    public static WebElement logout;

   //h1[contains(text(),'Dashboard')]
    public static WebElement validateDashboard(WebDriver driver){

        dashBoard=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
        return dashBoard;
    }


    public static WebElement logOutApplication(WebDriver driver){

        logout=driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
        return logout;
    }
}
