package org.selenium.commands;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Commands extends BrowserLaunch {
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
    public void verifyDemoTourRegistration() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Praisy");
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Prasad");
        WebElement phoneNo = driver.findElement(By.name("phone"));
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
    public void verifyLinkText() {
        driver.get("https://demo.guru99.com/test/newtours/");
        WebElement yourDestination = driver.findElement(By.linkText("your destination"));
        yourDestination.click();
    }

    @Test
    public void verifyPartialLinkText() {
        driver.get("https://demo.guru99.com/test/newtours/");
        WebElement destination = driver.findElement(By.partialLinkText("destination"));
        destination.click();

    }

    @Test
    public void validateDemoWebShopUserLoginUsingXpath() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        login.click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("praisyprasad123@gmail.com");
        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        passWord.sendKeys("Automation@2023");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        loginButton.click();
        WebElement actualLoginElement = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        String actualId = actualLoginElement.getText();
        String expectedLoginId = "praisyprasad123@gmail.com";
        Assert.assertEquals(actualId, expectedLoginId, "User Login Failed");


    }

    @Test
    public void validateDemoWebShopUserLoginUsingCssSelector() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
        login.click();
        WebElement email = driver.findElement(By.cssSelector("#Email"));
        email.sendKeys("praisyprasad123@gmail.com");
        WebElement password = driver.findElement((By.cssSelector("#Password")));
        password.sendKeys("Automation@2023");
        WebElement loginButton = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
        loginButton.click();
        WebElement actualLoginElement = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(1) > a"));
        String actualId = actualLoginElement.getText();
        String expectedLoginId = "praisyprasad123@gmail.com";
        Assert.assertEquals(actualId, expectedLoginId, "User Login Failed");
    }

    @Test
    public void validateTotalNumOfTagInApplication() {
        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement> inputWebElement = driver.findElements(By.tagName("Input"));
        int size = inputWebElement.size();
        System.out.println("total no of input tag in UI is " + size);

    }

    @Test
    public void verifyNavigationCommands() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        driver.navigate().back();
        driver.navigate().forward();
        WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstname.sendKeys("Praisy");
        WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastname.sendKeys("Prasad");
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("praisyprasad123@gmail.com");
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.co.in/");
    }

    @Test
    public void verifyIsSelected() {
        boolean isMaleSelected;
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        isMaleSelected = maleRadioButton.isSelected();//expected result is false so assert
        Assert.assertFalse(isMaleSelected, "Male Radio Button is selected");//actual result is isMaleSelected
        System.out.println("Gender Male Before Selection " + isMaleSelected);
        maleRadioButton.click();
        isMaleSelected = maleRadioButton.isSelected();//expected result is true
        Assert.assertTrue(isMaleSelected, "Male Radio Button is not selected");
        System.out.println("Gender Male After Selection " + isMaleSelected);

    }

    @Test
    public void verifyIsEnabled() {

        driver.get("https://demowebshop.tricentis.com/");
        WebElement subscribeButton = driver.findElement(By.xpath("//input[@value='Subscribe']"));
        boolean isSubscribeButtonEnabled = subscribeButton.isEnabled();
        Assert.assertTrue(isSubscribeButtonEnabled, "Subscribe button is not enabled");
    }

    @Test
    public void verifyIsDisplayed() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement voteButton = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        boolean isVoteButtonDisplayed = voteButton.isDisplayed();
        Assert.assertTrue(isVoteButtonDisplayed, "Vote Button is not displayed");
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
    public void verifyValuesSelectFromDropDown() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement countryDropDown = driver.findElement(By.xpath("//select[@name='country']"));
        Select select = new Select(countryDropDown);
        //select.selectByVisibleText("INDIA");
        //select.selectByIndex(23);
        select.selectByValue("ANDORRA");
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println(firstSelectedOption.getText());
    }

    @Test
    public void verifyTotalNumberOfDropDownValues() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement countryDropDown = driver.findElement(By.xpath("//select[@name='country']"));
        Select select = new Select(countryDropDown);
        List<WebElement> dropDownElements = select.getOptions();
        System.out.println(dropDownElements.size());
    }

    @Test
    public void verifyMultiSelectDropDown() {
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        WebElement multiSelect = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
        Select select = new Select(multiSelect);
        boolean selectedValue = select.isMultiple();
        System.out.println(selectedValue);
        select.selectByVisibleText("Browser Commands");
        select.selectByVisibleText("Navigation Commands");
        List<WebElement> selectedValues = select.getAllSelectedOptions();
        for (WebElement e : selectedValues) {
            System.out.println(e.getText());

        }
        select.deselectByVisibleText("Navigation Commands");
    }

    @Test
    public void verifyFileUpload() {
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement chooseFileField = driver.findElement(By.xpath("//input[@type='file']"));
        chooseFileField.sendKeys("C:\\Users\\Hp\\IdeaProjects\\seleniumbasics\\src\\main\\resources\\Selenium.docx");
        WebElement acceptField = driver.findElement(By.xpath("//input[@type='checkbox']"));
        acceptField.click();
        WebElement submitFile = driver.findElement(By.xpath("//button[@type='button']"));
        submitFile.click();

    }

    @Test
    public void verifyTextInSubscribeButton() {//to check subscribe button text is subscribe
        driver.get("https://demowebshop.tricentis.com/");
        WebElement subscribeButton = driver.findElement(By.id("newsletter-subscribe-button"));
        String subscribeButtonText = subscribeButton.getAttribute("value");
        String expectedResult = "Subscribe";
        Assert.assertEquals(subscribeButtonText, expectedResult, "Invalid Text Found in Subscribe Button");
    }

    @Test
    public void verifySimpleAlert() {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton = driver.findElement(By.id("alertButton"));
        clickButton.click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();

    }

    @Test
    public void verifyConfirmationAlert() {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton = driver.findElement(By.id("confirmButton"));
        clickButton.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement message = driver.findElement(By.id("confirmResult"));
        //message.getText();
        String actualResult = message.getText();
        String expectedResult = "You selected Cancel";
        Assert.assertEquals(actualResult, expectedResult, "Invalid Text Found");
    }

    @Test
    public void verifyPromtAlert() {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton = driver.findElement(By.id("promtButton"));
        clickButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Praisy");
        alert.accept();
        WebElement promtResult = driver.findElement(By.id("promptResult"));
        String actualResult = promtResult.getText();
        String expectedResult = "You entered Praisy";
        Assert.assertEquals(actualResult, expectedResult, "Invalid Text Found");
    }

    @Test
    public void verifyMultipleWindowHandling() {
        driver.get("https://demo.guru99.com/popup.php");
        String parentWindowHandleId = driver.getWindowHandle();
        System.out.println(parentWindowHandleId);
        WebElement clickButton = driver.findElement(By.xpath("//a[@target='_blank']"));
        clickButton.click();
        Set<String> windowHandleIds = driver.getWindowHandles();
        System.out.println(windowHandleIds);
        Iterator<String> value = windowHandleIds.iterator();
        while (value.hasNext())
        {
            String handleId= value.next();
            if (!handleId.equals(parentWindowHandleId)) {
                System.out.println("Parent window of child window "+handleId);
                driver.switchTo().window(handleId);
                WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
                email.sendKeys("praisyprasad123@gmail.com");
                WebElement submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
                submit.click();
                driver.close();
            }

        }
        driver.switchTo().window(parentWindowHandleId);

    }
    @Test
    public void verifyiframe(){
        driver.get("https://demoqa.com/frames");
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        int size = frames.size();
        System.out.println("total no of iframes tag in UI is " + size);
      //  driver.switchTo().frame(3);
       // driver.switchTo().frame("frame1");
        WebElement frame=driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame);
        WebElement frameText = driver.findElement(By.id("sampleHeading"));
        System.out.println("frame text = "+frameText.getText());
        driver.switchTo().defaultContent();//if we switch to frame it will be automatically in frame.. to move back to the original website
    }
    @Test
    public void verifyRightClick(){
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClickButton= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickButton).build().perform();
    }
    @Test
    public void verifyDoubleClick(){
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClickButton= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).build().perform();
        Alert alert=driver.switchTo().alert();
        String alertText=alert.getText();
        System.out.println(alertText);
        alert.accept();
    }
    @Test
    public void verifydraganddrop(){
        driver.get("https://demoqa.com/droppable");
        WebElement dragButton = driver.findElement(By.id("draggable"));
        WebElement dropButton = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragButton,dropButton).build().perform();
    }
    @Test
    public void dragAndDropByOffset(){
        driver.get("https://demoqa.com/dragabble");
        WebElement dragBox=driver.findElement(By.id("dragBox"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(dragBox,150,150).build().perform();
    }
    @Test
    public void verifyMouseOver(){
        driver.get("https://demoqa.com/menu/");
        WebElement selectItemButton = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        Actions action = new Actions(driver);
        action.moveToElement(selectItemButton).build().perform();
        WebElement subListButton = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
        action.moveToElement(subListButton).build().perform();
    }
    @Test
    public void verifyJavaScriptClickAndSendKeys(){
        driver.get("https://demowebshop.tricentis.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;//to convert
        js.executeScript("document.getElementById('newsletter-email').value='test@test.com'");
        js.executeScript("document.getElementById('newsletter-subscribe-button').click()");

    }
    @Test
    public void verifyVerticalScroll(){
        driver.get("https://demowebshop.tricentis.com/");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    @Test
    public void verifyScreenshortAfterTestFail(){
        driver.get("https://www.saucedemo.com/");
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");
        WebElement passWordField = driver.findElement(By.id("password"));
        passWordField.sendKeys("secret_sauce");
        WebElement loginButtonField = driver.findElement(By.id("login-button"));
        loginButtonField.click();
        WebElement swagLogo = driver.findElement(By.className("app_logo"));
        String actualswagLogoText = swagLogo.getText();
        String expectedSwagLogoText = "Swag";
        Assert.assertEquals(actualswagLogoText, expectedSwagLogoText, "Invalid Logo found in login page");
    }
    @Test
    public void verifyWait() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//execution time cannot be changed
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));//explicit wait--polling time cannot be controlled, waite is given for specific element
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton")));
        WebElement clickButton=driver.findElement(By.id("timerAlertButton"));
        clickButton.click();
        Thread.sleep(6000);//used in java not in selenium because time of execution is more
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void verifyFluentWait() {
        driver.get("https://demoqa.com/alerts");
        FluentWait wait=new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton")));
        WebElement clickButton=driver.findElement(By.id("timerAlertButton"));
        clickButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void verifyDiffBetweenFindElementFindElements(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement subscribeButton=driver.findElement(By.id("newsletter-subscribe-button"));
        System.out.println("Webelement on match" +subscribeButton);
        List<WebElement> communityPole=driver.findElements(By.xpath("//li[@class='answer']//label"));
        int size=communityPole.size();
        System.out.println("List of size on match" +size);
        //On ZeroMatch
        List<WebElement> communityPollonZeroMatch=driver.findElements(By.xpath("//li[@class='answer123']//label"));
        int sizeonzeromatch=communityPollonZeroMatch.size();
        System.out.println("Size of list on zero match "+sizeonzeromatch);
        //WebElement subscribeButtonZeroMatch=driver.findElement(By.id("newsletter-subscribe-button123"));
        //On Oneplus Match
        WebElement communityPollonOnePlusMatch=driver.findElement(By.xpath("//li[@class='answer']//label"));
        communityPollonOnePlusMatch.click();
    }
    @Test
    public void verifyDiffBetweenCloseAndQuit(){//need to close whole browser
        driver.get("https://demo.guru99.com/popup.php");
        WebElement clickButton = driver.findElement(By.linkText("Click Here"));
        clickButton.click();//go to base and comment browser.close and give browser.quite

    }

}
