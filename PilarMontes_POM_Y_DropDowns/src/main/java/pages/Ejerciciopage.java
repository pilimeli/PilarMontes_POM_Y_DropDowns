package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ejerciciopage extends BasePage {

    private WebDriver driver;
    private WebElement primerSelector = driver.findElement(By.cssSelector(""));

    public Ejerciciopage(WebDriver pDriver) {
        super(pDriver);
    }

    public void setPrimerSelector(){
        clicOnSelect(primerSelector);
    }
}
