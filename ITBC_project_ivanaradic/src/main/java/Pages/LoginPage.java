package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    private WebElement usernameField;
    private WebElement passwordField;
    private WebElement loginBtn;
    private WebElement newUserBtn;
    private WebElement invalidCredentialsErrorMsg;

    public LoginPage (WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public WebElement getUsernameField(){
        this.usernameField = getDriver().findElement(By.id("userName"));
        return usernameField;
    }
    public WebElement getPasswordField(){
        this.passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }
    public WebElement getLoginBtn(){
        this.loginBtn = getDriver().findElement(By.id("login"));
        return loginBtn;
    }
    public WebElement getInvalidCredentialsErrorMsg(){
        this.invalidCredentialsErrorMsg = getDriver().findElement(By.xpath("//p[@style='color: red;']"));
        return invalidCredentialsErrorMsg;
    }
    public WebElement getNewUserBtn(){
        this.newUserBtn = getDriver().findElement(By.id("newUser"));
        return newUserBtn;
    }
    public void openLoginPage(){
        getDriver().get("https://demoqa.com/login");
    }
    public void logInValidCredentials() {
        openLoginPage();
        getUsernameField().sendKeys("ivana");
        getPasswordField().sendKeys("novaL0ziNk4zaproj3kat$");
        getLoginBtn().click();
        getWait().until(ExpectedConditions.urlContains("/profile"));
    }
    public void logInInvalidCredentials(){
        openLoginPage();
        getUsernameField().sendKeys("anyname");
        getPasswordField().sendKeys("anypassword");
        getLoginBtn().click();
    }

}
