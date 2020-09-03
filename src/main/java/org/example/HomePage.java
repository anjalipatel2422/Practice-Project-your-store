package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HomePage extends Util{
    SoftAssert softAssert = new SoftAssert();
    private String _ExpectedUrlHomePage="http://tutorialsninja.com/demo/";
    private By _PhoneAndPDAs=By.xpath("//a[text()=\"Phones & PDAs\"]");
    private By _MyAccount=By.xpath("//span[text()=\"My Account\"]");
    private By _Register=By.linkText("Register");
    private By _Laptops=By.linkText("Laptops & Notebooks");
    private By _ShowAllLaptops=By.linkText("Show All Laptops & Notebooks");

    public void VerifyuserisonHomePage(){
        String ActualUrlHomePage = driver.getCurrentUrl();
        softAssert.assertEquals((ActualUrlHomePage),_ExpectedUrlHomePage, "expected with actual");
        softAssert.assertAll();

    }public void verifyuserclickonMyAccountButtonAndRegister(){
       clickonElement(_MyAccount);
       clickonElement(_Register);
    }

    public void userClickOnCategoryLink(String categoryLink){
        clickonElement(By.linkText(categoryLink));
    }public void UserClickOnPhoneAndPDAs(){
        clickonElement(_PhoneAndPDAs);


    }
    public void userclickonLaptopsandAllLaptops(){
        clickonElement(_Laptops);
        clickonElement(_ShowAllLaptops);
    }

}

