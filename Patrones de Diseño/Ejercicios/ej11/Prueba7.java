package prog.ud12.ejercicios.ej11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import prog.ud12.ejercicios.ej06.ITraductor;

public class Prueba7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			IOException {
		ITraductor adapter = null;

		BufferedReader br = new BufferedReader(new FileReader(
				"src/prog/ud12/ejercicios/ej11/dat/idioma.ini"));
		String nombreClase = br.readLine();
		
		adapter = (ITraductor) (Class.forName(nombreClase).newInstance());

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca la palabra en español a traducir: ");
		String palabraATraducir = scanner.next();
		String palabraTraducida = null;

		palabraTraducida = adapter.traducir(palabraATraducir);

		System.out.println(palabraATraducir + " en traducida es "
				+ palabraTraducida);
	}

}
