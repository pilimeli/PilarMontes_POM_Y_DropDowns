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
                WebDriver driverfirefox = new FirefoxDriver();
            break;
            case "chrome":
                driver = new ChromeDriver();
                System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
                WebDriver drivercrhome = new ChromeDriver();
            break;
            default:
               break;
        }
    }
    public WebDriver getDriver() {
        return this.driver;
    }
}
