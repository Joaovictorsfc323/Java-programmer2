package Capitulo4;

public class EstrturaRepeticaoWhile {

    public static void main(String[] args) {

        int contador = 12;

        while (contador < 10) {
            System.out.println("Contador esta no numero:" + contador);
            contador = contador + 1;

        }
        // execura primeiro e depois valido a condição
        int contador2 = 12;

        do {
            System.out.println("Contador esta no numero:" + contador2);
            contador2++;


        } while (contador2 < 10);




    }

}
