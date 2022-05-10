package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLinkField;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomePleaseSignIn;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButtonField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement loginErrorMessageField;
     @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutButtonField;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLinkField);
    }

    public void enterEmailId(String text) {
        sendTextToElement(emailField, text);
    }

    public void enterPassword(String text) {
        sendTextToElement(passwordField, text);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButtonField);
    }

    public void welcomeVerifyMessage(String text) {
        verifyAssertText(welcomePleaseSignIn, text);
    }

    public void errorMessageVerify(String text) {
        verifyAssertText(loginErrorMessageField, text);
    }
    public void clickOnLogoutButton() {
        clickOnElement(logoutButtonField);
    }
    public void clickOnLogoutButtonVerify(String text) {
        verifyAssertText(logoutButtonField,text);
    }


    public void loginLinkVerify(String text){
        verifyAssertText(loginLinkField,text);
    }
}
