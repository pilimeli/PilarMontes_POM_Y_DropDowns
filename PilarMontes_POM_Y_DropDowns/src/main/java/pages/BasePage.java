package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.Pageable;

public class BasePage {
    private WebDriver driver;


    public BasePage (WebDriver pDriver){
        PageFactory.initElements(pDriver, this);
        driver = pDriver;
    }
    public void clicOnSelect(WebElement element){
        element.click();
    }
    protected WebDriver getDriver(){

        return driver;
    }

    public void dispose(){
       if (driver !=null){
           driver.quit();
        }
    }
}
