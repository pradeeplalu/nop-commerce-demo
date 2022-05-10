package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage;
    RegisterPage registerPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        registerPage.clickRegisterLink();
        registerPage.registerTextVerified("Register");


    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        registerPage.clickRegisterLink();
        registerPage.clickRegisterButton();
        registerPage.getVerifyFirstNameIsRequiredText("First name is required.");
        registerPage.getVerifyLastNameIsRequiredText("Last name is required.");
        registerPage.getVerifyEmailIsRequiredText("Email is required.");
        registerPage.getVerifyPasswordIsRequiredText("Password is required.");
        registerPage.getVerifyConformPasswordIsRequiredText("Password is required.");


    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        registerPage.clickRegisterLink();
        registerPage.enterFemaleGenderRadioButton();
        registerPage.enterFirstName("Shamili");
        registerPage.enterLastName("kumari");
        registerPage.selectDateOfBirthDay("7");
        registerPage.selectDateOfBirthMonth("May");
        registerPage.selectDateOfBirthYear("2010");
        registerPage.enterEmailId("qwert123672345@gmail.com");
        registerPage.enterPassword("qwert1234");
        registerPage.enterConfPassword("qwert1234");
        registerPage.clickRegisterButton();



    }
}
