package prog.ud12.ejercicios.ej09;

import java.util.Scanner;

import prog.ud12.ejercicios.ej06.FrancesAdapter;
import prog.ud12.ejercicios.ej06.ITraductor;
import prog.ud12.ejercicios.ej06.InglesAdapter;

public class Prueba5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ITraductor adapter = null;
		
		if (args[0].equals("fra")) {
			adapter = new FrancesAdapter();
		} else if (args[0].equals("ing")) {
			adapter = new InglesAdapter();
		}

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca la palabra en español a traducir: ");
		String palabraATraducir = scanner.next();
		String palabraTraducida = null;

		palabraTraducida = adapter.traducir(palabraATraducir);

		System.out.println(palabraATraducir + " en traducida es "
				+ palabraTraducida);
	}

}
