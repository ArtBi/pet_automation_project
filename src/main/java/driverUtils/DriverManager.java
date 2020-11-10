package driverUtils;

import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class DriverManager {
    protected RemoteWebDriver driver;

    protected abstract void startService();

    public abstract void stopService();

    protected abstract void createDriver();

    public void quitDriver() {
        if (null != driver) {
            driver.quit();
            driver = null;
        }

    }

    public RemoteWebDriver getDriver() {
        if (null == driver) {
            startService();
            createDriver();
        }
        return driver;
    }
}
