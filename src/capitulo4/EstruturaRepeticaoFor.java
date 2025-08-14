package capitulo4;

public class EstruturaRepeticaoFor {
    public static void main(String[] args) {

        int ano = 1930;
        // criar uma variavel ; validacao
        for (int contador = 2025; ano < contador; ano = ano + 4) {
            if (ano != 1942 && ano != 1946) {
                System.out.println("copa do mundo" + ano);

            }

        }


        for (int contador = 2025; ano < contador; ano += 4) {
            if (ano == 1942 || ano == 1946) {

                continue;
            }
            System.out.println("copa do mundo" + ano);
        }
    }


}



