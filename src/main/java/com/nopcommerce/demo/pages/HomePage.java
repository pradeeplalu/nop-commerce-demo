package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Neha
 */
public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText="Computers")
    WebElement computerField;
    @FindBy(linkText="Electronics")
    WebElement electronicField;
    @FindBy(linkText="Apparel")
    WebElement apparelFiled;
    @FindBy(linkText="Digital downloads")
    WebElement digitalDownloadFiled;
    @FindBy(linkText="Books")
    WebElement booksFiled;
    @FindBy(linkText="Jewelry")
    WebElement jewelryFiled;
    @FindBy(linkText="Gift Cards")
    WebElement giftCardsFiled;
    @FindBy(xpath="//img[@alt=\"nopCommerce demo store\"]")
    WebElement nopcommerceField;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerField;
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginField;
    @FindBy (xpath="//a[@class=\"ico-account\"]")
    WebElement myaccountField;
    @FindBy(xpath ="//a[contains(text(),'Log out')]")
    WebElement logoutfield;



    public void clickComputerTab(){
        clickOnElement(computerField);
    }
    public void clickElectronicTab(){
        clickOnElement(electronicField);
    }
    public void clickApparelTab(){
        clickOnElement(apparelFiled);
    }
    public void clickDigitalDownloadTab(){
        clickOnElement(digitalDownloadFiled);
    }
    public void clickBooksTab(){
        clickOnElement(booksFiled);
    }
    public void clickJewelryTab(){
        clickOnElement(jewelryFiled);
    }
    public void clickGiftCardsTab(){
        clickOnElement(giftCardsFiled);
    }
    public void clickLoginTab(){
        clickOnElement(loginField);
    }
    public void clickRigesterLinkTab(){
        clickOnElement(registerField);
    }
    public void clickNopcommerceLogo(){
        clickOnElement(nopcommerceField);
    }
    public void clickMyAccountTab(){
        clickOnElement(myaccountField);
    }
    public void clickLogOutTab(){
        clickOnElement(logoutfield);
    }



}
