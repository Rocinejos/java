package prog.ud11.ejercicios.ej04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej04 {

	/**
	 * Hacer un programa que busque todas las apariciones de una palabra
	 * (proporcionada por argumento de entrada) en el fichero “e.txt” y escriba
	 * un fichero “s.htm” en el que aparezca dicha palabra en negrita. (Pista:
	 * investigar el método replaceAll(...) de String)
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fr = new FileReader("src/prog/ud11/ejercicios/ej04/dat/e.txt");
			br = new BufferedReader(fr);

			fw = new FileWriter("src/prog/ud11/ejercicios/ej04/dat/s.htm");
			pw = new PrintWriter(fw);

			String linea;
			
			while ((linea = br.readLine()) != null) {
				String[] palabra = linea.split(" ");
				for (int i=0;i<palabra.length;i++) {
					if (palabra[i].equals(args[0])) {
						pw.print("<b>"+palabra[i]+"</b> ");
					}
					else {
						pw.print(palabra[i]+" ");
					}
				}
				pw.println("<br>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
