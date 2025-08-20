package capitulo8.lab2;

public class Cap8Lab02 {

    public static void main(String[] args) {

        // try catch é uma tratativa de erro aonde esta acontecendo erro tipo se acontecer erro ele retorna uma forma
        // de não quebrar site por exemplo ele pode voltar para tela inicial e não der erro desconhecido
        if (args.length > 0) {
            try {
                int soma = 0;

                System.out.println("A media das idades");


                for (String elemneto : args) {
                    System.out.println(elemneto + "");
                    soma += Integer.parseInt(elemneto);

                }

                double resultado = soma / args.length;
                System.out.println("é de: " + resultado);

            } catch (NumberFormatException ex) {

                System.out.println();
                System.out.println("Voce  informou um valor invalido");

                //ex.printStackTrace(); consegue mostrar aonde esta acontecendo erro
                ex.printStackTrace();

                //NullPointerException ex  Serve se objeto não tiver instanciado
            }catch(NullPointerException ex){
               ex.printStackTrace();

            }catch (RuntimeException ex){
               //Para erros genericos em tempo de execucao

            }catch (Exception ex){
                // erros em execucao ou erro de compilação

            }catch (Throwable ex){
                //tipo um pai de todos Throwable é uma super classe aonde contem todas classes, RuntimeException ex,
                // Exception ex e NullPointerException

            }

        } else {
            System.out.println("insira os valores para calculo das medias");

        }

    }
}
