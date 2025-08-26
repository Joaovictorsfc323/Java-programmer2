package capitulo11;

public class TesteException {


    public static void main(String[] args) {

        try {
            for (int contador = 0; contador < args.length; contador++) {
                int valor1 = Integer.parseInt(args[contador]);

                int proximaposicao = contador + 1;
                int valor2 = Integer.parseInt(args[proximaposicao]);
                long valor3 = valor1;
                long valor4 = valor2;
                long resultado = Soma.somar(valor3, valor4);


                System.out.println("Soma:" + Soma.somar(valor1, valor2));
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("vc tentou acessar uma posicao que não existe");
        }catch (SomarNumeroNegativosException ex){
            System.out.println("meu erro que criei:");
            ex.printStackTrace();


        } catch(RuntimeException ex) {
            System.out.println("error:");
            ex.printStackTrace();

        }
    }
}
