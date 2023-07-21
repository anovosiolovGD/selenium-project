import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.ScenarioContext;

import static utils.RandomEmailGenerator.generateRandomEmail;

public class BaseTest {
    private String email;
    private ScenarioContext context;

    @BeforeTest
    private void prepareTestData() {
        email = generateRandomEmail();
        context = ScenarioContext.getInstance();
        context.put("email", email);
        context.put("firstname", "andy");
        context.put("lastname", "testie");
        context.put("password", "passwordForTest1");
        context.put("zipcode", "99950");
        context.put("birthMonth", "August");
        context.put("birthDay", "7");
    }
    @AfterTest
    public void tearDown() {
        driver.DriverManager.closeDriver();
    }
}
