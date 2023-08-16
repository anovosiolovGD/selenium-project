package sidebars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.time.Duration;

public class AccountSidebar extends BasePage {
    @FindBy(css = ".qa-btn-signin")
    public WebElement signInButton;

    @FindBy(css = ".btn-sign-out")
    public WebElement signOutButton;

    @FindBy(xpath = "//*[contains (@class,\"qa-btn-register\")]")
    public WebElement createAccountButton;

    public AccountSidebar (){
        super();
    }
}
