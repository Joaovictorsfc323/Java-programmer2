package capitulo11;

public class ClasseWrapper {

    public static void main(String[] args) {
        int valorInteiro = 10;
        String valorString = "10";

        String texto = "Variavel texto";
        System.out.println(texto);
        System.out.println(texto.toUpperCase()); //toUpperCase ele transforma valor que esta dentro da variavel texto tudo em maisuculo
        System.out.println(texto);

        //Aqui na classWrapper é uma forma para transformar oque é int para String ou vice versa
        int converterValorinteiro = Integer.valueOf(valorString);
        System.out.println(valorString);
        System.out.println(converterValorinteiro);
        String converterValorString = String.valueOf(valorInteiro);
        System.out.println(converterValorString);


        boolean verdadeiro = Boolean.TRUE == true;
        boolean verdeiroConvert = Boolean.parseBoolean("true");

        if (Boolean.TRUE == verdadeiro){


        }

        int maxint = Integer.MAX_VALUE;
//        long maxLong = long.MAX_VALUE;


        Integer intNull = null;
        String stringNulla = null;

    }
}
