package prog.ud12.ejercicios.ej07;

import java.util.Scanner;

import prog.ud12.ejercicios.ej06.ITraductor;
import prog.ud12.ejercicios.ej06.InglesAdapter;

;

public class Prueba3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ITraductor adapter;
		adapter = new InglesAdapter();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca la palabra en español a traducir: ");
		String palabraATraducir = scanner.next();
		String palabraTraducida = null;

		palabraTraducida = adapter.traducir(palabraATraducir);

		System.out.println(palabraATraducir + " en traducida es "
				+ palabraTraducida);
	}

}
