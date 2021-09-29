package ru.demo.mirapolis.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AbstractTest {

    protected WebDriver webDriver;

    @BeforeMethod
    public void setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearChromeDriver() {
        if (webDriver != null){
            webDriver.quit();
        }
        webDriver = null;
    }

}
