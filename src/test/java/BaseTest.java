import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import utils.ScenarioContext;

import static utils.RandomEmailGenerator.generateRandomEmail;

public class BaseTest {
    protected ScenarioContext context;

    @BeforeSuite
    public void prepareTestData() {
        String email = generateRandomEmail();
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
