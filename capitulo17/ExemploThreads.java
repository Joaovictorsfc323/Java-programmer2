package capitulo17;

public class ExemploThreads extends Thread {

    @Override
    public void run() {

        while (true){
        System.out.println("minha thread de exemplo ExemploThreads");
    }
    }


    public void run(String message){
        System.out.println("A mensagem de execução é:" + message);

    }
}
