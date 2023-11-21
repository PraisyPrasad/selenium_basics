package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
         driver.get("https://www.saucedemo.com/");
       String pageTitle = driver.getTitle();
       System.out.println(pageTitle);
        String currentUrl = driver.getCurrentUrl();
       System.out.println(currentUrl);
        String handleId = driver.getWindowHandle();
        System.out.println(handleId);
        String pageSource = driver.getPageSource();
       System.out.println(pageSource);
       driver.close();
    }
}
