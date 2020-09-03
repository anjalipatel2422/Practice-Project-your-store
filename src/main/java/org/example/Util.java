package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends BasePage {
    public static void waituntilElementisclickble(By by, String time) { //reusable method to wait until element is clickble
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }//reusable method
    public static void clickonElement(By by) {
        driver.findElement(by).click();
    }//reusable method from element is clickble
    public static String getText1(By by) {  //reusable method to get text from element
        return driver.findElement(by).getText();
    }
    public static void typeText(By by, String text) {//reusable method to type text in box
        driver.findElement(by).clear(); //clear existing text
        driver.findElement(by).sendKeys(text);
    }
    public static void selectfromdropdownbyvisibletext(By by, String text) {//reusable method select visible text
        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectfromdropdownbyindex(By by, int n) { //reusable method select index
        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(driver.findElement(by));
        select.selectByIndex(n);
    }

    public static void selefromdromdropdownbyvalue(By by, String value) { //reusable method select value
        org.openqa.selenium.support.ui.Select select = new Select((driver.findElement(by)));
        select.selectByValue(value);
    }

    public static void JavaScriptclickonElement(By by) { //reusable method for click on element in case of other clickble method not work
        WebElement element = driver.findElement(by);
        JavascriptExecutor javascript = (JavascriptExecutor) driver;
        javascript.executeScript("arguments[0].click();", element);

    }

    public static long timestamp() {//reusable method to get timestamp
        return (System.currentTimeMillis());
    }
    public static String  geturl(){
        return driver.getCurrentUrl();
    }
}

