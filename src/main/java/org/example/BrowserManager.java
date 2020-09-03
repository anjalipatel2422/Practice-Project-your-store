package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;



public class BrowserManager extends Util {
   public static LoadProp loadProp=new LoadProp();
    public static String browser = loadProp.getProperty("Browser");
    public void setupBrowser() {
        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDrivers\\chromedriver.exe");//SETUP DRIVER PATH
            driver = new ChromeDriver();//create object of driver

        } else if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver", "src\\test\\resources\\BrowserDrivers\\IEDriverServer.exe");
            //creating ie object to open ie browser
            driver = new InternetExplorerDriver();
        } else
            {
            System.out.println("please enter valid browser");
        }driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//apply implicit wait
        driver.get(loadProp.getProperty("url"));
    }
        public void closeBrowser () {
            driver.close();
        }
}

