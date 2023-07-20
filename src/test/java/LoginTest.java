import org.testng.annotations.Test;
import testSteps.LoginTestSteps;

public class LoginTest extends BaseTest {
    @Test(priority = 1)
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

    @Test(priority = 2)
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
