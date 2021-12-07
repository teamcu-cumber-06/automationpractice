package com.automationpractice.testbase;

import com.automationpractice.propertyreader.PropertyReader;
import com.automationpractice.utility.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utilities {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod(groups = {"smoke","sanity","regression"})
    public void tearDown(){
        closeBrowser();
    }
}
