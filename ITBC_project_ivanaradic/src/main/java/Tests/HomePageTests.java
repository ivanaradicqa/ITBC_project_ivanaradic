package Tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{

    @Test
    public void verifyClickOnSeleniumBannerPath(){
        getHomePage().getSeleniumBanner().click();
        switchTabs(1);
        getWait().until(ExpectedConditions.urlContains("/selenium-training/"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/selenium-training/"));
    }
    @Test
    public void verifyClickOnElementsCardPath(){
        verticalScroll();
        getHomePage().getElementsCard().click();
        getWait().until(ExpectedConditions.urlContains("/elements"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/elements"));
    }
    @Test
    public void verifyClickOnFormsCardPath(){
        verticalScroll();
        getHomePage().getFormsCard().click();
        getWait().until(ExpectedConditions.urlContains("/forms"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/forms"));
    }
    @Test
    public void verifyClickOnAlertsCardPath(){
        verticalScroll();
        getHomePage().getAlertsCard().click();
        getWait().until(ExpectedConditions.urlContains("/alertsWindows"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/alertsWindows"));
    }
    @Test
    public void verifyClickOnWidgetsCardPath(){
        verticalScroll();
        getHomePage().getWidgetsCard().click();
        getWait().until(ExpectedConditions.urlContains("/widgets"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/widgets"));
    }
    @Test
    public void verifyClickOnInteractionsCardPath(){
        verticalScroll();
        getHomePage().getInteractionsCard().click();
        getWait().until(ExpectedConditions.urlContains("/interaction"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/interaction"));
    }
}
