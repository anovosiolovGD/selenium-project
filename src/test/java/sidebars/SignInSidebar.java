package sidebars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.time.Duration;

public class SignInSidebar extends BasePage {
    @FindBy(css = "[name='username']")
    public WebElement emailField;
    @FindBy(css = "[name='password']")

    public WebElement passwordField;
    @FindBy(css = "[name='login']")
    public WebElement signInButton;

    @FindBy(css =".qa-btn-create-account")
    public WebElement createAccountButton;

    public SignInSidebar() {
        super();
    }
}
