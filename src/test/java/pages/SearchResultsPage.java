package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(xpath = "//*[@class='img-responsive product-tile-image img-responsive']")
    public List<WebElement> searchResult;

    public List<WebElement> getSearchResult() {
        return searchResult;
    }

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
        driverImplicitlyWait(10L);
    }
}
