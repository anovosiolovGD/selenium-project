package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RealRewardAccountPage extends BasePage {
    @FindBy(css = ".aeo-icon-account")
    public WebElement headerAccountButton;

    public RealRewardAccountPage() {
        super();
        waitForVisibility(headerAccountButton, 30L);
    }
}
