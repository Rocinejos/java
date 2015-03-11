package prog.ud11.ejercicios.ej03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ejercicio03 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("src/prog/ud11/ejercicios/ej03/dat/nombres.txt");
			br = new BufferedReader(fr);
			String linea;
			ArrayList<String> c = new ArrayList<String>();

			while ((linea = br.readLine()) != null) {
				c.add(linea);
			}

			String maxNombre = "";
			int maxVeces = 0;

			for (String actual : c) {
				if (numVeces(c, actual) > maxVeces) {
					maxVeces = numVeces(c, actual);
					maxNombre = actual;
				}
			}

			System.out.println("El nombre más popular es " + maxNombre
					+ " y aparece " + maxVeces + " veces");

		} catch (Exception e) {
			System.out.println("Error al leer");
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				System.out.println("Error al cerrar");
			}
		}

	}

	/**
	 * 
	 * @param c
	 *            la colección en la que buscar
	 * @param cadena
	 *            la cadena a buscar
	 * @return el número de veces que aparece <cadena> en <c>
	 */
	private static int numVeces(ArrayList<String> c, String cadena) {
		int sol = 0;
		for (String actual : c) {
			if (actual.equals(cadena)) {
				sol++;
			}
		}
		return sol;
	}

}
