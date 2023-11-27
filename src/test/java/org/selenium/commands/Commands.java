package org.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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
}
