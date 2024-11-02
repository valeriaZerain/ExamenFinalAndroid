package demoApp;

import activities.demoapp.HomePage;
import activities.demoapp.SideBarMenu;
import activities.demoapp.SignInPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.Session;

public class DemoAppTestBase {
    HomePage homePage = new HomePage();
    SideBarMenu sideBarMenu = new SideBarMenu();
    SignInPage signInPage = new SignInPage();

    @BeforeEach
    public void before(){}

    @AfterEach
    public void after(){
        Session.getInstance().closeApp();
    }
}
