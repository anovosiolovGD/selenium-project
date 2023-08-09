package testSteps;

import driver.DriverManager;
import org.jbehave.core.annotations.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.SearchResultsPage;
import sidebars.SearchSidebar;

import static driver.DriverManager.getDriver;
import static utils.TestProperties.homepageUrl;


public class SearchProductTestSteps {
    @Given("the user is on the homepage")
    public void openHomePage() {
        OpenPageSteps openPage = new OpenPageSteps();
        openPage.openPage(homepageUrl);
    }

    @When("accept button appears, user pushes it")
    public void acceptPrivacyIfDisplayed() {
        HomePage homePage = new HomePage();
        homePage.acceptPrivacyButton.click();

    }

    @When("user clicks on header search button")
    public void clickHeaderSearchButton() {
        HomePage homePage = new HomePage();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(homePage.headerSearchButton).click().perform();
    }

    @When("the user searches for \"$productId\"")
    public void inputSearchProductId(@Named("product") String productId) {
        SearchSidebar searchSidebar = new SearchSidebar();
        searchSidebar.inputSearchField.sendKeys(productId);
    }
    @When ("clicks search button")
    public void clickSearchFieldButton() {
        SearchSidebar searchSidebar = new SearchSidebar();
        searchSidebar.searchFieldButton.click();
    }

    @Then("the search results page is displayed and the user sees \"$numberOfExpectedProducts\" of search results for \"$productId\"")
    public void assertResult(@Named("number") int numberOfExpectedProducts) {
        SearchResultsPage searchResults = new SearchResultsPage();
        int actualNumbersOfFoundedElements = searchResults.getSearchResult().size();
        Assert.assertEquals(numberOfExpectedProducts, actualNumbersOfFoundedElements);
    }

    @AfterScenario
    public void closeBrowser() {
        DriverManager.closeDriver();
    }
}
