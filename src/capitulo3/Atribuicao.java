package capitulo3;

public class Atribuicao {

	public static void main(String[] args) {

		int valor = 1;

		System.out.println("valor:" + valor);

		int valor2 = valor;

		System.out.println("valor2:" + valor2);

		System.out.println("Os valores s�o iguais " + (valor == valor2));

		boolean saoIguais = valor == valor2; // true
		boolean diferentes = 10 != 12; // true
		boolean diferentesFalso = 10 != 10; // false
		boolean maior = 5 > 2;// true
		boolean menor = 5 < 6;// true
		boolean maiorFalso = 5 > 5;// Falso
		boolean maiorIgual = 5 >= 5;// true
		boolean menorIgual = 5 <= 5;// true

		int soma = 10 + 20; // 30
		int subtracao = 10 - 20;// 30
		int multiplicacao = 10 * 20;// 200
		int divisao = 10 / 2;//
		int fracao = 10 / 3;
		double divisaoComPonto = 10 / 3;
		int resto = 10 % 3;

		int valorNumerico = 0;

		valorNumerico = valorNumerico + 1;
		valorNumerico += 1;
		valorNumerico =+ 1;
		valorNumerico =- 1;
		valorNumerico -= 1;
		valorNumerico /= 1;
		valorNumerico *= 2;
		
		
		valorNumerico ++;//Soma mais 1 inteiro
		valorNumerico --;// Subtrai mais 1 inteiro
		
		

		System.out.println("ValorNumerico:" + valorNumerico);// -4
		System.out.println("ValorNumerico:" + valorNumerico++);// -4
		System.out.println("ValorNumerico:" + ++valorNumerico);//-2
		System.out.println("ValorNumerico:" + valorNumerico);//-2

	}

}
