package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage deskTopPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        computerPage = new ComputerPage();
        deskTopPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }


    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickComputerTab();
        computerPage.getVerifyComputerText("Computers");


    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickComputerTab();
        computerPage.clickOnDeskTopsLink();
        deskTopPage.getVerifyDesktopsText("Desktops");

    }
    @Test(dataProvider = "buildyourowncomputerdata",dataProviderClass = TestData.class,groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) throws InterruptedException {
        homePage.clickComputerTab();
        computerPage.clickOnDeskTopsLink();
        Thread.sleep(1000);
        deskTopPage.clickBuildYourOwnComputerText();
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectProcessorFromDropDownMenu(processor);
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectRamFromDropDownMenu(ram);
        buildYourOwnComputerPage.clickOnHddFormRadioButton(hdd);
        buildYourOwnComputerPage.clickOnOsFormRadioButton(os);
        buildYourOwnComputerPage.clickSoftwareCheckBox(software);
        buildYourOwnComputerPage.clickOnAddToCartButtonTab();
        buildYourOwnComputerPage.getVerifyAddToCartText();
    }


}
