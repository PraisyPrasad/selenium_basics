package org.selenium.automationcore;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class Base {
    public WebDriver driver;

    public void initializeBrowser(String browser) {
        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Invalid Browser");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser","baseurl"})
    public void setup(String browserName,String url) {
        initializeBrowser(browserName);
        driver.get(url);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.FAILURE) {
            takeScreenshot(result);
        }
        driver.close();
    }
    public void takeScreenshot(ITestResult result) throws IOException {
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File screenshot=takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("./Screenshots/"+result.getName()+".png"));

    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("Connect the database before the suite");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("Connect the database after the suite");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("Condition needs to be run before the test run");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("Condition needs to be run after the test run");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("Condition needs to be run before the class run");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("Condition needs to be run after the class run");
    }


}
