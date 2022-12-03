package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ElementHalper {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHalper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);
    }
    public WebElement PresenceElement(By key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public WebElement FindElement(By key){
        WebElement webElement = PresenceElement(key);
        return  webElement;
    }
    public void Click(By key){
        FindElement(key).click();
    }
    public void SendKey(By key, String text){
        FindElement(key).sendKeys(text);
    }
    public void CheckVisible(By key){
        wait.until(ExpectedConditions.visibilityOf(FindElement(key)));
    }

}