package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

//    public final WebElement acceptPrivacyButton = findByCss("[id=onetrust-accept-btn-handler]", Duration.ofSeconds(20L));
//    public final WebElement headerSearchButton = findByCss(".aeo-icon-search",Duration.ofSeconds(20L));
//    public final WebElement headerAccountButton = findByCss(".aeo-icon-account",Duration.ofSeconds(10L));


    @FindBy(css = "[id=onetrust-accept-btn-handler]")
    public WebElement acceptPrivacyButton;
    @FindBy(css = ".aeo-icon-search")
    public WebElement headerSearchButton;
    @FindBy(css = ".aeo-icon-account")
    public WebElement headerAccountButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
        waitElements();
    }

    private void waitElements() {
        waitForVisibility(acceptPrivacyButton,20L);
        waitForVisibility(headerAccountButton,20L);
        waitForVisibility(headerSearchButton,10L);
    }
}
