package org.example;

import org.openqa.selenium.By;

public class CategoryPhones extends Util {
    private By _HTCAddToCart=By.xpath("//div[@class=\"row\"]/div[1]/div[1]/div[2]/div[2]/button/span");
    private By _iPhonesAddToCart=By.xpath("//div[@class=\"row\"]/div[2]/div[1]/div[2]/div[2]/button/span");
    private By _ShoppingCart=By.xpath("//span[text()=\"Shopping Cart\"]");
    public void  VerifyUserAddBothHTCiphoneProductToBeAddProductInToCart(){
       JavaScriptclickonElement(_HTCAddToCart);
       JavaScriptclickonElement(_iPhonesAddToCart);
    }
    public void  VerifyUserCanAbleToClickOnShoppingCartButton(){
        clickonElement(_ShoppingCart);
    }
}

