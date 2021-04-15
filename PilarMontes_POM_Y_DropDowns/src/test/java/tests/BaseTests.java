package com.globant.tests;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MyDriver;

public class BaseTests {

    MyDriver myDriver;
    WebDriver driver;

   private seleniumEasypage seleniunpage;

    @BeforeSuite (alwaysRun = true);
    @Parameters ({"Browser"})
           public  void beforesuite(String browser){
            myDriver = new MyDriver(browser);//
            driver = myDriver.getDriver();
           driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html")
                   seleniunpage = new seleniumEasypage (driver);//
       }
      @AfterSuite(alwaysRun = true)
      public void afterSuite() {
         seleniunpage.dispose();
       }

      public seleniumEasypage getSeleniunpage() {//
       return seleniunpage;//
    }
}



