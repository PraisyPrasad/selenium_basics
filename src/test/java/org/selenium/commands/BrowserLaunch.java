package org.selenium.commands;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BrowserLaunch {

    WebDriver driver;

    public void browser(String application) {
        if (application.equals("Chrome")) {
            driver = new ChromeDriver();

        } else if (application.equals("Edge")) {
            driver = new EdgeDriver();

        } else if (application.equals("Firefox")) {
            driver = new FirefoxDriver();

        } else {
            throw new RuntimeException("Invalid");
        }
        driver.manage().window().maximize();


    }

    public void closeBrowser() {
        //driver.close();
        driver.quit();
    }

    @BeforeMethod
    public void setup() {
        browser("Chrome");
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.FAILURE){
            takeScreenShort(result);
        }
        closeBrowser();
    }
    public void takeScreenShort(ITestResult result) throws IOException {
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File screenshort=takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshort,new File("./Screenshorts/"+result.getName()+".png"));//convert to png--folder called Screenshorts gets created
    }


}

