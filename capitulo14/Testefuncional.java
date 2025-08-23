package capitulo14;

import java.util.function.BinaryOperator;

public class Testefuncional {

    public static void main(String[] args) {

        Calculadora somar = (valor1, valor2) -> valor1 + valor2;

        double resultado = somar.calcular(10, 15);

        System.out.println(resultado);

        Calculadora subTrair = (valor1, valor2) -> valor1 - valor2;

        double resultado2 = subTrair.calcular(10, 15);

        System.out.println(resultado2);

        Calculadora multiplicar = (valor1, valor2) -> valor1 * valor2;

        double resultado3 = multiplicar.calcular(10, 15);

        System.out.println(resultado3);


        Calculadora divisao = (valor1, valor2) -> {

            System.out.println("Valor1: " + valor1);
            System.out.println("Valor2: " + valor2);
            double valor = valor1 / valor2;
            return valor;
        };

        double resultado4 = divisao.calcular(10D, 15D);

        System.out.println(resultado4);

        BinaryOperator<Double> somarFuncao = (valor1, valor2) -> valor1 + valor2;
        Double resultado5 = somarFuncao.apply(10D, 15D); // apply da class BinaryOperator ele aplica oque voce quer fazer

        System.out.println(resultado5);
    }
}
