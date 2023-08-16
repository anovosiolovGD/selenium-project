package testSteps;

import driver.DriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.qameta.allure.testng.AllureTestNg;
import org.jbehave.core.model.Scenario;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import pages.HomePage;
import sidebars.AccountSidebar;
import sidebars.LoggedInAccountSidebar;
import sidebars.SignInSidebar;
import utils.ScenarioContext;

import static driver.DriverManager.getDriver;


@Listeners({AllureTestNg.class})
public class LoginTestSteps {
    @Step(value = "User open homepage")
    public void openHomePage() {
        OpenPageSteps openPage = new OpenPageSteps();
        openPage.openPage(ScenarioContext.getInstance().get("homepageUrl", String.class));
    }

    @Step("Accept privacy")
    public void acceptPrivacyIfDisplayed() {
        HomePage homePage = new HomePage();
        if (homePage.acceptPrivacyButton != null) {
            homePage.acceptPrivacyButton.click();

        }

    }

    @Step("Click header account button.")
    @Attachment
    public void clickAccountButton() {
        HomePage homepage = new HomePage();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(homepage.headerAccountButton).click().perform();
    }

    @Step("Click sigh in button")
    public void clickSidebarSignInButton() {
        AccountSidebar accountSidebar = new AccountSidebar();
        accountSidebar.signInButton.click();
    }

    @Step("User input email : {email}")
    public void inputEmailData(String email) {
        SignInSidebar signIn = new SignInSidebar();
        signIn.emailField.sendKeys(email);
    }

    @Step("User input password : {password}")
    public void inputPasswordData(String password) {
        SignInSidebar signIn = new SignInSidebar();
        signIn.passwordField.sendKeys(password);
    }

    @Step("Click sign in button")
    public void clickSignInButton() {
        SignInSidebar signIn = new SignInSidebar();
        signIn.signInButton.click();
    }

    @Step("Assert negative result")
    public void assertNegativeResult() {
        SignInSidebar signIn = new SignInSidebar();
        boolean signInIsDisplayed = signIn.signInButton.isDisplayed();
        Assert.assertTrue(signInIsDisplayed);
    }

    @Step("Assert positive result")
    public void assertPositiveResult() {
        LoggedInAccountSidebar loggedInAccount = new LoggedInAccountSidebar();
        boolean loginErrorDisplayed = loggedInAccount.loginError.isDisplayed();

        Assert.assertTrue(loginErrorDisplayed);
    }

    public void closeBrowser() {
        DriverManager.closeDriver();
    }
}
