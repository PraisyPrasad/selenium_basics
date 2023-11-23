package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserLaunch {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        String handel=driver.getWindowHandle();
        System.out.println(handel);
        String sourceCode=driver.getPageSource();
        System.out.println(sourceCode);
        driver.close();
    }
}
