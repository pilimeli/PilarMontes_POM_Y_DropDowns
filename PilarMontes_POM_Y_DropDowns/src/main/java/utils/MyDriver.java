package utils;
import org.openqa.selenium.WebDriver;


public class MyDriver {
    private WebDriver driver;

    public MyDriver(String browser){
        switch (browser){
            case "firefox":
                driver = new FirefoxDriver();
                System.setProperty("Webdriver.firefox.driver", "C:\\Program Files\\Drivers\\geckodriver.exe");
                WebDriver driver = new FirefoxDriver();
            break;
            case "chrome":
                driver = new CrhomeDriver();
                System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
            break;
            default:
               break;
        }
    }
    public WebDriver getDriver() {
        return this.driver;
    }
}
