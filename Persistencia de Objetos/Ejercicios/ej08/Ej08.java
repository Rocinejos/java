package prog.ud11.ejercicios.ej08;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ej08 {
	private static ArrayList<Persona> c = new ArrayList<Persona>();

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
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
		for (int i = 1; i <= args.length - 1; i += 3) {
			c.add(new Persona(Integer.parseInt(args[i]), args[i + 1], Integer
					.parseInt(args[i + 2])));
		}
	}

	private static void mostrar() {
		for (Persona p : c) {
			System.out.println(p);
		}

	}

	private static void materializarYColeccionar() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"src/prog/ud11/ejercicios/ej08/dat/clientes.srl"));
		Object o = null;
		try {
			while ((o = ois.readObject())!=null) {
				System.out.println(o);
			}
		}
		catch (EOFException e) {
			
		}
		finally {
			ois.close();
		}

	}

	private static void desmaterializar() throws FileNotFoundException,
			IOException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"src/prog/ud11/ejercicios/ej08/dat/clientes.srl"));

		for (Persona p : c) {
			oos.writeObject(p);
		}

		oos.close();
	}

}
