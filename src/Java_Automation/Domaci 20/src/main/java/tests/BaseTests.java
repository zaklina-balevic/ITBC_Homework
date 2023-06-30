package Java_Automation.Domaci

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import SignUpPage;

import java.time.Duration;

public class BaseTests {

    private WebDriver driver;
    private WebDriverWait wait;
    private SignUpPage signupPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//zakli//OneDrive//Desktop//webdriver//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        signupPage = new SignUpPage(driver, wait);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public SignUpPage getSignupPage() {
        return this.signupPage;
    }

    @AfterClass
    public void cleanUp() {
        driver.close();
    }
}
