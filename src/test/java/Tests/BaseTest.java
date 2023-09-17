package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
public class BaseTest {
    public BaseTest() {
    }
    public static WebDriver driver;
    public void browserSetUp(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
    }

    @BeforeMethod
    public void setUp() {
        browserSetUp("https://www.google.com/?hl=ar");
    }
}

