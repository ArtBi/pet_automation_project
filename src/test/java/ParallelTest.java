import org.testng.annotations.Test;

public class ParallelTest extends BaseTest {
    @Test
    public void test1() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test4() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test5() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test6() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test7() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test8() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test9() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }

    @Test
    public void test10() throws InterruptedException {
        System.out.println("Start: " + Thread.currentThread().getId());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Finish: " + Thread.currentThread().getId());
    }
}
