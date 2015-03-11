package prog.ud12.ejercicios.ej15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import prog.ud12.ejercicios.ej06.ITraductor;

public class TraductoresFactory {

	private static TraductoresFactory traductoresFactory;

	private ITraductor adaptadorDeTraduccion;

	public ITraductor getTraductorAdapter() {
		if (adaptadorDeTraduccion == null) {

			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(
						"src/prog/ud12/ejercicios/ej11/dat/idioma.ini"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String nombreClase = "";
			try {
				nombreClase = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				adaptadorDeTraduccion = (ITraductor) (Class
						.forName(nombreClase).newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {

				e.printStackTrace();
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
		}
		return adaptadorDeTraduccion;
	}

	private TraductoresFactory() {
	}

	public static TraductoresFactory getTraductoresFactory() {
		if (traductoresFactory == null) {
			traductoresFactory = new TraductoresFactory();
		}
		return traductoresFactory;
	}
}
