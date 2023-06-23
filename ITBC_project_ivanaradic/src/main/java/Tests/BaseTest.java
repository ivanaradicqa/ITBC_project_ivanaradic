package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;
import java.util.ArrayList;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProfilePage profilePage;

    public WebDriver getDriver(){
        return this.driver;
    }
    public WebDriverWait getWait(){
        return this.wait;
    }
    public HomePage getHomePage(){
        return this.homePage;
    }
    public LoginPage getLoginPage(){
        return this.loginPage;
    }
    public ProfilePage getProfilePage(){
        return this.profilePage;
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Ivana//Desktop//Documents za Selenium//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        profilePage = new ProfilePage(driver, wait);
    }

    @BeforeMethod
    public void getUrl(){
        driver.get("https://demoqa.com/");
    }


    @AfterClass
    public void cleanUp(){
        driver.close();
    }

    public void switchTabs(int i){
        ArrayList<String> openTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(openTabs.get(i));
    }

    public void verticalScroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300)");
    }

}
