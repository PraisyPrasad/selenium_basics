package org.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebElementUtility;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a@class='ico-login']")
    WebElement loginMenu;
    @FindBy(xpath = "//a@class='ico-register']")
    WebElement registerMenu;

    public LoginPage clickOnLoginMenu() {
        WebElementUtility.clickOnElement(loginMenu);
        return new LoginPage(driver);
    }
    public RegisterPage clickOnRegisterPageMenu(){
        WebElementUtility.clickOnElement(registerMenu);
        return new RegisterPage(driver);
    }
}


