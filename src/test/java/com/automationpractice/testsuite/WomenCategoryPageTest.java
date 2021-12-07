package com.automationpractice.testsuite;

import com.automationpractice.customlisteneres.CustomListeners;
import com.automationpractice.pages.*;
import com.automationpractice.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;

    @BeforeMethod(groups = {"regression"})
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
        womenCategoryPage = new WomenCategoryPage();
        productPage = new ProductPage();
    }

    @Test(groups = {"regression"}, dataProvider = "womenpagetest1", dataProviderClass = TestData.class)
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully(String text) {
        homePage.clickonWomenButtonOnHomePage();
        Assert.assertEquals(womenCategoryPage.verifyWomenText(), text);

    }

    @Test(groups = {"regression"}, dataProvider = "womenpagetest2", dataProviderClass = TestData.class)
    public void verifyUserShouldAddProductToTheCartSuccessfully(String value, String size, String msg) throws InterruptedException {
        homePage.clickonWomenButtonOnHomePage();
        productPage.clickOnFadedShort();
        productPage.enterQuantity(value);
        productPage.selectYourComfortSize(size);
        productPage.clickOnAddToCartButton();
        Thread.sleep(2000);
        Assert.assertEquals(productPage.verifyTextForSuccessfullyadd(), msg);
        productPage.clickToClose();
    }


}
