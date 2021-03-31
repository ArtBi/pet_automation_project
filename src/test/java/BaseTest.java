import driverUtils.AbstractDriverManager;
import driverUtils.DriverManagerFactory;
import driverUtils.DriverType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static long startTime;
    private RemoteWebDriver driver;
    private AbstractDriverManager driverManager;

    @BeforeSuite
    public void start() {
        startTime = System.nanoTime();
    }

    @BeforeMethod
    public void beforeSuite() {
        driver = setUp("https://codingbat.com/java");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
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

    @AfterClass
    private void end() {
        System.out.println("Finish time: " +
                (System.nanoTime() - startTime) / 1000
        );
    }

    private void openURI(String uri) {
        driver.get(uri);
    }


}
