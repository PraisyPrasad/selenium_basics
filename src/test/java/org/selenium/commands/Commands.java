package org.selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
    @Test
    public void verifyCommunityPoll() {
        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement> communityPole = driver.findElements(By.xpath("//li[@class='answer']//label[starts-with(@for,'pollanswers')]"));
        for (WebElement obj : communityPole) {
            String poll = obj.getText();
            if (poll.equals("Poor")) {
                obj.click();
            }
        }
    }
    @Test
    public void verifyValuesSelectFromDropDown(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement countryDropDown=driver.findElement(By.xpath("//select[@name='country']"));
        Select select= new Select(countryDropDown);
        //select.selectByVisibleText("INDIA");
        //select.selectByIndex(23);
        select.selectByValue("ANDORRA");
        WebElement firstSelectedOption=select.getFirstSelectedOption();
        System.out.println(firstSelectedOption.getText());
    }
    @Test
    public void verifyTotalNumberOfDropDownValues(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement countryDropDown=driver.findElement(By.xpath("//select[@name='country']"));
        Select select=new Select(countryDropDown);
        List<WebElement>dropDownElements=select.getOptions();
        System.out.println(dropDownElements.size());
    }
    @Test
    public void verifyMultiSelectDropDown(){
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        WebElement multiSelect=driver.findElement(By.xpath("//select[@name='selenium_commands']"));
        Select select =new Select(multiSelect);
        boolean selectedValue=select.isMultiple();
        System.out.println(selectedValue);
        select.selectByVisibleText("Browser Commands");
        select.selectByVisibleText("Navigation Commands");
        List<WebElement>selectedValues=select.getAllSelectedOptions();
        for (WebElement e:selectedValues) {
            System.out.println(e.getText());
            
        }
        select.deselectByVisibleText("Navigation Commands");
    }
    @Test
    public void verifyFileUpload(){
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement chooseFileField=driver.findElement(By.xpath("//input[@type='file']"));
        chooseFileField.sendKeys("C:\\Users\\Hp\\IdeaProjects\\seleniumbasics\\src\\main\\resources\\Selenium.docx");
        WebElement acceptField=driver.findElement(By.xpath("//input[@type='checkbox']"));
        acceptField.click();
        WebElement submitFile=driver.findElement(By.xpath("//button[@type='button']"));
        submitFile.click();

    }
    @Test
    public void verifyTextInSubscribeButton(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement subscribeButton=driver.findElement(By.id("newsletter-subscribe-button"));
        String subscribeButtonText=subscribeButton.getAttribute("value");
        String expectedResult="Subscribe";
        Assert.assertEquals(subscribeButtonText,expectedResult,"Invalid Text Found in Subscribe Button");
    }
    @Test
    public void verifySimpleAlert(){
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton=driver.findElement(By.id("alertButton"));
        clickButton.click();
        Alert alert=driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();

    }
    @Test
    public void verifyConfirmationAlert(){
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton=driver.findElement(By.id("confirmButton"));
        clickButton.click();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        WebElement message=driver.findElement(By.id("confirmResult"));
        //message.getText();
        String actualResult=message.getText();
        String expectedResult="You selected Cancel";
        Assert.assertEquals(actualResult,expectedResult,"Invalid Text Found");
    }
    @Test
    public void verifyPromtAlert(){
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton=driver.findElement(By.id("promtButton"));
        clickButton.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Praisy");
        alert.accept();
        WebElement promtResult=driver.findElement(By.id("promptResult"));
        String actualResult=promtResult.getText();
        String expectedResult="You entered Praisy";
        Assert.assertEquals(actualResult,expectedResult,"Invalid Text Found");


    }

}
