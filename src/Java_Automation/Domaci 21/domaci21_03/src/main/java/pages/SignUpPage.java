package Java_Automation.Domaci

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class SignUpPage extends BasePage {

    private WebElement nameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement confirmPasswordField;
    private WebElement signUpButton;
    private List<WebElement> inputFields;

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        inputFields = Arrays.asList(nameField, emailField, passwordField, confirmPasswordField);
    }

    public WebElement getNameField() {
        return getDriver().findElement(By.name("name"));
    }

    public WebElement getEmailField() {
        return getDriver().findElement(By.name("email"));
    }

    public WebElement getPasswordField() {
        return getDriver().findElement(By.name("password"));
    }

    public WebElement getConfirmPasswordField() {
        return getDriver().findElement(By.name("confirmPassword"));
    }

    public WebElement getSignUpButton() {
        return getDriver().findElement(By.xpath("//button[@type='submit']"));
    }

    public SignUpPage enterDataToNameField(String text) {
        getNameField().sendKeys(text);
        return this;
    }

    public SignUpPage enterDataToEmailField(String text) {
        getEmailField().sendKeys(text);
        return this;
    }

    public SignUpPage enterDataToPasswordField(String text) {
        getPasswordField().sendKeys(text);
        return this;
    }

    public SignUpPage enterDataToConfirmPasswordField(String text) {
        getConfirmPasswordField().sendKeys(text);
        return this;
    }

    public SignUpPage clickSignUpButton() {
        getSignUpButton().click();
        return this;
    }

    public String getErrorMessage() {
        return getDriver().findElement(By.className("v-messages__message")).getText();
    }

    public SignUpPage emptyFieldsErrorMessage() {
        for (WebElement field : inputFields) {
            String errorMessage = getDriver().findElement(By.className("v-messages__message")).getText();
            Assert.assertEquals(errorMessage, "This field is required");
        }
        return this;
    }

    public SignUpPage open() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
        return this;
    }
}
