package org.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebElementUtility;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="Email")
    WebElement emailField;

    @FindBy(id="Password")
    WebElement passwordFeild;

    @FindBy(xpath="//input[@class='button-1 login-button']")
    WebElement loginButton;

    public void enterUserName(String username){
        WebElementUtility.enterValue(emailField,username);
    }
    public void enterPassword(String password){
        WebElementUtility.enterValue(passwordFeild,password);
    }
    public UserAccountPage clickOnLogin(){
        WebElementUtility.clickOnElement(loginButton);
        return new UserAccountPage(driver);
    }
}

