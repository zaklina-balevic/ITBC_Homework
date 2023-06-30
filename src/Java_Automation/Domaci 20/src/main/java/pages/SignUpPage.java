package Java_Automation.Domaci

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {

    private By nameField = By.name("name");
    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By confirmPasswordField = By.name("confirmPassword");
    private By signUpButton = By.xpath("//button[@type='submit']");

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public By getNameField() {
        return nameField;
    }

    public By getEmailField() {
        return emailField;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public By getSignUpButton() {
        return signUpButton;
    }

    public void enterDataToNameField(String text) {
        getDriver().findElement(nameField).sendKeys(text);
    }
    public void enterDataToEmailField(String text) {
        getDriver().findElement(emailField).sendKeys(text);
    }

    public void enterDataToPasswordField(String text) {
        getDriver().findElement(passwordField).sendKeys(text);
    }

    public void enterDataToConfirmPasswordField(String text) {
        getDriver().findElement(confirmPasswordField).sendKeys(text);
    }

    public void clickSignUpButton() {
        getDriver().findElement(signUpButton).click();
    }

    public void open() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
    }
}
