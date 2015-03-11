package prog.ud11.ejercicios.ej02;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio02 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("src/prog/ud11/ejercicios/ej02/dat/nombres.txt");
			br = new BufferedReader(fr);
			String linea;
			int acc = 0;
			while ((linea = br.readLine()) != null) {
				if (linea.equals(args[0])) {
					acc++;
				}
			}
			
			System.out.println("Veces que aparece "+args[0]+": "+acc);
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

}
