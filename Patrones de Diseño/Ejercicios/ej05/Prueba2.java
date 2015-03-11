package prog.ud12.ejercicios.ej05;

import java.util.Scanner;

import prog.ud12.ejercicios.ej03.Traducteur;

public class Prueba2 {

	public static void main(String[] args) {
		Traducteur traducteur = new Traducteur();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca la palabra en español a traducir: ");
		String palabraATraducir = scanner.next();
		String palabraTraducida = null;

		traducteur.preparez(palabraATraducir);
		traducteur.traduire();
		palabraTraducida = traducteur.getMotTraduit();

		System.out.println(palabraATraducir + " en francés es "
				+ palabraTraducida);
	}

}
