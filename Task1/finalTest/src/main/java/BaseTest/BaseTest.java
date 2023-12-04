package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        // Navigate to a specific URL
        String urlToNavigate = "https://magento.softwaretestingboard.com/";  // Replace with the actual URL
        driver.get(urlToNavigate);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
