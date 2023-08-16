package testSteps;

import driver.DriverManager;
import io.qameta.allure.Step;
import org.jbehave.core.annotations.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.RealRewardAccountPage;
import sidebars.AccountSidebar;
import utils.ScenarioContext;

import static driver.DriverManager.getDriver;

public class CreateAccountTestSteps {
    protected AccountSidebar accountSidebar = new AccountSidebar();
    protected HomePage homepage = new HomePage();
    protected CreateAccountPage accountPage = new CreateAccountPage();

    @Given("the user is on the homepage")
    @Step("Open the homepage")
    public void openHomePage() {
        OpenPageSteps openPage = new OpenPageSteps();
        openPage.openPage(ScenarioContext.getInstance().get("homepageUrl", String.class));
    }

    @When("accept button appears, user clicks it")
    @Step("Accept privacy policy")
    public void acceptPrivacy() {
        HomePage homePage = new HomePage();
        homePage.acceptPrivacyButton.click();
    }

    @When("user clicks on header account button")
    @Step("Click on the header account button")
    public void clickAccountButton() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(homepage.headerAccountButton).click().perform();
    }

    @When("account sidebar appears, user clicks Create Account button")
    @Step("Click 'Create Account' button")
    public void clickCreateAccountButton() {
        accountSidebar.createAccountButton.click();
    }

    @When("user input email - \"$email\"")
    @Step("Input all user data")
    public void inputEmailField(@Named("email") String email) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.emailField.sendKeys(email);
    }

    @When("input firstname - \"$firstname\"")
    public void inputFirstNameField(@Named("firstname") String firstname) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.firstNameField.sendKeys(firstname);
    }

    @When("input lastname - \"$lastname\"")
    public void inputLastNameField(@Named("lastname") String lastname) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.lastNameField.sendKeys(lastname);
    }

    @When("input password - \"$password\"")
    public void inputPassword(@Named("password") String password) {
        CreateAccountPage accountPage = new CreateAccountPage();
        accountPage.passwordField.submit();
        accountPage.passwordField.sendKeys(password);
    }

    @When("confirm password - $confirmPassword")
    public void inputConfirmPassword(@Named("confirmPassword") String confirmPassword) {
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
    public void clickAcceptConditionsButton(){

        accountPage.acceptConditionsCheckbox.click();
    }

    @When("clicks Create Account button")
    @Step("Click 'Create Account' button")
    public void clickAccountCreationButton() {
//        Actions action = new Actions(getDriver());
//        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
//        executor.executeScript("arguments[0].click();", accountPage.createAccountButton);
        accountPage.createAccountButton.click();
    }

    @When("user opens account sidebar")
    @Step("Click account button to open sidebar")
    public void clickAccount() {
        getDriver().findElement(By.cssSelector(".aeo-icon-account")).click();
//        homepage.headerAccountButton.click();
    }

    @Then("in the account sidebar user sees firstname - \"$firstname\" and Sign Out button")
    @Step("Verify account creation. SignOut button and users firstname appears in the sidebar.")
    public void assertResult() {
        accountSidebar.waitForVisibility(accountSidebar.signOutButton, 20L);
        Assert.assertTrue(accountSidebar.signOutButton.isDisplayed());
        accountSidebar.signOutButton.click();
    }

    @AfterScenario
    public void closeBrowser() {
        DriverManager.closeDriver();
    }
}
