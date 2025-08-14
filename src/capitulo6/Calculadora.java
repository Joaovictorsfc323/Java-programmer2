package capitulo6;

public class Calculadora {


    public int somar(int valor1, int valor2) {

        int resultado = valor1 + valor2;

        return resultado;

    }

    public long somar(long valo1, long valor2) {

        long resultado = valo1 + valor2;
        return resultado;
    }

    public double somar(double valor1, double valor2) {
        return valor1 + valor2;

    }


    public void imprimiralgo(String msg) {
        println(msg);

    }

    public void imprimirOutroAlgo(String msg) {
        println("Outro: metodo" + msg);

    }

    private void println(String msg) {
        System.out.println(msg);

    }

    public int subtrair(int valor1, int valor2) {

        return valor1 - valor2;

    }

    public double subtrair(double valor1, double valor2) {

        return valor1 - valor2;

    }

    public double subtrair(double valor1, int valor2) {

        return valor1 - valor2;

    }


    public double subtrair(int valor1, double valor2) {

        return valor1 - valor2;

    }


    public int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;

    }

    public int dividir(int valor1, int valor2) {
        return valor1 / valor2;

    }


}
