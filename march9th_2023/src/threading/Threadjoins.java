package threading;

public class Threadjoins {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 - " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 - " + i);
            }
        });
        
        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 3 - " + i);
            }
        });

        t1.start();
        t2.start(); 
        t3.start();

        t1.join(); // Wait for t1 to finish executing
        t2.join(); // Wait for t2 to finish executing
        t3.join(); // Wait for t3 to finish executing
        
        System.out.println("All threads have finished executing.");
    }
}

