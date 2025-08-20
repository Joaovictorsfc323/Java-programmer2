package capitulo10;

// toda interface já abstrata, não precisa do abstrat
public abstract interface Soma {

    // Soma vai ser statico e publico, não precisa add os modificadores
    public  static int valor = 10;

    //Sempre vaio ser publico não preciso add os modificadores
    // esse metodo preciso inplementar
    public int somar(int valor1, int valor2);

    public static double somar(double valor1, double valor2){
            return valor1 + valor2;

    }

    //implementa oque esta feito
    default long somar(long valor1, long valor2){
        return valor1 + valor2;

    }
}
