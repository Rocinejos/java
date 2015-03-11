package prog.ud12.ejercicios.ej10;

import java.util.Scanner;
import prog.ud12.ejercicios.ej06.ITraductor;

public class Prueba6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		ITraductor adapter = null;

		adapter = (ITraductor) (Class.forName(args[0]).newInstance());

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca la palabra en español a traducir: ");
		String palabraATraducir = scanner.next();
		String palabraTraducida = null;

		palabraTraducida = adapter.traducir(palabraATraducir);

		System.out.println(palabraATraducir + " en traducida es "
				+ palabraTraducida);
	}

}
