package driverUtils;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DriverManagerFactory {

    public static AbstractDriverManager getManager(DriverType type) {

        switch (type) {
            case SELENOID_CHROME:
                return new SelenoidDriverManager();
            case LOCAL_CHROME:
                return new ChromeDriverManager();
            default:
                throw new NotImplementedException();
        }


    }
}
