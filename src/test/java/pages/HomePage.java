package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(id = "onetrust-accept-btn-handler")
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
//        waitForVisibility(acceptPrivacyButton,20L);
//        waitForVisibility(headerAccountButton,20L);
//        waitForVisibility(headerSearchButton,10L);
    }
}
