package org.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ObsquraZoneTest extends Base {
    @Test
    public void verifySingleInputField() {
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
        WebElement messageField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
        messageField.sendKeys("Welcome to Obsqura Zone");
        WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
        showMessageButton.click();
        WebElement messageTab = driver.findElement(By.xpath("//div[@id='message-one']"));
        String actualResult = messageTab.getText();
        String expectedResult = "Your Message : Welcome to Obsqura Zone";
        Assert.assertEquals(actualResult, expectedResult, "Invalid Message");
    }

    @Test
    public void verifyTwoInputFieldOutput() {
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
        WebElement valueAField = driver.findElement(By.xpath("//input[@id='value-a']"));
        valueAField.sendKeys("20");
        WebElement valueBField = driver.findElement(By.xpath("//input[@id='value-b']"));
        valueBField.sendKeys("30");
        WebElement totalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
        totalButton.click();
        WebElement sum = driver.findElement(By.xpath("//div[@id='message-two']"));
        String actualResult=sum.getText();
        String expectedResult ="Total A + B : 50";
        Assert.assertEquals(actualResult, expectedResult, "Invalid Message");
    }

    @Test
    public void verifySingleTextBoxDemo() {
        boolean selected;
        driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
        WebElement checkBox = driver.findElement((By.xpath("//input[@id='gridCheck']")));
        selected = checkBox.isSelected();
        Assert.assertFalse(selected, "Checkbox is selected");
        checkBox.click();
        selected = checkBox.isSelected();
        Assert.assertTrue(selected, "Checkbox is not selected");
    }

    @Test
    public void verifyRadioButtonDemo() {
        boolean isMaleSelected;
        driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
        WebElement maleSelected = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
        isMaleSelected = maleSelected.isSelected();
        Assert.assertFalse(isMaleSelected, "Male radiobutton is selected");
        maleSelected.click();
        isMaleSelected = maleSelected.isSelected();
        Assert.assertTrue(isMaleSelected, "Male radiobutton is not selected");
        WebElement showButton = driver.findElement(By.xpath("//button[@id='button-one']"));
        showButton.click();
        WebElement messageTab=driver.findElement(By.xpath("//div[@id='message-one']"));
        String actualResult = messageTab.getText();
        String expectedResult = "Radio button 'Male' is checked";
        Assert.assertEquals(actualResult, expectedResult, "Radio Button 'Male' is not checked");

        boolean isFemaleSelected;
        WebElement femaleSelected = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
        isFemaleSelected = femaleSelected.isSelected();
        Assert.assertFalse(isFemaleSelected, "Female radiobutton is selected");
        femaleSelected.click();
        isFemaleSelected = femaleSelected.isSelected();
        Assert.assertTrue(isFemaleSelected, "Female radiobutton is not selected");
       // WebElement showFemaleButton = driver.findElement(By.xpath("//button[@id='button-one']"));
        showButton.click();
        //WebElement messageTab=driver.findElement(By.xpath("//div[@id='message-one']"));
        String actualFemaleResult = messageTab.getText();
        String expectedFemaleResult = "Radio button 'Female' is checked";
        Assert.assertEquals(actualFemaleResult, expectedFemaleResult, "Radio Button 'Female' is not checked");
    }
    @Test
    public void verifyFormWithValidation(){
        driver.get("https://selenium.obsqurazone.com/form-submit.php");
        WebElement firstName=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
        firstName.sendKeys("Praisy");
        WebElement lastName=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
        lastName.sendKeys("Prasad");
        WebElement email=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
        email.sendKeys("praisyprasad123@gmail.com");
        WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
        city.sendKeys("Palakkad");
        WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
        state.sendKeys("Kerala");
        WebElement pin=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
        pin.sendKeys("679104");
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
        checkBox.click();
        WebElement submitButton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        submitButton.click();
        WebElement messageTab=driver.findElement(By.xpath("//div[@id='message-one']"));
        String actualResult=messageTab.getText();
        String expectedResult="Form has been submitted successfully!";
        Assert.assertEquals(actualResult,expectedResult,"Form submitted unsuccessfully");
    }
}


