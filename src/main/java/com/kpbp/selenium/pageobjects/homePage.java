package com.kpbp.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

    public static WebElement dashBoard;
    //h1[contains(text(),'Dashboard')]
    public static WebElement validateDashboard(WebDriver driver){

        dashBoard=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
        return dashBoard;
    }


}
