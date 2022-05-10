package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.nopcommerce.demo.driverfactory.ManageDriver.driver;

public class ComputerPage extends Utility {

    //3.ComputerPage - Comuters text, DesktopsLink, NotebooksLink, SoftwareLink Locators
    //and create appropriate methods for it.
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersTextField;

    @FindBy(xpath = "//li[@class=\"inactive\"]/child::a[contains(text(),'Desktops')]")
    WebElement desktopsLinkField;
    @FindBy(xpath = "//li[@class=\"inactive\"]/child::a[contains(text(),'Notebooks')]")
    WebElement noteBooksLinkField;
    @FindBy(xpath = "//li[@class=\"inactive\"]/child::a[contains(text(),'Software')]")
    WebElement softwareLinkField;
    @FindBy(xpath="//h1[contains(text(),'Software')]")
    WebElement softwareiyVerifyText;

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    public void getVerifyComputerText(String text) {
        verifyAssertText(computersTextField,text);
    }

    public void clickOnDeskTopsLink() {
        clickOnElement(desktopsLinkField);
    }

    public void clickOnNoteBooksLink() {
        clickOnElement(noteBooksLinkField);
    }

    public void clickOnSoftwareLink() {
        clickOnElement(softwareLinkField);

    }
    public void getVerifySoftwareText(String text) {
        verifyAssertText(softwareiyVerifyText,text);
    }

}
