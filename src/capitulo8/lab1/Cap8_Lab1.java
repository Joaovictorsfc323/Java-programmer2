package capitulo8.lab1;

public class Cap8_Lab1 {

    public static int maiorNumero(int[] array) {

        int maiorNumero = 0;

        for (int numero : array) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }

        }

//        int maior = array[0];
//        for (int teste = 1; teste < array.length; teste++) {
//            if (array[teste] > maior) {
//
//                maior = array[teste];
//            }
//
//        }
//        return maior;
        return maiorNumero;
    }

    public static void main(String[] args) {

        int[] numeros = {100, 150, 158, 10, 1, 200};

        int maior = maiorNumero(numeros);

        System.out.println("maior Numero:" + maior);

    }
}
