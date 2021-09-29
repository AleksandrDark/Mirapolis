package ru.demo.mirapolis.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = ".field > input")
    private WebElement login;
    @FindBy(css = ".field div input")
    private WebElement password;
    @FindBy(id = "button_submit_login_form")
    private WebElement loginButton;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openSite() {
        webDriver.navigate().to(URL);
    }

    public void testBrowserTitle() {
        Assertions.assertThat(webDriver.getTitle()).isEqualTo("Авторизация");
    }

    public void performPositiveAuthorization() {
        login.sendKeys("fominaelena");
        password.sendKeys("1P73BP4Z");
        loginButton.click();
    }

    public void performNegativeAuthorization() {
        login.sendKeys("fominaelena");
        password.sendKeys("8E888R888Z");
        loginButton.click();
    }

    public void performEmptyPassword() {
        login.sendKeys("fominaelena");
        password.sendKeys("");
        loginButton.click();
    }

    public void acceptAlert() {
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
    }

}
