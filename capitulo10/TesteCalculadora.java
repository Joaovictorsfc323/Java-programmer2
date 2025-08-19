package capitulo10;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
         double resultadosDouble = calculadora.somar(101,201);
        System.out.println(resultadosDouble);

         int  somar = calculadora.somar(10,20);
        System.out.println(somar);

       int minhaVariavel =calculadora.subtrair(10,10);
        System.out.println(minhaVariavel);

        Soma.somar(180d,150d);

    }
}
