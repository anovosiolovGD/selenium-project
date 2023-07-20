import org.testng.annotations.Test;
import testSteps.CreateAccountTestSteps;

public class CreateAccountTest extends BaseTest {
    @Test
    public void createAccountTest() throws InterruptedException {
        CreateAccountTestSteps steps = new CreateAccountTestSteps();
        steps.openHomePage();
        steps.acceptPrivacyIfDisplayed();
        steps.clickAccountButton();
        steps.clickCreateAccountButton();
        steps.inputEmailField("andynvs@ma.fr");
        steps.inputFirstNameField("andrei");
        steps.inputLastNameField("novosiolov");
        steps.inputPassword("passwordForTest1");
        steps.inputConfirmPassword("passwordForTest1");
        steps.inputZipCode("99950");
        steps.inputBirthDate("August", "7");
        steps.clickAcceptConditionsButton();
        steps.clickAccountCreationButton();
        Thread.sleep(15000L);
        steps.clickAccount();
        steps.assertResult();
    }
}
