package pages;

import driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    public WebElement findByXpath(String xpath, Duration duration) {
        return driver.findElement(waitForElementPresent(By.xpath(xpath), duration.getSeconds()));
    }

    public WebElement findByXpath(String xpath) {
        return findByXpath(xpath, Duration.ofSeconds(5L));
    }

    public WebElement findByCss(String css, Duration duration) {
        return driver.findElement(waitForElementPresent(By.cssSelector(css), duration.getSeconds()));

    }

    public WebElement findByCss(String css) {
        return findByCss(css, Duration.ofSeconds(5L));
    }

    public List<WebElement> findElementsByXpath(String xpath, Duration duration) {
        return driver.findElements(waitForElementPresent(By.xpath(xpath), duration.getSeconds()));
    }

    public WebDriverWait getWaiter(long timeOutInMills) {
        WebDriverWait waiter = new WebDriverWait(driver, timeOutInMills);
        waiter
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(TimeoutException.class);
        return waiter;
    }

    public By waitForElementPresent(By findStrategy, long timeOutInMills) {
        getWaiter(timeOutInMills).until(ExpectedConditions.presenceOfElementLocated(findStrategy));
        return findStrategy;
    }

    public void waitForVisibility(WebElement element, long timeOutInSeconds) {
        new WebDriverWait(driver, timeOutInSeconds)
                .until(ExpectedConditions.visibilityOf(element));
    }
}
