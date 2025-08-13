package capitulo6;

public class TesteCalculoPerimetro {

    public static void main(String[] args) {
        //final é definido para um valor que não pode ser alterado
        final double area = 2;
       final double ralo = 2;

        double perimetro = area * ralo * Trigonometria.PI;
        System.out.println("valor do perimetro: " + perimetro);
    }
}
