package Java_Automation.Domaci

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import SignUpPage;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private SignUpPage signUpPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//zakli//OneDrive//Desktop//webdriver//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        signUpPage = new SignUpPage(driver, wait);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public SignUpPage getSignUpPage() {
        return signUpPage;
    }


    @AfterClass
    public void cleanUp() {
        driver.quit();
    }
}
