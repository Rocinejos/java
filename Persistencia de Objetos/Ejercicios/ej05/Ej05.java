package prog.ud11.ejercicios.ej05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ej05 {
	private static ArrayList<String> palabrasClave = new ArrayList<String>();

	public static void main(String[] args) {
		generarCSS();
		procesarPalabras();
	}

	private static String quitaTildes(String s) {
		String sol = "";
		for (int i = 0; i < s.length(); i++) {
			char letra = s.charAt(i);
			switch (letra) {
			case 'á':
				sol += 'a';
				break;
			case 'é':
				sol += 'e';
				break;
			case 'í':
				sol += 'i';
				break;
			case 'ó':
				sol += 'o';
				break;
			case 'ú':
				sol += 'u';
				break;
			default:
				sol += letra;
				break;
			}
		}
		return sol;
	}

	private static String filtrar(String s) {
		String sol = "";
		for (int i = 0; i < s.length(); i++) {
			char letra = s.charAt(i);
			if ((letra >= 65 && letra <= 90) || (letra >= 97 && letra <= 122)
					|| letra == 'Ñ' || letra == 'ñ') {
				sol += s.charAt(i);
			}
		}
		return sol;
	}

	private static void generarCSS() {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fr = new FileReader(
					"src/prog/ud11/ejercicios/ej05/dat/palabras.txt");
			br = new BufferedReader(fr);

			fw = new FileWriter(
					"src/prog/ud11/ejercicios/ej05/dat/css/estilo.css");
			pw = new PrintWriter(fw);

			String linea;
			while ((linea = br.readLine()) != null) {
				String[] palabra = linea.split(":");
				palabrasClave
						.add(filtrar(quitaTildes(palabra[0].toLowerCase())));

				pw.println("." + palabra[0] + " {");
				pw.println("\tcolor:" + palabra[1] + ";");
				pw.println("}");
			}
			System.out.println(palabrasClave);
			System.out.println("CSS generado");
		}

		catch (Exception e) {
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

	private static void procesarPalabras() {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fr = new FileReader(
					"src/prog/ud11/ejercicios/ej05/dat/original.txt");
			br = new BufferedReader(fr);

			fw = new FileWriter(
					"src/prog/ud11/ejercicios/ej05/dat/coloreado.htm");
			pw = new PrintWriter(fw);

			inicializarCabeceras(pw);
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] palabra = linea.split(" ");
				pw.println("<p>");
				for (int i = 0; i < palabra.length; i++) {
					String palabraFiltrada = filtrar(quitaTildes(palabra[i]
							.toLowerCase()));
					if (palabrasClave.contains(palabraFiltrada)) {
						pw.print("<span class=\"" + filtrar(palabraFiltrada)
								+ "\">");
						pw.print(palabra[i]);
						pw.print("</span>");
					} else {
						pw.print(palabra[i]);
					}
					pw.print(" ");
				}
				pw.println("</p>");
			}
			pw.println("</body>");
			pw.println("</html>");
			System.out.println("Página coloreada generada");
		}

		catch (Exception e) {
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

	private static void inicializarCabeceras(PrintWriter pw) {
		pw.println("<html>");
		pw.println("\t<head>");
		pw.println("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\">");
		pw.println("\t</head>");
		pw.println("<body>");
	}
}
