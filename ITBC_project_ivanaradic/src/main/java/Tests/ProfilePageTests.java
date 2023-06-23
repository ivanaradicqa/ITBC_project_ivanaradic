package Tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfilePageTests extends BaseTest{


    @Test
    public void verifyGoToBookstorePath() {
        getLoginPage().logInValidCredentials();
        verticalScroll();
        getProfilePage().getGoToBookstoreBtn().click();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/books"));
    }
    @Test
    public void verifyDeleteAccount(){
        getLoginPage().logInValidCredentials();
        verticalScroll();
        getProfilePage().clickBtn(getProfilePage().getDeleteAccountBtn());
        getWait().until(ExpectedConditions.visibilityOf(getProfilePage().getModalDialogPopUp()));
        getProfilePage().clickBtn(getProfilePage().getModalOkBtn());
        getWait().until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();
        getLoginPage().getUsernameField().sendKeys("ivana");
        getLoginPage().getPasswordField().sendKeys("novaL0ziNk4zaproj3kat$");
        verticalScroll();
        getLoginPage().getLoginBtn().click();
        Assert.assertFalse(getDriver().getCurrentUrl().contains("/profile"));
    }

}
