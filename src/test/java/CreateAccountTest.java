import org.testng.annotations.Test;
import testSteps.CreateAccountTestSteps;
import utils.ScenarioContext;

public class CreateAccountTest extends BaseTest {
    @Test
    public void createAccountTest() {
        CreateAccountTestSteps steps = new CreateAccountTestSteps();
        ScenarioContext context = ScenarioContext.getInstance();
        steps.openHomePage();
        steps.acceptPrivacy();
        steps.clickAccountButton();
        steps.clickCreateAccountButton();
        steps.inputEmailField(context.get("email", String.class));
        steps.inputFirstNameField(context.get("firstname", String.class));
        steps.inputLastNameField(context.get("lastname", String.class));
        steps.inputPassword(context.get("password",String.class));
        steps.inputConfirmPassword(context.get("password", String.class));
        steps.inputZipCode(context.get("zipcode", String.class));
        steps.inputBirthDate(context.get("birthMonth", String.class), context.get("birthDay", String.class));
        steps.clickAcceptConditionsButton();
        steps.clickAccountCreationButton();
        steps.clickAccount();
        steps.assertResult();
    }
}
