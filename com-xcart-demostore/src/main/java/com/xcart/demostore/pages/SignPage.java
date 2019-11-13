package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SignPage extends Util {

    @FindBy (xpath = "//a[contains(@class,'popup-button default-popup-button create-account-link')]")
    WebElement _clickOnCreateNewAccount;

    public void createNewAccount() {

        clickOnElement(_clickOnCreateNewAccount);

    }

}
