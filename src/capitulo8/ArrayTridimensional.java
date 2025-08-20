package capitulo8;

public class ArrayTridimensional {
    public static void main(String[] args) {

        int[][][] tridimensional =
                {
                        {{1, 2, 3},{4,5,6},{7,8,9}},
                        {{1,3},{4,8,7},{5,9,8}},
                        {{25,58,6},{12,},{125,96,12,5,4}}
                        };
    for(int[][] coluna : tridimensional){
       for(int[] linha : coluna)
        for(int elemento : linha){
            System.out.println(elemento + "");

       }
        System.out.println("-");
    }
        System.out.println();
                                    ///  coluna,linha infinito
    int[][][] tridimensiona2 = new int[2][2][2];

    tridimensiona2[0][0][0] =1;
    tridimensiona2[0][0][1] =2;
    tridimensiona2[0][1][0] =3;
    tridimensiona2[0][1][1] =3;
    }
}
