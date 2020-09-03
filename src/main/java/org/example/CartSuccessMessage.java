package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartSuccessMessage extends Util {
    //private By _HTCSuccessText=By.xpath("//div[@class=\"table-responsive\"]/table/tbody/tr[1]/td[2]/a");
    private By _HTCSuccessText = By.linkText("HTC Touch HD");
   // private  By _iPhoneSuccessText=By.xpath("//div[@class=\"table-responsive\"]/table/tbody/tr[2]/td[2]/a");
    private  By _iPhoneSuccessText=By.linkText("iPhone");
    String _ExpextedSuccessText="HTC Touch HD";//write success message
    String _ExpectedSuccessText1="iPhone";
    private By _MacBookSuccess=By.linkText("MacBook");
    String _ExpextedSuccessText2="MacBook";//write success message
    public void verifycartsuccessfullly(){
        Assert.assertEquals(getText1(_MacBookSuccess),_ExpextedSuccessText2);
    }
    public void VerifyUserSeeTwoProductInShoppingCart(){
        waituntilElementisclickble(_HTCSuccessText,"20");
        Assert.assertEquals(getText1(_HTCSuccessText),_ExpextedSuccessText);
        Assert.assertEquals(getText1(_iPhoneSuccessText),_ExpectedSuccessText1);
    }
}
