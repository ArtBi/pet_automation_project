import driverUtils.DriverManager;
import driverUtils.DriverManagerFactory;
import driverUtils.DriverType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private DriverManager driverManager;
    private RemoteWebDriver driver;

    @BeforeMethod
    public void beforeSuite() {
        driver = setUp("https://codingbat.com/java");
    }

    @AfterMethod
    public void after() {
        driverManager.quitDriver();
        //driverManager.stopService();
    }

    public RemoteWebDriver setUp(String url) {
        driverManager = DriverManagerFactory.getManager(DriverType.SELENOID_CHROME);
        driver = driverManager.getDriver();
        openURI(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    private void openURI(String uri) {
        driver.get(uri);
    }
}
