package driverUtils;

import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class AbstractDriverManager {

    protected static ThreadLocal<RemoteWebDriver> drivers = new ThreadLocal<>();

    protected abstract RemoteWebDriver createDriver();

    protected abstract void startService();

    public void quitDriver() {
        if (null != drivers.get()) {
            try {
                System.out.println("Finish session: " + drivers.get().getSessionId());
                drivers.get().quit(); // First quit WebDriver session gracefully
                drivers.remove(); // Remove WebDriver reference from the ThreadLocal variable.
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException("Unable to gracefully quit WebDriver.", e); // We'll replace this with actual Loggers later - don't worry !
            }
        }
    }

    public RemoteWebDriver getDriver() {
        if (null == drivers.get()) {
            startService();
            drivers.set(this.createDriver());
        }
        System.out.println("Get session: " + drivers.get().getSessionId());
        return drivers.get();
    }
}
