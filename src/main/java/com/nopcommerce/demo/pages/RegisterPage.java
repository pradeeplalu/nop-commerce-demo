package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    @FindBy(linkText = "Register")
    WebElement regiterFiled;
    @FindBy(id = "gender-male")
    WebElement genderRadioFiled;
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @FindBy(name = "DateOfBirthDay")
    WebElement selectDateOfDayField;
    @FindBy(name = "DateOfBirthMonth")
    WebElement selectDateOfMonthField;
    @FindBy(name = "DateOfBirthYear")
    WebElement selectDateOfYearField;
    @FindBy(id = "Email")
    WebElement emailIdField;
    @FindBy(id = "Password")
    WebElement passwordFiled;
    @FindBy(name = "ConfirmPassword")
    WebElement conformPasswordFiled;
    @FindBy(id = "register-button")
    WebElement registerButtonField;
    @FindBy(xpath = "//div[@class=\"result\"]")
    WebElement registrationiscomplitefield;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueField;
    @FindBy(id = "FirstName-error")
    WebElement firstNameIsRequiredField;
    @FindBy(id = "LastName-error")
    WebElement lastNameIsRequiredField;
    @FindBy(id = "Email-error")
    WebElement emailIsRequiredField;
    @FindBy(id = "Password-error")
    WebElement passwordIsRequiredField;
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordIsRequiredField;
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
   WebElement regiterTextVerifyFiled;
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickRegisterLink() {
        clickOnElement(regiterFiled);
    }
    public void registerTextVerified(String text){
        verifyAssertText(regiterTextVerifyFiled,text);
    }

    public void enterFemaleGenderRadioButton() {
        clickOnElement(genderRadioFiled);
    }

    public void enterFirstName(String text) {
        sendTextToElement(firstNameField, text);
    }

    public void enterLastName(String text) {
        sendTextToElement(lastNameField, text);
    }

    public void selectDateOfBirthDay(String text) {
        selectByVisibleTextFromDropDown(selectDateOfDayField, text);
    }

    public void selectDateOfBirthMonth(String text) {
        selectByVisibleTextFromDropDown(selectDateOfMonthField, text);
    }

    public void selectDateOfBirthYear(String text) {
        selectByVisibleTextFromDropDown(selectDateOfYearField, text);
    }


    public void enterEmailId(String text) {
        sendTextToElement(emailIdField, text);
    }

    public void enterPassword(String text) {
        sendTextToElement(passwordFiled, text);
    }

    public void enterConfPassword(String text) {
        sendTextToElement(conformPasswordFiled, text);
    }

    public void clickRegisterButton() {
        clickOnElement(registerButtonField);
    }

    public void clickOnContinueRegister() {
        clickOnElement(continueField);
    }

    public void clickOnRegistrationComplited() {
        clickOnElement(registrationiscomplitefield);

    }

    public void getVerifyFirstNameIsRequiredText(String text) {
        verifyAssertText(firstNameIsRequiredField, text);
    }

    public void getVerifyLastNameIsRequiredText(String text) {
        verifyAssertText(lastNameIsRequiredField, text);
    }

    public void getVerifyEmailIsRequiredText(String text) {
        verifyAssertText(emailIsRequiredField, text);

    }

    public void getVerifyPasswordIsRequiredText(String text) {
        verifyAssertText(passwordIsRequiredField, text);
    }

    public void getVerifyConformPasswordIsRequiredText(String text) {
        verifyAssertText(confirmPasswordIsRequiredField, text);
    }

}








