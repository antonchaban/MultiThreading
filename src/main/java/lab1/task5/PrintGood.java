package lab1.task5;

public class PrintGood extends Thread {
    private final String symbol;
    private static final Object lock = new Object();

    public PrintGood(String symbol) {
        this.symbol = symbol;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                synchronized (lock) {
                    lock.notify();
                    System.out.print(this.symbol);
/*                    if (j%100 == 0) {
                        System.out.println();
                    }*/
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.exit(0);
    }
}
