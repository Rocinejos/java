package prog.ud12.ejercicios.ej15;

import java.io.IOException;
import java.util.Scanner;
import prog.ud12.ejercicios.ej06.ITraductor;

public class Prueba9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, IOException {
		ITraductor adapter = null;

		TraductoresFactory factoriaTraductor = TraductoresFactory.getTraductoresFactory();

		adapter = factoriaTraductor.getTraductorAdapter();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca la palabra en español a traducir: ");
		String palabraATraducir = scanner.next();
		String palabraTraducida = null;

		palabraTraducida = adapter.traducir(palabraATraducir);

		System.out.println(palabraATraducir + " en traducida es "
				+ palabraTraducida);
	}

}
