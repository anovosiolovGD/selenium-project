package sidebars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.time.Duration;

public class LoggedInAccountSidebar extends BasePage {
    @FindBy(css = "[data-test-form-error='common.error.ajax_error']")
    public WebElement loginError;

    public LoggedInAccountSidebar() {
        super();
        waitForVisibility(loginError, 10L);
    }
}
