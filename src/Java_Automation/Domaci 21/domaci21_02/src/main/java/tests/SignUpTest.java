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
        String fieldType = getSignUpPage().getNameFieldType();
        Assert.assertEquals(fieldType, "text");
    }

    @Test
    public void verifyEmailFieldType() {
        getSignUpPage().open();
        String fieldType = getSignUpPage().getEmailFieldType();
        Assert.assertEquals(fieldType, "email");
    }

    @Test
    public void verifyPasswordFieldType() {
        getSignUpPage().open();
        String fieldType = getSignUpPage().getPasswordFieldType();
        Assert.assertEquals(fieldType, "password");
    }

    @Test
    public void verifyConfirmPasswordFieldType() {
        getSignUpPage().open();
        String fieldType = getSignUpPage().getConfirmPasswordFieldType();
        Assert.assertEquals(fieldType, "password");
    }

    @Test
    public void verifyInvalidEmailErrorMessage() {
        getSignUpPage().open();
        getSignUpPage().enterName("test");
        getSignUpPage().enterEmail("invalid_email");
        getSignUpPage().enterPassword("123456");
        getSignUpPage().enterConfirmPassword("123456");
        getSignUpPage().clickSignUpButton();
        String errorMessage = getSignUpPage().getErrorMessage();
        Assert.assertEquals(errorMessage, "Valid email is required");
    }

    @Test
    public void verifyShortPasswordErrorMessage() {
        getSignUpPage().open();
        getSignUpPage().enterName("test");
        getSignUpPage().enterEmail("test@gmail.com");
        getSignUpPage().enterPassword("123");
        getSignUpPage().enterConfirmPassword("123");
        getSignUpPage().clickSignUpButton();
        String errorMessage = getSignUpPage().getErrorMessage();
        Assert.assertEquals(errorMessage, "This field must have no less than 5 characters");
    }

    @Test
    public void verifyEmptyFieldsErrorMessage() {
        getSignUpPage().open();
        getSignUpPage().clickSignUpButton();
        getSignUpPage().emptyFieldsErrorMessage();
    }
}

