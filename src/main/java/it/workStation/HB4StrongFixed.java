package it.workStation;

public class HB4StrongFixed{
    static int sharedVariable = 0;
    static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException{
        Thread writer1 = new Thread(() -> {
            synchronized(lock){
                sharedVariable = 10;
                System.out.println("writer1: " + sharedVariable);
            }
        });

        Thread writer2 = new Thread(() -> {
            synchronized(lock){
                sharedVariable = 20;
                System.out.println("writer2: " + sharedVariable);
            }
        });

        Thread reader = new Thread(() -> {
            synchronized (lock) {
                System.out.println("reader: " + sharedVariable);
            }
        });

        writer1.start();
        writer2.start();
        reader.start();

        writer1.join();
        writer2.join();
        reader.join();

        System.out.println("final value is: " + sharedVariable);
    }
}
