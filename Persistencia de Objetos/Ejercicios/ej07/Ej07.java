package prog.ud11.ejercicios.ej07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ej07 {
	private static ArrayList<Persona> c = new ArrayList<Persona>(); 
	
	public static void main(String[] args) {
		boolean errorDeUso = false;
		if (args.length >= 1) {
			if (args[0].equals("R")) {
				materializarYColeccionar();
				mostrar();
			} else if (args[0].equals("W")) {
				rellenarColeccion(args);
				mostrar();
				desmaterializar();
			} else {
				errorDeUso = true;
			}
		} else {
			errorDeUso = true;
		}
		if (errorDeUso) {
			System.out.println("USO: java Ej08 {R | W {<dni> <nom>}+ }");
		}
	}

	private static void rellenarColeccion(String[] args) {
		for (int i=1;i<=args.length-1;i+=3) {
			c.add(new Persona(Integer.parseInt(args[i]), args[i+1], Integer.parseInt(args[i+2])));
		}
	}


	private static void mostrar() {
		for (Persona p:c) {
			System.out.println(p);
		}

	}

	private static void materializarYColeccionar() {
		FileReader fr = null;
		BufferedReader br = null;

		try {

			fr = new FileReader(
					"src/prog/ud11/ejercicios/ej07/dat/clientes.txt");
			br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null) {
				String[] dato = linea.split(":");
				c.add(new Persona(Integer.parseInt(dato[0]), dato[1], Integer.parseInt(dato[2])));
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	private static void desmaterializar() {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {

			fw = new FileWriter(
					"src/prog/ud11/ejercicios/ej07/dat/clientes.txt");
			pw = new PrintWriter(fw);

			for (Persona p:c) {
				pw.println(p.getDni() + ":" + p.getNombre() + ":" + p.getPeso());
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
