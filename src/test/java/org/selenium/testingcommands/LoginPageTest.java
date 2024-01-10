package org.selenium.testingcommands;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.selenium.automationcore.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.constants.Constants;
import org.selenium.constants.Messages;
import org.selenium.dataprovider.DataProviders;
import org.selenium.listeners.ExtentListener;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelUtility;
import utilities.WebElementUtility;

import java.util.ArrayList;
public class LoginPageTest extends Base {
    ThreadLocal<ExtentTest> extentTest = ExtentListener.getTestInstance();
    @Test(priority = 5,groups = {"Smoke"})
    public void verifyLoginPageTitle() {
        extentTest.get().assignCategory("Smoke");
        extentTest.get().log(Status.PASS, "URL Loaded successfully");
        WebElement loginField = driver.findElement(By.xpath("//a[@class='ico-login']"));
        WebElementUtility.clickOnElement(loginField);
        String actualpageTitle = driver.getTitle();
        extentTest.get().log(Status.PASS, "LoginPage Title received  successfully");
        ArrayList<String> data = ExcelUtility.readData(Constants.TEST_DATA_EXCEL_PATH, Constants.LOGIN_PAGE);
        extentTest.get().log(Status.PASS, "Expected title recieved from Excel");
        String expectedResult = data.get(1);
        extentTest.get().log(Status.PASS, "Data in row 0 , column 1 is received from Excel");
        Assert.assertEquals(actualpageTitle, expectedResult, Messages.TITLE_MISMATCH);
    }
    @Test(priority = 6,groups = {"Smoke","Regression"})//,groups = {"Smoke","Regression"})
    public void verifyUserLogin() {
        extentTest.get().assignCategory("Smoke");
        extentTest.get().log(Status.PASS, "URL Loaded successfully");
        WebElement loginField = driver.findElement(By.xpath("//a[@class='ico-login']"));
        WebElementUtility.clickOnElement(loginField);
        WebElement emailField = driver.findElement(By.id("Email"));
        WebElementUtility.enterValue(emailField,"praisyprasad123@gmail.com");
        WebElement passwordField = driver.findElement(By.id("Password"));
        WebElementUtility.enterValue(passwordField,"Automation@2023");
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        WebElementUtility.clickOnElement(loginButton);
        WebElement loggedAccount = driver.findElement(By.xpath("//a[@class='account']"));
        String actualResult = WebElementUtility.getTextFromElement(loggedAccount);
        extentTest.get().log(Status.PASS, "Logged in successfully");
        String expectedResult = "praisyprasad123@gmail.com";
        Assert.assertEquals(actualResult, expectedResult, Messages.LOGIN_FAILED);
    }
    @Test(priority = 7,dataProvider = "InvalidUserCredentials",groups = {"Sanity"},dataProviderClass = DataProviders.class)
    public void verifyUserLoginWithInvalidValidation(String userName,String password) {
        extentTest.get().assignCategory("Sanity");
        extentTest.get().log(Status.PASS, "URL Loaded successfully");
        WebElement loginField = driver.findElement(By.xpath("//a[@class='ico-login']"));
        WebElementUtility.clickOnElement(loginField);
        WebElement emailField = driver.findElement(By.id("Email"));
        ArrayList<String> data = ExcelUtility.readData(Constants.TEST_DATA_EXCEL_PATH, Constants.LOGIN_PAGE);
        WebElementUtility.enterValue(emailField,userName);
        WebElement passwordField = driver.findElement(By.id("Password"));
        WebElementUtility.enterValue(passwordField,password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        WebElementUtility.clickOnElement(loginButton);
        WebElement actualMessage = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        String actualMessageText = WebElementUtility.getTextFromElement(actualMessage);
        String expectedMessageText = data.get(6);
        Assert.assertEquals(actualMessageText, expectedMessageText, Messages.LOGIN_FAILED_WARNINGMESSAGE_NOTFOUND);
    }
}
