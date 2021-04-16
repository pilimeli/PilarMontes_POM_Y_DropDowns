package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.html.Option;


public class BasePage {
    private WebDriver driver;
    private WebDriverWait webdriverwait;

    /**
     *
     * @param pDriver
     */
    public BasePage (WebDriver pDriver){
        PageFactory.initElements(pDriver, this);
        driver = pDriver;
    }
    public void clic(WebElement element){
        element.click();
    }

    public void selectOption(WebElement element,String opcion){
        Select selectObject = new Select(element);
        selectObject.selectByValue(opcion);
    }
    public void clicMultiSelect(){
        WebElement botonSelect = getDriver().findElement(By.cssSelector("#printMe"));
    }

    protected WebDriver getDriver(){
        return driver;
    }
    /**
     * Realiza wait
     * @return
     */
    public WebDriverWait getWait(){
        WebDriverWait wait = new WebDriverWait(driver,40 );
        this.webdriverwait = wait;
        return webdriverwait;
    }

    /**
     * Buscar elemento visible por selector
     * @param element
     */
    public void findElementUntilVisibility(String element){
        getWait().until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(element))));
    }
    public void findElementUntilVisibility(By element){
        getWait().until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }
    public String getElementText(WebElement element) {
        return element.getText();
    }

    /**
     * salir
     */
    public void dispose(){
       if (driver !=null){
           driver.quit();
        }
    }
}
