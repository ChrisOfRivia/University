package Test;

public class Main2 {
    private static int a;
    private static final Object mutex;

    static{
        a = 0;
        mutex = new Object();
    }

    public static void main(String[] args) {
        Runnable r = () -> {

            // So both threads work together?
            // One thread finishes first while locking the cycle,
            // the latter thread waits for the first to finish and then continues the cycle
            synchronized (mutex) {
                for(int i = 0; i < 10000; i++){
                    a++;
                }
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(a);
    }
}
