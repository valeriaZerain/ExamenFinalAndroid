package demoApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SignInTest extends DemoAppTestBase{
    @Test
    public void signInSuccessfully() throws InterruptedException {
        homePage.menuButton.click();
        sideBarMenu.signInButton.click();
        signInPage.usernameButton.click();
        signInPage.demouserButton.click();
        signInPage.passwordButton.click();
        signInPage.testingPassword.click();
        signInPage.sigInButton.click();
        homePage.menuButton.click();
        Assertions.assertTrue(sideBarMenu.logOutButton.isControlDisplayed(),"ERROR! The login was not successfully");
        sideBarMenu.logOutButton.click();
        Thread.sleep(5000);
        homePage.menuButton.click();
        Assertions.assertTrue(sideBarMenu.signInButton.isControlDisplayed(),"ERROR! The logout was not successfully");
    }
}
