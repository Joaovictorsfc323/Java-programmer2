package capitulo17;

public class TesteThreads {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        int contador = 0;
        do {
            System.out.println(thread.getName());
        }while (contador++ < 1000);


        Seguimento seguimento =new Seguimento();
        seguimento.start();

        ExemploThreads exemploThreads = new ExemploThreads();
        exemploThreads.start();



        while (true){
            System.out.println(thread.getName());

        }

    }
}
