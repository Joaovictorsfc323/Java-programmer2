package capitulo17;

public class TesteConcorrencia {

    public static void main(String[] args) {
        ExeploConcorrencia concorrencia = new ExeploConcorrencia("Teste concorrencia 1");

        ExeploConcorrencia concorrencia2 = new ExeploConcorrencia("Teste concorrencia 2");


        concorrencia.start();
        concorrencia2.start();
    }
}
