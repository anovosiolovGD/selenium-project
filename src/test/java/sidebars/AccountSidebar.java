package sidebars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.time.Duration;

public class AccountSidebar extends BasePage {
    @FindBy(css = "[name=signin]")
    public WebElement signInButton;

    @FindBy(css = ".btn-sign-out")
    public WebElement signOutButton;

    @FindBy(css = ".qa-btn-register")
    public WebElement createAccountButton;

    public AccountSidebar (){
        super();
    }
}
