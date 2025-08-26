package capitulo11.lab1;

import java.util.Scanner;

public class Exercicioldade {
    public static void main(String[] args) {


        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("digite ano de nascimento");
            String AnoNascimento1 = scanner.nextLine();


            int anoNAscimento = Integer.parseInt(AnoNascimento1);

            int anoAtual = 2025;
            int idade = anoAtual - anoNAscimento;

            System.out.println("Sua idade é:" + idade);

        } catch (NumberFormatException ex) {
            ex.printStackTrace();

            System.out.println("invalido");

        }


    }

}



