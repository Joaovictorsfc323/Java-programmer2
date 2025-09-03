package capitulo17;

public class ExemploRunnable {

    public static void main(String[] args) {

        Runnable runnable = new TesteRunnable();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();

        Runnable runnable1 =() ->{
            Thread thread4 = Thread.currentThread();
            System.out.println("Interface Runnable, nome:" + thread4.getName());

        };

        Thread thread5 = new Thread(runnable1);
        thread5.setPriority(thread5.MAX_PRIORITY);
        thread5.start();
    }
}
