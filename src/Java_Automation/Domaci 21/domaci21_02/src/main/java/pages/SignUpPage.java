package Java_Automation.Domaci

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class SignUpPage extends BasePage {

    @FindBy(name = "name")
    private WebElement nameField;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signUpButton;

    private List<WebElement> inputFields;

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
        inputFields = Arrays.asList(nameField, emailField, passwordField, confirmPasswordField);
    }


    public String getNameFieldType() {
        return nameField.getAttribute("type");
    }

    public String getEmailFieldType() {
        return emailField.getAttribute("type");
    }

    public String getPasswordFieldType() {
        return passwordField.getAttribute("type");
    }

    public String getConfirmPasswordFieldType() {
        return confirmPasswordField.getAttribute("type");
    }

    public void enterName(String name) {
        nameField.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public String getErrorMessage() {
        return getDriver().findElement(By.className("v-messages__message")).getText();
    }

    public void emptyFieldsErrorMessage() {
        for (WebElement field : inputFields) {
            String errorMessage = getDriver().findElement(By.className("v-messages__message")).getText();
            Assert.assertEquals(errorMessage, "This field is required");
        }
    }

    public void open() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
    }
}
