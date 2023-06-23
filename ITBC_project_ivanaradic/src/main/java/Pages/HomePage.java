package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class HomePage extends BasePage{

    private WebElement seleniumBanner;
    private WebElement elementsCard;
    private WebElement formsCard;
    private WebElement alertsCard;
    private WebElement widgetsCard;
    private WebElement interactionsCard;

    public HomePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public WebElement getFormsCard(){
        this.formsCard = getDriver().findElement(By.xpath("//div[@class='card-body']//h5[contains(text(), 'Forms')]"));
        return formsCard;
    }
    public WebElement getSeleniumBanner(){
        this.seleniumBanner = getDriver().findElement(By.xpath("//div[@class='home-banner']//a"));
        return seleniumBanner;
    }
    public WebElement getElementsCard(){
        this.elementsCard = getDriver().findElement(By.xpath("//div[@class='card-body']//h5[contains(text(), 'Elements')]"));
        return elementsCard;
    }
    public WebElement getAlertsCard(){
        this.alertsCard = getDriver().findElement(By.xpath("//div[@class='card-body']//h5[contains(text(), 'Alerts')]"));
        return alertsCard;
    }
    public WebElement getWidgetsCard(){
        this.widgetsCard = getDriver().findElement(By.xpath("//div[@class='card-body']//h5[contains(text(), 'Widgets')]"));
        return widgetsCard;
    }
    public WebElement getInteractionsCard() {
        this.interactionsCard = getDriver().findElement(By.xpath("//div[@class='card-body']//h5[contains(text(), 'Interactions')]"));
        return interactionsCard;
    }

}
