package com.automationpractice.pages;

import com.automationpractice.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utilities {

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#customer_firstname")
    WebElement firstName;

    @FindBy(css = "#customer_lastname")
    WebElement lastName;

    @FindBy(css = "#passwd")
    WebElement password;

    @FindBy(css = "#address1")
    WebElement address;

    @FindBy(css = "#city")
    WebElement city;

    @FindBy(css = "#id_state")   //dropdown
    WebElement state;

    @FindBy(css = "#postcode")
    WebElement postcode;

    @FindBy(css = "#id_country")    //dropdown
    WebElement country;

    @FindBy(css = "#phone_mobile")
    WebElement phoneNumber;

    @FindBy(css = "button[id='submitAccount'] span")
    WebElement registerButton;

    public void enterYourFirstName(String name) {
        Reporter.log("Enter firstname" + firstName  + firstName.toString() + "<br>");
        sendTextToElement(firstName, name);

    }

    public void enterYourLastName(String surname) {
        Reporter.log("Enter lastname" + lastName  + lastName.toString() + "<br>");
        sendTextToElement(lastName, surname);

    }

    public void enterYourPassword(String pass) {
        Reporter.log("Enter password" + password + password.toString() + "<br>");
        sendTextToElement(password, pass);
    }

    public void enterYourAddress(String add) {
        Reporter.log("Enter adress" + address  + address.toString() + "<br>");
        sendTextToElement(address, add);
    }

    public void enterYourCity(String cityy) {
        Reporter.log("Enter city" + city  + city.toString() + "<br>");
        sendTextToElement(city, cityy);
    }

    public void selectYourState(String st) {
        Reporter.log("Enter State" + state+ state.toString() + "<br>");
        selectByValueFromDropDown(state, st);
    }

    public void enterYourPhoneNumber(String phone) {
        Reporter.log("Enter phone number" + phoneNumber  + phoneNumber.toString() + "<br>");
        sendTextToElement(phoneNumber, phone);
    }

    public void enterYourPostalCode(String postal) {
        Reporter.log("Enter postcode" + postcode  + postcode.toString() + "<br>");
        sendTextToElement(postcode, postal);
    }

    public void selectYourCountry(String countryy) {
        Reporter.log("Enter Country" + country  + country.toString() + "<br>");
        selectByValueFromDropDown(country, countryy);
    }

    public void clickOnRegisterButton() {
        Reporter.log("clicking on Register Button " + registerButton.toString() + "<br>");
        clickOnElement(registerButton);
    }

}
