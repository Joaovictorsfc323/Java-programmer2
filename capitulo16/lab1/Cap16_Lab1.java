package capitulo16.lab1;

import java.io.*;

public class Cap16_Lab1 {


    public static void main(String[] args) {

        escrever("capitulo16\nLaboratorio 1");
        ler();


    }


    public static void escrever(String texto) {

        try {

            FileOutputStream arquivo = new FileOutputStream("Cap16_Lab1.txt");
            DataOutputStream dados = new DataOutputStream(arquivo);

            dados.writeChars(texto);
            dados.close();


        } catch (IOException e) {
            e.printStackTrace();

        }


    }

    public static void ler() {

        try {

            FileInputStream arquivo = new FileInputStream("Cap16_Lab1.txt");
            DataInputStream dados = new DataInputStream(arquivo);

            while (dados.available() > 0) {

                char c = dados.readChar();
                System.out.print(c);
            }

            dados.close();
            arquivo.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
