import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.TestProperties;

public class BaseTest {
    protected final TestProperties properties = TestProperties.getInstance();
    @AfterTest
    public void tearDown() {
        driver.DriverManager.closeDriver();
    }
}
