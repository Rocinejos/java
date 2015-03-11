package prog.ud12.ejercicios.ej14;

import java.io.IOException;
import java.util.Scanner;
import prog.ud12.ejercicios.ej06.ITraductor;
import prog.ud12.ejercicios.ej13.TraductoresFactory;

public class Prueba8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, IOException {
		ITraductor adapter = null;

		TraductoresFactory factoriaTraductor = new TraductoresFactory();

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
