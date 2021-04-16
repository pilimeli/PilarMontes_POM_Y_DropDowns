package com.globant.test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Ejerciciopage;

public class EjercicioTest extends BaseTests {
    Ejerciciopage page;

    @BeforeTest
    public void setUppage(){
        page = new Ejerciciopage(driver);
    }

    /**
     * select day label
     * @param data
     */
    @Test(dataProvider = "data-provider")
    public void primerSelector (String data){
        page.selectDropdown(data);
        Assert.assertEquals(page.getDayLabel(),"Day selected :- " + data);
    }

    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod()
    {
        return new Object[][] {{ "Monday" }};
    }

    @DataProvider(name = "multiselect-provider")
    public static Object[][] multiDataSelectMethod()
    {
        return new Object[][] {{ "Texas" }};
    }

    @Test(dataProvider = "multiselect-provider")
    public void multiSelectTest (String data){
        page.multiSelect(data);
        page.button();
        Assert.assertEquals(page.cityLabel(),"First selected option is : " + data);
    }

    @AfterTest
    public void cerrarPage(){
        page.dispose();
    }

}






