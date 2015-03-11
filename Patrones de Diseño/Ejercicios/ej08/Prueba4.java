package prog.ud12.ejercicios.ej08;

import java.util.Scanner;

import prog.ud12.ejercicios.ej06.FrancesAdapter;
import prog.ud12.ejercicios.ej06.ITraductor;

public class Prueba4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ITraductor adapter;
		adapter = new FrancesAdapter();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca la palabra en español a traducir: ");
		String palabraATraducir = scanner.next();
		String palabraTraducida = null;

		palabraTraducida = adapter.traducir(palabraATraducir);

		System.out.println(palabraATraducir + " en traducida es "
				+ palabraTraducida);
	}

}
