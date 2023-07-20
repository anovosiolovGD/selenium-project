package pages;

import driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
    public void waitForVisibility(WebElement element, long timeOutInSeconds) {
        new WebDriverWait(driver, timeOutInSeconds)
                .until(ExpectedConditions.visibilityOf(element));
    }
    public void driverImplicitlyWait(long timeOutInSeconds){
        driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS);
    }
}
