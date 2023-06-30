package Java_Automation.Domaci

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void verifyUrlContainsSignupRoute() {
        getSignUpPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }

    @Test
    public void verifyNameFieldType() {
        getSignUpPage().open();
        String fieldType = getSignUpPage().getNameField().getAttribute("type");
        Assert.assertEquals(fieldType, "text");
    }

    @Test
    public void verifyEmailFieldType() {
        getSignUpPage().open();
        String fieldType = getSignUpPage().getEmailField().getAttribute("type");
        Assert.assertEquals(fieldType, "email");
    }

    @Test
    public void verifyPasswordFieldType() {
        getSignUpPage().open();
        String fieldType = getSignUpPage().getPasswordField().getAttribute("type");
        Assert.assertEquals(fieldType, "password");
    }

    @Test
    public void verifyConfirmPasswordFieldType() {
        getSignUpPage().open();
        String fieldType = getSignUpPage().getConfirmPasswordField().getAttribute("type");
        Assert.assertEquals(fieldType, "password");
    }

    @Test
    public void verifyInvalidEmailErrorMessage() {
        getSignUpPage().open()
                .enterDataToNameField("test")
                .enterDataToEmailField("invalid_email")
                .enterDataToPasswordField("123456")
                .enterDataToConfirmPasswordField("123456")
                .clickSignUpButton();
        String errorMessage = getSignUpPage().getErrorMessage();
        Assert.assertEquals(errorMessage, "Valid email is required");
    }

    @Test
    public void verifyShortPasswordErrorMessage() {
        getSignUpPage().open()
                .enterDataToNameField("test")
                .enterDataToEmailField("test@gmail.com")
                .enterDataToPasswordField("123")
                .enterDataToConfirmPasswordField("123")
                .clickSignUpButton();
        String errorMessage = getSignUpPage().getErrorMessage();
        Assert.assertEquals(errorMessage, "This field must have no less than 5 characters");
    }

    @Test
    public void verifyEmptyFieldsErrorMessage() {
        getSignUpPage().open()
                .clickSignUpButton()
                .emptyFieldsErrorMessage();
    }
}
