package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.print.Pageable;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait webdriverwait;


    public BasePage (WebDriver pDriver){
        PageFactory.initElements(pDriver, this);
        driver = pDriver;
    }
    public void clic(WebElement element){
        element.click();
    }

    public void selectOption(WebElement element,String opcion){
        element.click();
        Select selectObject = new Select(element);
    }
    protected WebDriver getDriver(){
        return driver;
    }
    public WebDriverWait getWait(){
        WebDriverWait wait = new WebDriverWait(driver,20 );
        this.webdriverwait = wait;
        return webdriverwait;
    }
    public void findElementUntilVisibility(String element){
        getWait().until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(element))));
    }
    public void findElementUntilVisibility(By element){
        getWait().until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }

    public void dispose(){
       if (driver !=null){
           driver.quit();
        }
    }
}
