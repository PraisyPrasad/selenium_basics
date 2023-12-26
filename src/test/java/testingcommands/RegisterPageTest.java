package testingcommands;

import automationcore.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends Base {
    @Test
    public void verifyRegisterPageTitle() {
        WebElement registerField = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registerField.click();
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Demo Web Shop. Register";
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Invalid title");
    }

    @Test
    public void verifyUserRegistration() {
        WebElement registerField = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registerField.click();
        WebElement genderSelection = driver.findElement(By.xpath("//div[@class='gender']//label[text()='Female']"));
        genderSelection.click();
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.sendKeys("Praisy");
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.sendKeys("Prasad");
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("praisyprasad123@gmail.com");
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Automation@2023");
        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordField.sendKeys("Automation@2023");
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
    }
}