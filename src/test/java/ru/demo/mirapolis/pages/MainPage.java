package ru.demo.mirapolis.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(className = "avatar-full-name")
    private WebElement fullName;

    public void testFullName() {
        Assertions.assertThat(fullName.getText()).isEqualTo("Фомина Елена Сергеевна");
    }

}
