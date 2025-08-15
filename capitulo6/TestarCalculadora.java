package capitulo6;

public class TestarCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultadoSoma = calculadora.somar(10, 20);

        System.out.println("Soma dos valores:" + calculadora);

        calculadora.imprimiralgo("Ola," + "sou um metodo void");

        calculadora.imprimirOutroAlgo("outra" + "impressao");

    }


}
