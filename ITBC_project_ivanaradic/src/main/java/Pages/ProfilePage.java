package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage{
    private WebElement goToBookstoreBtn;
    private WebElement deleteAccountBtn;
    private WebElement modalDialogPopUp;
    private WebElement modalOkBtn;
    private WebElement logOutBtn;


    public ProfilePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public WebElement getGoToBookstoreBtn(){
        this.goToBookstoreBtn = getDriver().findElement(By.xpath("//button[contains(text(), 'Store')]"));
        return goToBookstoreBtn;
    }
    public WebElement getDeleteAccountBtn(){
        this.deleteAccountBtn = getDriver().findElement(By.xpath("//button[contains(text(), 'Account')]"));
        return deleteAccountBtn;
    }
    public WebElement getModalDialogPopUp(){
        this.modalDialogPopUp = getDriver().findElement(By.xpath("//div[@class='modal-body']"));
        return modalDialogPopUp;
    }
    public WebElement getModalOkBtn(){
        this.modalOkBtn = getDriver().findElement(By.id("closeSmallModal-ok"));
        return modalOkBtn;
    }
    public WebElement getLogOutBtn(){
        this.logOutBtn = getDriver().findElement(By.id("submit"));
        return logOutBtn;
    }

    public void clickBtn(WebElement element){
        element.click();
    }

}
