package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;



public class HotDealPage extends Util {

    @FindBy(xpath = "//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][contains(text(),'Hot deals')]")
    WebElement _hotDealsHooverMenu;

    @FindBy(xpath = "//li[@class='leaf has-sub']//span[contains(text(),'Sale')]")
    WebElement _salePage;


    public void clickOnSalePage() {

       WebDriverWait wait = new WebDriverWait(driver, 30);

        //Actions action = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(_hotDealsHooverMenu));
        mouseHoverToElement(_hotDealsHooverMenu);


       // action.moveToElement(_hotDealsHooverMenu).build().perform();
        clickOnElement(_hotDealsHooverMenu);
        clickOnElement(_salePage);
    }

}
