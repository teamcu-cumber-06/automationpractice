package com.automationpractice.testsuite;

import com.automationpractice.customlisteneres.CustomListeners;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class SignInPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod  (alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
    }

    @Test(groups = {"smoke"})
    public void userShouldNavigateToSignInPageSuccessFully() {

        homePage.clickOnSignInLinkOnHomePage();
        //  Thread.sleep(1000);
        String expectedMessage = "AUTHENTICATION";
        String actualMessage = signInPage.getAuthenticationText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test(groups = {"smoke"}, dataProvider = "IdandPassword", dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password, String text) throws InterruptedException {
        homePage.clickOnSignInLinkOnHomePage();
        signInPage.loginToAutomationPractice(username, password);
        Assert.assertEquals(signInPage.verifyTextSuccessfully(text), text, "Not verified message");

    }

    @Test(groups = {"smoke"}, dataProvider = "validCredentials", dataProviderClass = TestData.class)
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(String username, String password) {
        homePage.clickOnSignInLinkOnHomePage();
        signInPage.loginToAutomationPractice(username, password);
        signInPage.verifySignOutButtonIsDisplayed();
    }

    @Test(groups = {"smoke"}, dataProvider = "validCredential", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldLogOutSuccessFully(String username, String password) {
        homePage.clickOnSignInLinkOnHomePage();
        signInPage.loginToAutomationPractice(username, password);
        signInPage.verifySignOutButtonIsDisplayed();
        signInPage.clickOnSignOutButton();
        homePage.verifySignInLinkIsDisplayed();
    }

}
