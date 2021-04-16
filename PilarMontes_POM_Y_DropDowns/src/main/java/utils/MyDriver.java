package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyDriver {
    private WebDriver driver;

    public MyDriver(String browser){
        switch (browser){
            case "firefox":
                driver = new FirefoxDriver();
                System.setProperty("Webdriver.firefox.driver", "C:\\Program Files\\Drivers\\geckodriver.exe");
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
