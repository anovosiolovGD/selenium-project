package testSteps;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.RealRewardAccountPage;
import sidebars.AccountSidebar;

import static driver.DriverManager.getDriver;
import static utils.TestProperties.homepageUrl;

public class CreateAccountTestSteps {

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

    public void clickCreateAccountButton() {
        AccountSidebar signIn = new AccountSidebar();
        signIn.createAccountButton.click();
    }

    public void inputEmailField(String email) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.emailField.sendKeys(email);
    }

    public void inputFirstNameField(String firstname) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.firstNameField.sendKeys(firstname);
    }

    public void inputLastNameField(String lastname) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.lastNameField.sendKeys(lastname);
    }

    public void inputPassword(String password) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.passwordField.submit();
        accountPage.passwordField.sendKeys(password);
    }

    public void inputConfirmPassword(String confirmPassword) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.confirmPasswordField.submit();
        accountPage.confirmPasswordField.sendKeys(confirmPassword);
    }

    public void inputZipCode(String postalCode) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.postalCodeField.sendKeys(postalCode);
    }

    public void inputBirthDate(String birthMonth, String birthDay) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.monthTab.sendKeys(birthMonth);
        accountPage.dayTab.sendKeys(birthDay);
    }

    public void clickAcceptConditionsButton() {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.acceptConditionsCheckbox.click();
    }

    public void clickAccountCreationButton() {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.createAccountButton.click();
    }
    public void clickAccount(){
        RealRewardAccountPage accountPage = new RealRewardAccountPage();
        accountPage.headerAccountButton.click();
    }

    public void assertResult() {
        AccountSidebar accountSidebar = new AccountSidebar();
        Assert.assertTrue(accountSidebar.signOutButton.isDisplayed());
    }

}
