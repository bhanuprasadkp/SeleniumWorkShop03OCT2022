package com.kpbp.selenium.base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

    public WebDriver driver;
    public WebDriver getDriverInstance(String browserType){
        switch (browserType){
            case "chrome":{
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            }
            case "edge":{
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            }
            case "firefox":{
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }

            case "default":{
                System.out.println("Invalid Browser Type, Select a valid value for Browser.");
                break;
            }
        }


        return driver;
    }

}
