import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testSteps.LoginTestSteps;
import utils.ScenarioContext;

@Listeners({AllureTestNg.class})
public class LoginTest extends BaseTest {
    protected ScenarioContext context = ScenarioContext.getInstance();
    @Test(priority = 1)
    @Description("Negative login test. User introduce wrong data.")
    public void loginNegativeTest() {
        LoginTestSteps steps = new LoginTestSteps();
        steps.openHomePage();
        steps.acceptPrivacyIfDisplayed();
        steps.clickAccountButton();
        steps.clickSidebarSignInButton();
        steps.inputEmailData("");
        steps.inputPasswordData("");
        steps.clickSignInButton();
        steps.assertNegativeResult();
        steps.closeBrowser();
    }

    @Test(priority = 2)
    @Description("Positive login test. User introduce correct data.")
    public void loginPositiveTest() {
        LoginTestSteps steps = new LoginTestSteps();
        steps.openHomePage();
        steps.acceptPrivacyIfDisplayed();
        steps.clickAccountButton();
        steps.clickSidebarSignInButton();
        steps.inputEmailData(context.get("email",String.class));
        steps.inputPasswordData(context.get("password", String.class));
        steps.clickSignInButton();
        steps.assertPositiveResult();
        steps.closeBrowser();
    }
}
