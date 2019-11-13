package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends Util {

    @FindBy (xpath = "//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]")
    WebElement _signInsignSingUpFeild;

    public void clickOnSignUpLink(){
        clickOnElement(_signInsignSingUpFeild);
    }


}
