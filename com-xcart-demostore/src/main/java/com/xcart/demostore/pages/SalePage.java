package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SalePage extends Util {

   @FindBy (xpath = "//a[contains(text(),'Lace-Up Boots in Light Brown')]")
    WebElement _clickOnLaceUpBoot;

   @FindBy (xpath = "//h1[@class='fn title']")
    WebElement _laceUpBootInLightBrownText;



   public void clickOnLaceUpBootInLightBrown(){
       clickOnElement(_clickOnLaceUpBoot);
   }
   public String laceUpBootText(){
       return getTextFromElement(_laceUpBootInLightBrownText);

   }
}
