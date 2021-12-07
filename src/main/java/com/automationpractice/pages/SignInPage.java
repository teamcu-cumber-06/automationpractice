package com.automationpractice.pages;

import com.automationpractice.utility.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utilities {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailadressField;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    WebElement signInButton;

    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAccountButton;

    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement authenticationText;

    @FindBy(xpath = "//h3[normalize-space()='Create an account']")
    WebElement createAccountText;

    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement singout;

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailfornewaccount;

    @FindBy(css = "button[id='SubmitCreate'] span")
    WebElement createAccounTAB;


    public void clickOnCreateAnAccountButton() {
        clickOnElement(createAccounTAB);
    }


    public void enterEmailfornewacountcreation(String email) {
        Reporter.log("Enter email " + email+ "to email adress field " + emailfornewaccount.toString() + "<br>");
        sendTextToElement(emailfornewaccount,email);
    }


    public void enterYouremail(String emailId) {                   //parameterized method
        Reporter.log("Enter email " + emailId + "to email adress field " + emailadressField.toString() + "<br>");
        sendTextToElement(emailadressField, emailId);

    }

    public void enterYourPassword(String password) {
        Reporter.log("Enter Password" + password + "to password field " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInButton() {
        Reporter.log("clicking on SignInButton " + signInButton.toString() + "<br>");
        clickOnElement(signInButton);
    }

    public void loginToAutomationPractice(String emailId, String password) {
        enterYouremail(emailId);
        enterYourPassword(password);
        clickOnSignInButton();
    }

    public String verifyTextSuccessfully(String text) {
        WebElement result = driver.findElement(By.cssSelector("div[class='alert alert-danger'] ol li"));
        //li[normalize-space()='Password is required.']
        return getTextFromElement(result);
    }

    public void verifySignOutButtonIsDisplayed() {
        singout.isDisplayed();
    }

    public void clickOnSignOutButton() {
        clickOnElement(singout);
    }

    public String getAuthenticationText() {

        return getTextFromElement(authenticationText);

    }

    public String createAccountText() {
        String textVerify1 = getTextFromElement(createAccountText);

        return textVerify1;

    }


}
