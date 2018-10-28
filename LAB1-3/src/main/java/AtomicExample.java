

public class AtomicExample extends Thread {

    private volatile static boolean trigger = false;
    private volatile static int i = 1000;
    public static char[] output = new char[i + 1];

    @Override
    public void run() {
        while (i > 0) {
            synchronized (AtomicExample.class) {
                trigger = !trigger;
                if (trigger) {
                    output[i] = '1';
                } else {
                    output[i] = '0';
                }
                i--;
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {
        AtomicExample thread1 = new AtomicExample();
        AtomicExample thread2 = new AtomicExample();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(AtomicExample.output);
    }
}
