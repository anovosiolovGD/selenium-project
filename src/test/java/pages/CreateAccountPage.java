package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{
    @FindBy(css = "[placeholder='Email']")
    public WebElement emailField;

    @FindBy(css = "[name='firstname']")
    public WebElement firstNameField;

    @FindBy(css = "[name='lastname']")
    public WebElement lastNameField;

    @FindBy(css = "[name='phoneNumber']")
    public WebElement phoneNumberField;

    @FindBy(css = "[placeholder='Password']")
    public WebElement passwordField;

    @FindBy(css = "[placeholder='Confirm Password']")
    public WebElement confirmPasswordField;

    @FindBy(css = "[name='postalCode']")
    public WebElement postalCodeField;

    @FindBy(css = "[name='month']")
    public WebElement monthTab;

    @FindBy(css = "[name='day']")
    public WebElement dayTab;

    @FindBy(css = ".aeo-checkbox-label")
    public WebElement acceptConditionsCheckbox;

    @FindBy(css = ".qa-btn-register")
    public WebElement createAccountButton;
    public CreateAccountPage (){
        super();
        waitForVisibility(emailField,30L);
        waitForVisibility(acceptConditionsCheckbox,30L);
    }

}
