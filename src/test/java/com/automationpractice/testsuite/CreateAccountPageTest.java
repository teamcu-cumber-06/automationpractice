package com.automationpractice.testsuite;

import com.automationpractice.customlisteneres.CustomListeners;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod(groups = {"sanity"})   //(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage =new CreateAccountPage();
    }

    @Test(groups = {"sanity"},dataProvider = "createnewaccount", dataProviderClass = TestData.class)
   public void  verifyThatUserShouldCreateAccountSuccessfully(String email,String name,String lastname,String pass,String add,String city,String state,String postal,String country,String phone){
        homePage.clickOnSignInLinkOnHomePage();
        signInPage.enterEmailfornewacountcreation(email);
        signInPage.clickOnCreateAnAccountButton();
        createAccountPage.enterYourFirstName(name);
        createAccountPage.enterYourLastName(lastname);
        createAccountPage.enterYourPassword(pass);
        createAccountPage.enterYourAddress(add);
        createAccountPage.enterYourCity(city);
        createAccountPage.selectYourState(state);
        createAccountPage.enterYourPostalCode(postal);
        createAccountPage.selectYourCountry(country);
        createAccountPage.enterYourPhoneNumber(phone);
        createAccountPage.clickOnRegisterButton();

    }



}
