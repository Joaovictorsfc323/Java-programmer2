package capitulo17;

public class Seguimento  extends Thread {


    @Override
    public void run() {
        try {
            while (true) {

                Thread thread = Thread.currentThread();
                Thread.sleep(2000);
                System.out.println("minha thread de seguimento");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}