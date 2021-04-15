package com.globant.test;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Ejerciciopage;
import utils.MyDriver;

public class BaseTests {

    MyDriver myDriver;
    WebDriver driver;

    Ejerciciopage Ejercicio1;
    @BeforeSuite (alwaysRun = true)
    @Parameters ({"Browser"})
    public void beforesuite(String browser){
        myDriver = new MyDriver(browser);
        driver = myDriver.getDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
    }

    @Test
    public void selectDropdown(){
        Ejercicio1.setPrimerSelector();
    }



    }




