package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LapTops extends Util {
    private By _MacBook=By.xpath("//button[@onclick=\"cart.add('43', '1');\"]");
    public void verifyeachproducthaveAddtoCartButton(){//in class practice
        List<WebElement> productlist = driver.findElements(By.xpath("//div[@class=\"row\"]/div/div/div[2]/div[2]/button[1]"));
        System.out.println(productlist.size());
        //get each product name
        for (WebElement product:productlist
        ) {
            System.out.println(product.getText());
}
    }public void VerifyuserclickonHPLP30(){
        clickonElement(_MacBook);
    }
}
