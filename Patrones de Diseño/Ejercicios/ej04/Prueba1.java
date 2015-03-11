package prog.ud12.ejercicios.ej04;

import java.util.Scanner;

import prog.ud12.ejercicios.ej03.Translator;

;

public class Prueba1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Translator translator = new Translator();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca la palabra en español a traducir: ");
		String palabraATraducir = scanner.next();
		String palabraTraducida = null;

		palabraTraducida = translator.translate(palabraATraducir);

		System.out.println(palabraATraducir + " en inglés es "
				+ palabraTraducida);
	}

}
