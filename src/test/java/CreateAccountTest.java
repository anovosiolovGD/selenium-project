import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testSteps.CreateAccountTestSteps;
import utils.ScenarioContext;

import static driver.DriverManager.getDriver;

@Listeners({AllureTestNg.class})
public class CreateAccountTest extends BaseTest {
    @Test
    @Description("Testing new account creation")
    public void createAccountTest() {
        CreateAccountTestSteps steps = new CreateAccountTestSteps();
        ScenarioContext context = ScenarioContext.getInstance();
        Class<String> stringClass = String.class;

        steps.openHomePage();
        steps.acceptPrivacy();
        steps.clickAccountButton();
        steps.clickCreateAccountButton();
        steps.inputEmailField(context.get("email", stringClass));
        steps.inputFirstNameField(context.get("firstname", stringClass));
        steps.inputLastNameField(context.get("lastname", stringClass));
        steps.inputPassword(context.get("password",stringClass));
        steps.inputConfirmPassword(context.get("password", stringClass));
        steps.inputZipCode(context.get("zipcode", stringClass));
        steps.inputBirthDate(context.get("birthMonth", stringClass), context.get("birthDay", stringClass));
        getDriver().findElement(By.cssSelector(".aeo-icon-close")).click();
        steps.clickAcceptConditionsButton();
        steps.clickAccountCreationButton();
        steps.clickAccount();
        steps.assertResult();
    }
}
