package capitulo8;

public class testeArrayBidimensional {

    public static void main(String[] args) {
        int[][] bidimiensional = new int[5][3];


        //    0  1  2
        // 0 10 56  15
        //1 32 2    3
        //2 1
        bidimiensional[0][0] = 10;
        bidimiensional[0][1] = 56;
        bidimiensional[0][2] = 15;

        bidimiensional[1][0] = 32;
        bidimiensional[1][1] = 2;
        bidimiensional[1][2] = 3;

        bidimiensional[2][0] = 1;
        bidimiensional[2][1] = 1;
        bidimiensional[2][2] = 1;

        for (int coluna = 0; coluna < bidimiensional.length; coluna++) {
            System.out.print("COluna:" + coluna);
            for (int linha = 0; linha < bidimiensional[coluna].length; linha++) {
                System.out.println("Linha: " + linha + "elemneto:" + bidimiensional[coluna][linha]);

            }

        }

        int[][] bimiensional2 = {{1, 10, 15}, {2, 2, 8, 9}, {3}};

        for (int[] coluna : bimiensional2) {
            for (int elemento : coluna) {
                System.out.println(elemento + "");
            }
            System.out.println();
        }
    }
}
