package capitulo17;

public class TesteRunnable implements Runnable {

    @Override
    public void run(){

        Thread thread = Thread.currentThread();
        System.out.println("Interface Runnable, nome: " + thread.getName());

    }
}
