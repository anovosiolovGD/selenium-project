package testSteps;

public class OpenPageSteps {
    public void openHomePage(String homepage) {
        driver.DriverManager.getDriver().get(homepage);
    }
}
