package sidebars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.time.Duration;

public class SearchSidebar extends BasePage {
    @FindBy(css = "[type=search]")
    public WebElement inputSearchField;
    @FindBy(css = "[type='submit']")
    public WebElement searchFieldButton;

    public SearchSidebar() {
        super();
    }
}
