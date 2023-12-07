package org.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Commands extends Base {
    @Test
    public void verifySwagLabsUserLogin() {
        driver.get("https://www.saucedemo.com/");
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");
        WebElement passWordField = driver.findElement(By.id("password"));
        passWordField.sendKeys("secret_sauce");
        WebElement loginButtonField = driver.findElement(By.id("login-button"));
        loginButtonField.click();
        WebElement swagLogo = driver.findElement(By.className("app_logo"));
        String actualswagLogoText = swagLogo.getText();
        String expectedSwagLogoText = "Swag Labs";
        Assert.assertEquals(actualswagLogoText, expectedSwagLogoText, "Invalid Logo found in login page");
    }

    @Test
    public void verifyDemoWebShopUserLogin() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.className("ico-login"));
        login.click();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("praisyprasad123@gmail.com");
        WebElement passWordField = driver.findElement(By.id("Password"));
        passWordField.sendKeys("Automation@2023");
        WebElement loginButton = driver.findElement(By.className("login-button"));
        loginButton.click();
        WebElement actualUerLoginElement = driver.findElement(By.className("account"));
        String actualId = actualUerLoginElement.getText();
        String expectedLoginId = "praisyprasad123@gmail.com";
        Assert.assertEquals(actualId, expectedLoginId, "User login failed");
    }
    @Test
    public void verifyDemoTourRegistration(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Praisy");
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Prasad");
        WebElement phoneNo  =driver.findElement(By.name("phone"));
        phoneNo.sendKeys("9207657413");
        WebElement email = driver.findElement(By.id("userName"));
        email.sendKeys("praisyprasad123$gmail.com");
        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("Palakkad");
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Ottapalam");
        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Kerala");
        WebElement postalCode = driver.findElement(By.name("postalCode"));
        postalCode.sendKeys("679104");
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("praisyprasad123@gmail.com");
        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("Automation@2023");
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("Automation@2023");
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
    }
    @Test
    public void verifyLinkText(){
        driver.get("https://demo.guru99.com/test/newtours/");
        WebElement yourDestination =driver.findElement(By.linkText("your destination"));
        yourDestination.click();
    }
    @Test
    public void verifyPartialLinkText(){
        driver.get("https://demo.guru99.com/test/newtours/");
        WebElement destination = driver.findElement(By.partialLinkText("destination"));
        destination.click();

    }
    @Test
    public void validateDemoWebShopUserLoginUsingXpath(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        login.click();
        WebElement email= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("praisyprasad123@gmail.com");
        WebElement passWord=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        passWord.sendKeys("Automation@2023");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        loginButton.click();
        WebElement actualLoginElement = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        String actualId = actualLoginElement.getText();
        String expectedLoginId = "praisyprasad123@gmail.com";
        Assert.assertEquals(actualId,expectedLoginId,"User Login Failed");


    }
    @Test
    public void validateDemoWebShopUserLoginUsingCssSelector(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login= driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
        login.click();
        WebElement email=driver.findElement(By.cssSelector("#Email"));
        email.sendKeys("praisyprasad123@gmail.com");
        WebElement password=driver.findElement((By.cssSelector("#Password")));
        password.sendKeys("Automation@2023");
        WebElement loginButton = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
        loginButton.click();
        WebElement actualLoginElement = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(1) > a"));
        String actualId = actualLoginElement.getText();
        String expectedLoginId = "praisyprasad123@gmail.com";
        Assert.assertEquals(actualId,expectedLoginId,"User Login Failed");
    }
    @Test
    public void validateTotalNumOfTagInApplication(){
        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement> inputWebElement=driver.findElements(By.tagName("Input"));
        int size = inputWebElement.size();
        System.out.println("total no of input tag in UI is " +size);

    }
    @Test
    public void verifyNavigationCommands(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        driver.navigate().back();
        driver.navigate().forward();
        WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstname.sendKeys("Praisy");
        WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
        lastname.sendKeys("Prasad");
        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("praisyprasad123@gmail.com");
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.co.in/");
    }
    @Test
    public void verifyIsSelected(){
        boolean isMaleSelected;
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='gender-male']"));
        isMaleSelected=maleRadioButton.isSelected();//expected result is false so assert
        Assert.assertFalse(isMaleSelected,"Male Radio Button is selected");//actual result is isMaleSelected
        System.out.println("Gender Male Before Selection "+isMaleSelected);
        maleRadioButton.click();
        isMaleSelected = maleRadioButton.isSelected();//expected result is true
        Assert.assertTrue(isMaleSelected,"Male Radio Button is not selected");
        System.out.println("Gender Male After Selection "+isMaleSelected);

    }
    @Test
    public void verifyIsEnabled(){

        driver.get("https://demowebshop.tricentis.com/");
        WebElement subscribeButton=driver.findElement(By.xpath("//input[@value='Subscribe']"));
        boolean isSubscribeButtonEnabled = subscribeButton.isEnabled();
        Assert.assertTrue(isSubscribeButtonEnabled,"Subscribe button is not enabled");
    }
    @Test
    public void verifyIsDisplayed(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement voteButton=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        boolean isVoteButtonDisplayed = voteButton.isDisplayed();
        Assert.assertTrue(isVoteButtonDisplayed,"Vote Button is not displayed");
    }
}
