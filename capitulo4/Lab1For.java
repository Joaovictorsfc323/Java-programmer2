package capitulo4;

public class Lab1For {

    public static void main(String[] args) {

        int numero = 10;
        int contador = 0;

        for (int divisor = 1; divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                contador++;
            }

            if (contador > 2) {
                break;
            }
        }

        if (contador > 2 || numero <= 1) {
            System.out.println("O número " + numero + " não é primo");
        } else {
            System.out.println("O número " + numero + " é primo");
        }
    }
}
