package capitulo17.lab1;

public class ThreadLab extends Thread {

    public static String lock = "";

    public ThreadLab(String name) {
        super(name);
    }


    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {

                System.out.println("Executando: " + getName());

                try {

                    Thread.sleep(500);
                } catch (InterruptedException e) {

                    System.err.println("Erro na thread " + getName() + ": " + e.getMessage());
                }
            }
        }
    }
}