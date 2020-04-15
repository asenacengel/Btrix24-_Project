package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    //same for everyone
    private static WebDriver driver;

    //so no one can create object of Driver class
    //everyone should call static getter method instead
    private Driver() {
    }


    public static WebDriver getDriver() {
        //if webdriver object doesn't exist
        //create it
        String browser = ConfigurationReader.getProperty("browser");
        if (driver == null) {
            //specify browser type in configuration.properties file

            if (browser.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.equals("headless chrome")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.setHeadless(true);
                driver = new ChromeDriver(options);

            }
        }
        return driver;
    }


    public static void closeDriver() {

            driver.quit();


    }

}
