import driver.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.SearchResultsPage;
import pages.HomePage;
import testSteps.OpenPageSteps;
import sidebars.SearchSidebar;

import static driver.DriverManager.getDriver;

public class SearchProductTestSteps {
    public void openHomePage() {
        OpenPageSteps openPage = new OpenPageSteps();
        String homepage = "https://www.ae.com/";
        openPage.openHomePage(homepage);
    }

    public void acceptPrivacyIfDisplayed() {
        HomePage homePage = new HomePage();
        if (homePage.acceptPrivacyButton.isDisplayed()) {
            homePage.acceptPrivacyButton.click();
        }

    }

    public void clickHeaderSearchButton() {
        HomePage homePage = new HomePage();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(homePage.headerSearchButton).click().perform();

    }

    public void inputSearchProductId(String productId) {
        SearchSidebar searchSidebar = new SearchSidebar();
        searchSidebar.inputSearchField.sendKeys(productId);
    }

    public void clickSearchFieldButton() {
        SearchSidebar searchSidebar = new SearchSidebar();
        searchSidebar.searchFieldButton.click();
    }

    public void assertResult(int numberOfExpectedProducts) {
        SearchResultsPage searchResults = new SearchResultsPage();
        int actualNumbersOfFoundedElements = searchResults.getSearchResult().size();
        Assert.assertEquals(numberOfExpectedProducts, actualNumbersOfFoundedElements);
    }

    public void closeBrowser() {
        DriverManager.closeDriver();
    }
}
