import driver.DriverManager;
import org.openqa.selenium.Dimension;
import org.testng.annotations.*;
import utils.ScenarioContext;
import utils.TestDataUtil;

import java.util.HashMap;

import static utils.RandomEmailGenerator.generateRandomEmail;

public class BaseTest {
    protected ScenarioContext context;

    @BeforeSuite
    public void prepareTestData() {
        String email = generateRandomEmail();
        TestDataUtil.setData("user.email", email);

        HashMap<String, String> td = TestDataUtil.loadedData();

        context = ScenarioContext.getInstance();
        context.put("homepageUrl",td.get("homepageUrl"));
        context.put("email", td.get("user.email"));
        context.put("firstname", td.get("user.firstname"));
        context.put("lastname", td.get("user.lastname"));
        context.put("password", td.get("user.password"));
        context.put("zipcode", td.get("user.zipcode"));
        context.put("birthMonth", td.get("user.birthMonth"));
        context.put("birthDay", td.get("user.birthDay"));
    }

    @BeforeTest
    public void init() {
        DriverManager.getDriver();
    }

    @AfterSuite
    public void tearDown() {
        driver.DriverManager.closeDriver();
    }
}
