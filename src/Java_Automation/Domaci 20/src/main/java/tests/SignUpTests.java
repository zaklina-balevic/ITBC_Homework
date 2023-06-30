package Java_Automation.Domaci

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends BaseTests {

    @Test
    public void verifyUrlContainsSignupRoute() {
        getSignupPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }

    @Test
    public void verifyNameFieldType() {
        getSignupPage().open();
        String fieldType = getDriver().findElement(getSignupPage().getNameField()).getAttribute("type");
        Assert.assertEquals(fieldType, "text");
    }

    @Test
    public void verifyEmailFieldType() {
        getSignupPage().open();
        String fieldType = getDriver().findElement(getSignupPage().getEmailField()).getAttribute("type");
        Assert.assertEquals(fieldType, "email");
    }

    @Test
    public void verifyPasswordFieldType() {
        getSignupPage().open();
        String fieldType = getDriver().findElement(getSignupPage().getPasswordField()).getAttribute("type");
        Assert.assertEquals(fieldType, "password");
    }

    @Test
    public void verifyConfirmPasswordFieldType() {
        getSignupPage().open();
        String fieldType = getDriver().findElement(getSignupPage().getConfirmPasswordField()).getAttribute("type");
        Assert.assertEquals(fieldType, "password");
    }

    @Test
    public void verifyInvalidEmailErrorMessage() {
        getSignupPage().open();
        getSignupPage().enterDataToNameField("test");
        getSignupPage().enterDataToEmailField("invalid_email");
        getSignupPage().enterDataToPasswordField("password123");
        getSignupPage().enterDataToConfirmPasswordField("password123");
        getSignupPage().clickSignUpButton();
        String errorMessage = getDriver().findElement(By.className("v-messages__message")).getText();
        Assert.assertEquals(errorMessage, "Valid email is required");
    }

    @Test
    public void verifyShortPasswordErrorMessage() {
        getSignupPage().open();
        getSignupPage().enterDataToNameField("test");
        getSignupPage().enterDataToEmailField("test@example.com");
        getSignupPage().enterDataToPasswordField("123");
        getSignupPage().enterDataToConfirmPasswordField("123");
        getSignupPage().clickSignUpButton();
        String errorMessage = getDriver().findElement(By.className("v-messages__message")).getText();
        Assert.assertEquals(errorMessage, "This field must have no less than 5 characters");
    }

    @Test
    public void verifyEmptyFieldsErrorMessage() {
        getSignupPage().open();
        getSignupPage().clickSignUpButton();
        String nameErrorMessage = getDriver().findElement(By.className("v-messages__message")).getText();
        String emailErrorMessage = getDriver().findElement(By.className("v-messages__message")).getText();
        String passwordErrorMessage = getDriver().findElement(By.className("v-messages__message")).getText();
        String confirmPasswordErrorMessage = getDriver().findElement(By.className("v-messages__message")).getText();

        Assert.assertEquals(nameErrorMessage, "This field is required");
        Assert.assertEquals(emailErrorMessage, "This field is required");
        Assert.assertEquals(passwordErrorMessage, "This field is required");
        Assert.assertEquals(confirmPasswordErrorMessage, "This field is required");
    }
}
