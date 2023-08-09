package testSteps;

import driver.DriverManager;
import org.jbehave.core.annotations.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.RealRewardAccountPage;
import sidebars.AccountSidebar;

import static driver.DriverManager.getDriver;
import static utils.TestProperties.homepageUrl;

public class CreateAccountTestSteps {
    @Given("the user is on the homepage")
    public void openHomePage() {
        OpenPageSteps openPage = new OpenPageSteps();
        openPage.openPage(homepageUrl);
    }
    @When("accept button appears, user clicks it")
    public void acceptPrivacy() {
        HomePage homePage = new HomePage();
        homePage.acceptPrivacyButton.click();
    }
    @When("user clicks on header account button")
    public void clickAccountButton() {
        HomePage homepage = new HomePage();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(homepage.headerAccountButton).click().perform();
    }
    @When("account sidebar appears, user clicks Create Account button")
    public void clickCreateAccountButton() {
        AccountSidebar signIn = new AccountSidebar();
        signIn.createAccountButton.click();
    }
    @When("user input email - \"$email\"")
    public void inputEmailField(@Named("email") String email) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.emailField.sendKeys(email);
    }
    @When("input firstname - \"$firstname\"")
    public void inputFirstNameField(@Named("firstname")String firstname) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.firstNameField.sendKeys(firstname);
    }
    @When("input lastname - \"$lastname\"")
    public void inputLastNameField(@Named("lastname")String lastname) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.lastNameField.sendKeys(lastname);
    }
    @When("input password - \"$password\"")
    public void inputPassword(@Named("password")String password) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.passwordField.submit();
        accountPage.passwordField.sendKeys(password);
    }
    @When("confirm password - \"$confirmPassword\"")
    public void inputConfirmPassword(@Named("confirmPassword")String confirmPassword) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.confirmPasswordField.submit();
        accountPage.confirmPasswordField.sendKeys(confirmPassword);
    }
    @When("input zipcode - \"$postalCode\"")
    public void inputZipCode(@Named("postalCode") String postalCode) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.postalCodeField.sendKeys(postalCode);
    }
    @When("input birthdate - \"$birthMonth\" , \"$birthDay\"")
    public void inputBirthDate(@Named("birthMonth") String birthMonth, @Named("birthDay") String birthDay) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.monthTab.sendKeys(birthMonth);
        accountPage.dayTab.sendKeys(birthDay);
    }
    @When("user accept conditions")
    public void clickAcceptConditionsButton() {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.acceptConditionsCheckbox.click();
    }
    @When("clicks Create Account button")
    public void clickAccountCreationButton() {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.createAccountButton.click();
    }
    @When("user opens account sidebar")
    public void clickAccount() {
        RealRewardAccountPage accountPage = new RealRewardAccountPage();
        Actions action = new Actions(getDriver());
        action.moveToElement(accountPage.headerAccountButton).click().perform();
    }
    @Then("in the account sidebar user sees firstname - \"$firstname\" and Sign Out button")
    public void assertResult() {
        AccountSidebar accountSidebar = new AccountSidebar();
        accountSidebar.waitForVisibility(accountSidebar.signOutButton, 20L);
        Assert.assertTrue(accountSidebar.signOutButton.isDisplayed());
    }
    @AfterScenario
    public void closeBrowser() {
        DriverManager.closeDriver();
    }
}
