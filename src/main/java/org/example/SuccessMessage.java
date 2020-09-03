package org.example;

import org.testng.asserts.SoftAssert;

public class SuccessMessage  extends Util{
    SoftAssert softAssert=new SoftAssert();
    private String expectedUrl="http://tutorialsninja.com/demo/index.php?route=account/success";
    public void VerificationFinalMessage(){
        String AcutalUrl=driver.getCurrentUrl();
        softAssert.assertEquals((AcutalUrl),expectedUrl, "expected with actual");
        softAssert.assertAll();
    }
}
