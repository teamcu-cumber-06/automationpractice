package com.automationpractice.pages;

import com.automationpractice.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utilities {
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Faded Short Sleeve T-shirts']")
                       //a[normalize-space()='Blouse']
    WebElement fadedShort;
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement inputboxQt;
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement selectSizeDropDown;
    @FindBy(css = "button[name='Submit'] span")
    WebElement addToCartButton;
    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement verifyTEXT;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement close;



    public void clickOnFadedShort(){
        clickOnElement(fadedShort);
    }
    public void enterQuantity(String value){
        clearValue(inputboxQt);
        sendTextToElement(inputboxQt,value);
    }
    public void selectYourComfortSize(String size){
        selectByValueFromDropDown(selectSizeDropDown,size);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }
    public String verifyTextForSuccessfullyadd() {
        return getTextFromElement(verifyTEXT);
    }
    public void clickToClose(){
        clickOnElement(close);
    }
}
