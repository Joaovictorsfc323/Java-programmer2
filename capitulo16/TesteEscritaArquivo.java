package capitulo16;

import java.io.*;

public class TesteEscritaArquivo {

    public static void main(String[] args) {

        try {

            String texto ="meu primiero texto no arquivo";
            FileOutputStream outputStrem = new FileOutputStream("Teste.csv");
            DataOutputStream stream = new DataOutputStream(outputStrem);
            stream.writeBytes(texto);
            stream.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();

        }

    }


}
