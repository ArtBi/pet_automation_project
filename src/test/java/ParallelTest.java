import driverUtils.AbstractDriverManager;
import driverUtils.DriverManagerFactory;
import driverUtils.DriverType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ParallelTest extends BaseTest {
    private final long time = 500;
    private final int count = 10;

    AbstractDriverManager driverManager;
    RemoteWebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.SELENOID_CHROME);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void test1() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test4() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test5() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test6() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test7() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test8() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test9() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test10() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test11() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test12() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test13() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test14() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test15() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test16() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test17() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test18() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test19() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test20() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test21() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test22() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test23() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test24() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test25() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < count; i++) {
            Thread.sleep(time);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }
}
