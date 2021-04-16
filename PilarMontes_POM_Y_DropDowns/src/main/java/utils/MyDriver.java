package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyDriver {
    private WebDriver driver;

    public MyDriver(String browser){
        switch (browser){
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:/sdk/Drivers/geckodriver.exe");
                 driver = new FirefoxDriver();
                //WebDriver driverfirefox = new FirefoxDriver();
            break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:/sdk/Drivers/chromedriver.exe");
                driver = new ChromeDriver();
               //WebDriver drivercrhome = new ChromeDriver();
            break;
            default:
                break;
        }
    }
    public WebDriver getDriver() {
        return this.driver;
    }
}
