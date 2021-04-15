package pages;

import org.openqa.selenium.WebDriver;

import java.awt.print.Pageable;

public class abstract class  BasePage {
    private WebDriver driver;


    public BasePage (WebDriver pDriver){
         PA

        driver= pDriver;
    }
    protected WebDriver getDriver(){
        return driver;
    }

    //public void dispose(){
       // if (driver !=null){
           // driver.quit();
        }
    }
}
