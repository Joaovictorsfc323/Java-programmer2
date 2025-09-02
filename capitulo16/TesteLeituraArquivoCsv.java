package capitulo16;

import capitulo19.br.com.impacta.java.model.Funcionario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TesteLeituraArquivoCsv {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("Funcionarios.csv");
            DataInputStream stream = new DataInputStream(inputStream);
            String texto = stream.readLine();
            System.out.println(texto);


            texto = stream.readLine();
            List<Funcionario> funcionarios = new ArrayList<>();
            while (texto != null) {
                System.out.println(texto);
               String [] textoSplit  = texto.split(",");
               int id = Integer.parseInt(textoSplit[0]);
               String nome = textoSplit[1];
               double salario = Double.parseDouble(textoSplit[2]);
               int cargoId = Integer.parseInt(textoSplit[3]);

               Funcionario funcionario = new Funcionario(id,nome,salario,cargoId);
                System.out.println(funcionario);

                texto = stream.readLine();
            }


            stream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
