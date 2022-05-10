package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.nopcommerce.demo.driverfactory.ManageDriver.driver;


public class DesktopsPage extends Utility {
    //4.DesktopsPage - Desktops text, Sortby, Display, selectProductList Locators and it's actions//
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsField;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByField;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayField;
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement clickProductListField;
    @FindBy(xpath = "//h2[@class=\"product-title\"]/child::a[contains(text(),'Build your own computer')]")
    WebElement BuildYourOwnComputerField;
    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    public void getVerifyDesktopsText(String text)
    { verifyAssertText(desktopsField,text);

    }

    public void selectSortByDropDownMenu(String text) {
        selectByVisibleTextFromDropDown(sortByField, text);
    }

    public void selectDisplayDropDownMenu(String text) {
        selectByVisibleTextFromDropDown(displayField, text);
    }

    public void clickProductList() {
        clickOnElement(clickProductListField);
    }
        public void clickBuildYourOwnComputerText() {
            clickOnElement(BuildYourOwnComputerField);

            }
        }

