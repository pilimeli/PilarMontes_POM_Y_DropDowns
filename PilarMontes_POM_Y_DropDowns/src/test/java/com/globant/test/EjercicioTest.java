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

    @Test(dataProvider = "data-provider")
    public void primerSelector (String data){
        page.selectDropdown(data);
        Assert.assertEquals(page.getDayLabel(),"Day selected :- " + data);
    }
    /**
     * dataprovider definición
     * @return
     */
    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod()
    {
        return new Object[][] {{ "Monday" }};
    }
    @AfterTest
    public void cerrarPage(){
        page.dispose();
    }

}






