package Java_Automation.Domaci

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//zakli//OneDrive//Desktop//webdriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().fullscreen();

        Faker faker = new Faker();

        WebElement fullName = driver.findElement(By.id("userName"));
        String fakeName = faker.name().fullName();
        fullName.sendKeys(fakeName);

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        String fakeEmail = faker.internet().emailAddress();
        userEmail.sendKeys(fakeEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        String fakeCurrentAddress = faker.address().fullAddress();
        currentAddress.sendKeys(fakeCurrentAddress);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        String fakePermanentAddress = faker.address().fullAddress();
        permanentAddress.sendKeys(fakePermanentAddress);

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));


        WebElement submittedName = driver.findElement(By.id("name"));
        WebElement submittedEmail = driver.findElement(By.id("email"));

        String enteredName = fullName.getAttribute("value");
        String enteredEmail = userEmail.getAttribute("value");

        if (enteredName.equals(fakeName) && enteredEmail.equals(fakeEmail)) {
        System.out.println("The entered data matches the generated Faker data.");
        } else {
            System.out.println("The entered data does not match the generated Faker data.");
        }

        driver.close();
    }
}
