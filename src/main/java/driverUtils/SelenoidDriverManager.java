package driverUtils;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class SelenoidDriverManager extends DriverManager {

    private static URL getSelenoidURL() {
        try {
            return URI.create("http://192.168.1.154:4444/wd/hub").toURL();
        } catch (MalformedURLException e) {
            throw new RuntimeException("Cannot create Selenoid URL", e);
        }
    }

    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("85.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        return capabilities;
    }

    @Override
    public void startService() {

    }

    @Override
    public void stopService() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                quitDriver();
            }
        });

    }

    @Override
    public void createDriver() {
        driver = new RemoteWebDriver(getSelenoidURL(), getCapabilities());
    }
}
