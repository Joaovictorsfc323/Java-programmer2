package capitulo9.abstrato;

public class Calculadora extends contratoCalculadora {


    @Override
    public int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    @Override
    public int somar(long valor1, long valor2) {
        long resultado = valor1 + valor2;
        return (int) resultado;
    }
}
