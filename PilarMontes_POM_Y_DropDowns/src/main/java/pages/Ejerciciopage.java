package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Ejerciciopage extends BasePage {
    @FindBy(css = "#select-demo")
    private WebElement drpDays;

    @FindBy(css = "p.getall-selected")
    private WebElement labelCity;

    @FindBy(css = "#printMe")
    private WebElement buttonCity;

    public Ejerciciopage(WebDriver pDriver) {
        super(pDriver);
    }

    /**
     * selector dropdown Monday
     * @param opcion
     */
    public void selectDropdown(String opcion){
        getWait().until(ExpectedConditions.elementToBeClickable(drpDays));
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

    /**
     * Selector ejercicio2
     */

    public void multiSelect(String opcion){
        Select drpSelectEstates = new Select(getDriver().findElement(By.cssSelector("#multi-select")));
        //System.out.println("opcion"+opcion);
        drpSelectEstates.selectByVisibleText(opcion);
        //this.selectOption(primerMultiselect, opcion);
        clicMultiSelect();
    }

    public void button (){
        getWait().until(ExpectedConditions.elementToBeClickable(buttonCity));
        buttonCity.click();
    }

    public String cityLabel (){
        getWait().until(ExpectedConditions.visibilityOf(labelCity));
        String labelText = labelCity.getText();
        return labelText;
    }

}
