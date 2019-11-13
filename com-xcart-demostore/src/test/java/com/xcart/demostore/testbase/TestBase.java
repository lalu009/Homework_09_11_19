package com.xcart.demostore.testbase;

import com.xcart.demostore.basepage.BasePage;
import com.xcart.demostore.browserselector.BrowserSelector;
import com.xcart.demostore.loadproperties.LoadProperties;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase extends BasePage {


    String browser = new LoadProperties().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp() {

        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void closeDown() {
         driver.quit();
    }
}
