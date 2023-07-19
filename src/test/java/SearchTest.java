import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @Test(priority = 1)
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

    @Test(priority = 2)
    public void loginNegativeTest() {
        LoginTestSteps steps = new LoginTestSteps();
        steps.openHomePage();
        steps.acceptPrivacyIfDisplayed();
        steps.clickAccountButton();
        steps.clickSidebarSingInButton();
        steps.inputEmailData("");
        steps.inputPasswordData("");
        steps.clickSignInButton();
        steps.assertNegativeResult();
        steps.closeBrowser();
    }

    @Test(priority = 3)
    public void loginPositiveTest() {
        LoginTestSteps steps = new LoginTestSteps();
        steps.openHomePage();
        steps.acceptPrivacyIfDisplayed();
        steps.clickAccountButton();
        steps.clickSidebarSingInButton();
        steps.inputEmailData("store.api.GD@gmail.com");
        steps.inputPasswordData("passwordForTest1");
        steps.clickSignInButton();
        steps.assertPositiveResult();
        steps.closeBrowser();
    }
}
