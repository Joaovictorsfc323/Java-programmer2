package Capitulo4;

public class EstruturaControle {

	public static void main(String[] args) {

		if (10 % 4 == 0) {
			System.out.println("Validei a condição");
			System.out.println("È o numero é par");

		} else {
			System.out.println("Validei a condição");
			System.out.println("Impar");

		}
		// int ano = 1970;
		//
		// if (ano >= 1946 && ano <= 1964) {
		// System.out.println("Baby Boomers");
		//
		// } else if (ano >= 1965 && ano <= 1980) {
		//
		// System.out.println("Geração X");
		//
		// } else if (ano >= 1981 && ano <= 2000) {
		// System.out.println("Geração Y(Millennials)");
		//
		// } else if (ano >= 2001 && ano <= 2012) {
		// System.out.println("Geração Z");
		//
		// } else if (ano >= 2013) {
		// System.out.println("Geração Alpha");
		//
		// } else {
		//
		// System.out.println("Não tem geração definida");
		// }

		int outroAno = 1998;

		switch (outroAno) {
		case 1964: {
			System.out.println("Baby Boomers");
			break;
		}
		case 1980: {
			System.out.println("Geração X");
			break;
		}
		case 2000: {
			System.out.println("Geração Y(Millennials)");
			break;
		}
		case 2012: {
			System.out.println("Geração Z");
			break;
		}
		case 2013: {
			System.out.println("Geração Alpha");
			break;
		}
		default: {
			System.out.println("Não tem geração definida");

		}

		}

		// Segundo case

		System.out.println("Depois do switch");

		switch (DiasDaSemana.domingo) {
		case segunda: {
			System.out.println(DiasDaSemana.segunda);
			break;

		}

		case terca: {

			System.out.println(DiasDaSemana.terca);
			break;
		}

		case quarta: {

			System.out.println(DiasDaSemana.quarta);
			break;
		}

		case quinta: {
			System.out.println(DiasDaSemana.quinta);
			break;
		}

		case sexta: {
			System.out.println(DiasDaSemana.sexta);
			break;

		}

		default:
			System.out.println("Outro dia");
		}

	}

}
