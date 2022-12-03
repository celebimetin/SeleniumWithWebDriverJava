package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static WebDriver driver;
    private static Properties properties;
    public static WebDriver initialize_WebDriver(String browser){
        properties = ConfigReader.getProperties();
        if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        String  url = properties.getProperty("url");
        int pageLoadTimeOut = Integer.parseInt(properties.getProperty("pageLoadTimeOut"));
        int impliciyWait = Integer.parseInt(properties.getProperty("impliciyWait"));

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(pageLoadTimeOut, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(impliciyWait, TimeUnit.SECONDS);

        return getDriver();
    }
    public static WebDriver getDriver(){ return driver; }
}