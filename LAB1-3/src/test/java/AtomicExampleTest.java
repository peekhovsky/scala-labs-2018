import static org.junit.Assert.*;

public class AtomicExampleTest {

    @org.junit.Test
    public void Test() throws InterruptedException {
        AtomicExample thread1 = new AtomicExample();
        AtomicExample thread2 = new AtomicExample();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        for (int i = 1; i < AtomicExample.output.length; i++) {
            assert (AtomicExample.output[i-1] != AtomicExample.output[i]);
        }
    }


}