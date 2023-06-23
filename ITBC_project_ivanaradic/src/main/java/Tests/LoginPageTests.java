package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest{

    @Test
    public void verifyLogInWithValidCredentials(){
        getLoginPage().logInValidCredentials();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/profile"));
    }
    @Test
    public void verifyLogInNotPossibleWithInvalidCredentials(){
        getLoginPage().logInInvalidCredentials();
        Assert.assertFalse(getDriver().getCurrentUrl().contains("/profile"));
    }

}
