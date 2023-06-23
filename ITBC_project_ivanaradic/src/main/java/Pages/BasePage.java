package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public WebDriver getDriver(){
        return this.driver;
    }
    public WebDriverWait getWait(){
        return this.wait;
    }


}