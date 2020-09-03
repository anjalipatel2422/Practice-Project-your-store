package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Util{
    LoadProp loadProp=new LoadProp();
    private By _FirstName=By.xpath("//input[@name=\"firstname\"]");
    private By _LastName=By.xpath("//input[@name=\"lastname\"]");
    private By _Email=By.xpath("//input[@name=\"email\"]");
    private By _Telephone=By.xpath("//input[@name=\"telephone\"]");
    private By _PassWord=By.xpath("//input[@name=\"password\"]");
    private By _ConfirmPassword=By.xpath("//input[@name=\"confirm\"]");
    private By _NewSelter=By.xpath("//div[@class=\"col-sm-10\"]/label[2]/input");
    private By _PrivacyPolicy=By.xpath("//input[@name=\"agree\"]");
    private By _ContinueButton=By.xpath("//input[@type=\"submit\"]");
    public void RegistrationDetails(){
        waituntilElementisclickble(_FirstName,"20");
        typeText(_FirstName,loadProp.getProperty("FirstName"));
        typeText(_LastName,loadProp.getProperty("LastName"));
        typeText(_Email, loadProp.getProperty("Email1") + timestamp() + loadProp.getProperty("Email2"));
        typeText(_Telephone,loadProp.getProperty("Telephone"));
        typeText(_PassWord,loadProp.getProperty("PassWord"));
        typeText(_ConfirmPassword,loadProp.getProperty("ConfirmPassword"));
        clickonElement(_NewSelter);
        clickonElement(_PrivacyPolicy);
        clickonElement(_ContinueButton);
    }
}
