package org.selenium.testingcommands;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.automationcore.Base;
import org.selenium.constants.Constants;
import org.selenium.constants.Messages;
import org.selenium.listeners.ExtentListener;
import org.selenium.retryanalyzer.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AppUtility;
import utilities.ExcelUtility;
import java.util.ArrayList;
import java.util.List;


public class HomePageTest extends Base {
    ThreadLocal<ExtentTest> extentTest = ExtentListener.getTestInstance();
    @Test(priority = 1,enabled = true,groups = {"Smoke","Regression"},retryAnalyzer = RetryAnalyzer.class)
    public void verifyHomePageTitle() {
        extentTest.get().assignCategory("Smoke");
        extentTest.get().log(Status.PASS,"URL Loaded Succefully");
        extentTest.get().log(Status.PASS,"Home Page Title Received Successfully");
        String actualResult = driver.getTitle();
        ArrayList<String> data = ExcelUtility.readData(Constants.TEST_DATA_EXCEL_PATH, Constants.HOME_PAGE);
        extentTest.get().log(Status.PASS,"Expected Title Received From Excel");
        String expectedResult = data.get(1);//+"123";
        Assert.assertEquals(actualResult, expectedResult, Messages.TITLE_MISMATCH);
    }
    @Test(priority = 2,groups = {"Sanity"})
    public void verifyCommunityPollSelection() {
       // List<WebElement> pollTexts = driver.findElements(By.xpath("//li[@class='answer']//label[starts-with(@for,'pollanswers')]"));
        /*for (WebElement values : pollTexts) {
            String pollValuesTexts = values.getText();
            if (pollValuesTexts.equals("Poor")) {
                if (pollValuesTexts.equals(Constants.POOR)) {
                    values.click();
                }*/
               /* boolean isButtonSelected = values.isSelected();
                Assert.assertFalse(isButtonSelected, Messages.VALUE_SELECTED);*/
        extentTest.get().assignCategory("Sanity");
        extentTest.get().log(Status.PASS, "URL Loaded successfully");
        List<WebElement> pollTexts = driver.findElements(By.xpath("//li[@class='answer']//label[starts-with(@for,'pollanswers')]"));
         boolean isButtonSelected = AppUtility.selectValueFromRadioButton(pollTexts,Constants.POOR);
            extentTest.get().log(Status.PASS, "Community poll selected successfully");
            Assert.assertFalse(isButtonSelected, Messages.VALUE_SELECTED);
            }
        }
