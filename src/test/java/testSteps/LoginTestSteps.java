package testSteps;

import driver.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import sidebars.AccountSidebar;
import sidebars.LoggedInAccountSidebar;
import sidebars.SignInSidebar;

import static driver.DriverManager.getDriver;
import static utils.TestProperties.homepageUrl;

public class LoginTestSteps {
    public void openHomePage() {
        OpenPageSteps openPage = new OpenPageSteps();
        openPage.openPage(homepageUrl);
    }

    public void acceptPrivacyIfDisplayed() {
        HomePage homePage = new HomePage();
        if (homePage.acceptPrivacyButton.isDisplayed()) {
            homePage.acceptPrivacyButton.click();
            homePage.acceptPrivacyButton = null;
        }

    }

    public void clickAccountButton() {
        HomePage homepage = new HomePage();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(homepage.headerAccountButton).click().perform();
    }

    public void clickSidebarSingInButton() {
        AccountSidebar accountSidebar = new AccountSidebar();
        accountSidebar.signInButton.click();
    }

    public void inputEmailData(String email) {
        SignInSidebar signIn = new SignInSidebar();
        signIn.emailField.sendKeys(email);
    }

    public void inputPasswordData(String password) {
        SignInSidebar signIn = new SignInSidebar();
        signIn.passwordField.sendKeys(password);
    }

    public void clickSignInButton() {
        SignInSidebar signIn = new SignInSidebar();
        signIn.signInButton.click();
    }

    public void assertNegativeResult() {
        SignInSidebar signIn = new SignInSidebar();
        boolean signInIsDisplayed = signIn.signInButton.isDisplayed();
        Assert.assertTrue(signInIsDisplayed);
    }

    public void closeBrowser() {
        DriverManager.closeDriver();
    }

    public void assertPositiveResult() {
        LoggedInAccountSidebar loggedInAccount = new LoggedInAccountSidebar();
        boolean loginErrorDisplayed = loggedInAccount.loginError.isDisplayed();

        Assert.assertTrue(loginErrorDisplayed);
    }
}
