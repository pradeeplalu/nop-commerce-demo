package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.nopcommerce.demo.driverfactory.ManageDriver.driver;

public class BuildYourOwnComputerPage extends Utility {

    //5.BuildYourOwnComputerPage - Build your own computer Text, Processor Drop Down, Ram
//drop down,
//HDD radios, os radio, software check boxes, Add To Card button, "The product has been
//added to your shopping cart"
//message locators and it's actions
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourComputerTextField;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDownField;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDownField;
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']/descendant::li/child::label")
    List<WebElement> hddRadioButtonField;
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']/descendant::li/child::label")
    List<WebElement> osRadioButtonField;
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']/descendant::li")
    List<WebElement> softwareCheckBoxsField;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButtonField;
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement addToShoppingCartField;

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    public void getVerifyBuildYourComputerTab(String text) {
        verifyAssertText(buildYourComputerTextField, text);
    }

    public void selectProcessorFromDropDownMenu(String processor) {
        selectByVisibleTextFromDropDown(processorDropDownField, processor);

    }

    public void selectRamFromDropDownMenu(String ram) {
        selectByVisibleTextFromDropDown(ramDropDownField, ram);
    }

    public void clickOnHddFormRadioButton(String text) {
        for (WebElement element : hddRadioButtonField) {
            if (element.getText().equalsIgnoreCase(text)) {
                element.click();
                break;
            }
        }

    }

    public void clickOnOsFormRadioButton(String text) {
        for (WebElement element : osRadioButtonField) {
            if (element.getText().equalsIgnoreCase(text)) {
                element.click();
                break;
            }
        }
    }

    public void clickSoftwareCheckBox(String text) {
        for (WebElement element : softwareCheckBoxsField)
            if (element.getText().equalsIgnoreCase(text)) {
                element.click();
                break;
            }
    }


    public void clickOnAddToCartButtonTab() {
        clickOnElement(addToCartButtonField);
    }

    public String getVerifyAddToCartText() {
        return getTextFromElement(addToShoppingCartField);
    }
}




