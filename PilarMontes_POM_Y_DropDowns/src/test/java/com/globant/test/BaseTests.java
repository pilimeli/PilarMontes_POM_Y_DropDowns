package com.globant.test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import utils.MyDriver;

public class BaseTests {

    protected MyDriver myDriver;
    protected WebDriver driver;
    /**
     * Levantar el Browser
     * @param browser
     */
    @BeforeSuite (alwaysRun = true)
    @Parameters ({"browser"})
    public void beforesuite(String browser){
        myDriver = new MyDriver(browser);
        driver = myDriver.getDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
    }
}




