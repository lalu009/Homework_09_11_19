package com.xcart.demostore.testsuit;

import com.xcart.demostore.pages.*;
import com.xcart.demostore.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSuit extends TestBase {


    @Test
    public void userShoulgNavigateToBrownShoesPage(){

        HomePage homepage = new HomePage();
        HotDealPage hotDealPage= new HotDealPage();
        NewAccountPage newAccountPage = new NewAccountPage();
        SalePage salePage = new SalePage();
        SignPage signPage=new SignPage();


        homepage.clickOnSignUpLink();

        signPage.createNewAccount();

        newAccountPage.enterEmailAddress();
        newAccountPage.enterPassword();
        newAccountPage.enterConfirmPassword();
        newAccountPage.clickonCreateField();

        hotDealPage.clickOnSalePage();

        salePage.clickOnLaceUpBootInLightBrown();
        Assert.assertEquals("Lace-Up Boots in Light Brown",salePage.laceUpBootText());

    }
}
