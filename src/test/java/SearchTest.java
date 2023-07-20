import org.testng.annotations.Test;
import testSteps.SearchProductTestSteps;

public class SearchTest extends BaseTest {
    @Test
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
