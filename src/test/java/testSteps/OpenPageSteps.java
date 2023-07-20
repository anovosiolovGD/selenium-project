package testSteps;

public class OpenPageSteps {
    public void openPage(String page) {
        driver.DriverManager.getDriver().get(page);
    }
}
