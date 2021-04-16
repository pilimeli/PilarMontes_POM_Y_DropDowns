package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ejerciciopage extends BasePage {

    public Ejerciciopage(WebDriver pDriver) {
        super(pDriver);
    }

    /**
     * selector dropdown Monday
     * @param opcion
     */
    public void selectDropdown(String opcion){
        WebElement primerSelector = getDriver().findElement(By.cssSelector("#select-demo"));
        this.selectOption(primerSelector, opcion);
    }
    /**
     * Selector label Monday
     * @return
     */
    public String getDayLabel(){
        WebElement selector = getDriver().findElement(By.cssSelector(".selected-value"));
        return selector.getText();
    }
}
