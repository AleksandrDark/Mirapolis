package ru.demo.mirapolis.testlogic;

import org.testng.annotations.Test;
import ru.demo.mirapolis.pages.LoginPage;
import ru.demo.mirapolis.pages.MainPage;
import ru.demo.mirapolis.util.AbstractTest;

public class LoginPageTest extends AbstractTest {

    @Test
    public void testPositiveLoginPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.openSite();
        loginPage.performPositiveAuthorization();
        MainPage mainPage = new MainPage(webDriver);
        mainPage.testFullName();
    }

    @Test
    public void testNegativeLoginPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.openSite();
        loginPage.performNegativeAuthorization();
        loginPage.acceptAlert();
        loginPage.testBrowserTitle();
    }

    @Test
    public void testEmptyLoginPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.openSite();
        loginPage.performEmptyPassword();
        loginPage.acceptAlert();
        loginPage.testBrowserTitle();
    }

}
