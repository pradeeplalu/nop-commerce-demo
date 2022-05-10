package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickLoginTab();
        loginPage.welcomeVerifyMessage("Welcome, Please Sign In!");

    }
    @Test(groups = {"smoke","regression"})
    public void  verifyTheErrorMessageWithInValidCredentials(){
          loginPage.clickOnLoginLink();
        loginPage.enterEmailId("abc123456@gmail.com");
        loginPage.enterPassword("abc1234");
        loginPage.clickOnLoginButton();
        loginPage.errorMessageVerify("Login was unsuccessful. Please correct the errors and try again.\n"+"No customer account found");


    }
    @Test(groups = {"regression"})
   public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        loginPage.clickOnLoginLink();
        loginPage.enterEmailId("qwert123672345@gmail.com");
        loginPage.enterPassword("qwert1234");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogoutButtonVerify("Log out");


    }
    @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully(){

        loginPage.clickOnLoginLink();
        loginPage.enterEmailId("qwert123672345@gmail.com");
        loginPage.enterPassword("qwert1234");
        loginPage.clickOnLoginButton();
        homePage.clickLogOutTab();
        loginPage.loginLinkVerify("Log in");

    }

}
