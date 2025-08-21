package capitulo11;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {

        try {
            System.out.println("Meu programa inciou");
            Scanner scanner = new Scanner(System.in);

            System.out.println("digite um numero positivo");
            long valor1 = scanner.nextLong();
            System.out.println("digite outro numero positivo");
            long valor2 = scanner.nextLong();

            long somar = Soma.somar(valor1, valor2);

            System.out.println("O valor da soma" + somar);


        }catch (SomarNumeroNegativosException ex){
            ex.printStackTrace();

        }finally {
            System.out.println("fim do programa");
        }

    }
}
