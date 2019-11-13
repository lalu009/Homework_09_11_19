package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class NewAccountPage extends Util {

    @FindBy(id = "login")
    WebElement _emailField;

    @FindBy(id = "password")
    WebElement _passwordField;

    @FindBy (id = "password-conf")
    WebElement _confirmPassword;

    @FindBy (xpath = "//span[contains(text(),'Create')]")
    WebElement _createField;






    public void enterEmailAddress() {

        String randomEmail = "lala" + generateRandomNumber() + "@gmail.com";
        sendTextToElement(_emailField, randomEmail);
    }

    public void enterPassword() {

        sendTextToElement(_passwordField, "Pureabcd1234");


    }
    public void enterConfirmPassword(){
        sendTextToElement(_confirmPassword,"Pureabcd1234");

    }
    public void clickonCreateField(){
        clickOnElement(_createField);
    }

}



