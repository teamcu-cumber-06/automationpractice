package com.automationpractice.pages;

import com.automationpractice.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utilities {

    public HomePage() {                                      //created a constructor for PageFactorySetUp
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenbutton;

    @FindBy(linkText = "Dresses")
    WebElement dressesbutton;

    @FindBy(linkText = "T-shirts")
    WebElement tshirtbutton;

    @FindBy(css = "a[title='Log in to your customer account']")
    WebElement signIn;

    @FindBy(xpath = "//img[@alt='My Store']")
    WebElement logoimg;

    public void clickonWomenButtonOnHomePage() {
        Reporter.log("click on womenlink" + womenbutton.toString() + "<br>");
        clickOnElement(womenbutton);

    }

    public void clickonDressesButtonOnHomePage() {
        Reporter.log("click on Dressbutton" + dressesbutton.toString() + "<br>");
        clickOnElement(dressesbutton);
    }

    public void clickontshirtButtonOnHomePage() {
        clickOnElement(tshirtbutton);
    }

    public void clickOnSignInLinkOnHomePage() {
        clickOnElement(signIn);
    }

    public String getLogoVerifyOnHomePage() {
        String logoVerify = getTextFromElement(logoimg);
        return logoVerify;

    }

    public void verifySignInLinkIsDisplayed(){
        signIn.isDisplayed();
    }


}
