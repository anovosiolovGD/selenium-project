import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import testSteps.SearchProductTestSteps;

@Listeners({AllureTestNg.class})
public class SearchTest extends BaseTest {

    @Test(description = "Search for products and verify the result count")
    @Description("Test to search for products and verify the number of search results")
    public void searchProductsTest() {
        SearchProductTestSteps steps = new SearchProductTestSteps();

        steps.openHomePage();
        steps.acceptPrivacyIfDisplayed();
        steps.clickHeaderSearchButton();
        steps.inputSearchProductId("slim fit");
        steps.clickSearchFieldButton();
        steps.assertResult(12);
        steps.closeBrowser();
    }
}
