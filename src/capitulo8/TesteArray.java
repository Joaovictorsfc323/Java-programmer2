package capitulo8;

import capitulo7.Produto;

public class TesteArray {

    public static void main(String[] args) {
        //posicoes     0 ,1,2,3,4,5,6,7,8,9,10
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] lista = new int[9];
        String[] listaString = new String[10];

        int posicaoZero = array[0];
        int posicaoUm = array[1];
        int posicaoDois = array[2];
        int posicaoTres = array[3];
        int posicaoQuatro = array[4];
        int posicaoCinco = array[5];
        int posicaoSeis = array[6];
        int posicaoSete = array[7];
        int posicaoOito = array[8];
        int posicaoNove = array[9];
        int posicaoDez = array[10];

//        System.out.println(array[0]);

        int contador = 0;

        System.out.println("----while-----");
        //array.length ele mostra qual limite de posicao que tem
        while (contador < array.length) {
            System.out.println("Posição" + contador + ",Elemento" + array[contador]);
            contador++;
        }
        System.out.println("----For-----");
        //array.length ele mostra qual limite de posicao que tem
        // Acesso as posições para pegar os elementos
        for (int posicao = 0; posicao < array.length; posicao++) {
            System.out.println("Posição:" + posicao + "Elemento" + array[posicao]);


        }
        System.out.println("----Foreach-----");
        //já acessa os elemnetos/ os valomes do array
        // array nutella bem mais facil
        for (int elemento : array) {
            System.out.println("elemento:" + elemento);

        }

        Produto[] produtos = new Produto[2];
        produtos[0] = new Produto();
        produtos[0].setNome("Cola-cola");
        produtos[0].setTipo("Refrigerante");

        produtos[1] = new Produto("Suco","laranja");

        for(Produto produto : produtos) {
            produto.imprimir();
        }
    }
}