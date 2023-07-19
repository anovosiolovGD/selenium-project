package pages;

import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage extends BasePage {

    private final List<WebElement> searchResult = findElementsByXpath("//*[@class='img-responsive product-tile-image img-responsive']", Duration.ofSeconds(30L));

    public List<WebElement> getSearchResult() {
        return searchResult;
    }
}
