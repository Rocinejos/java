package prog.ud11.ejercicios.ej06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copiar {

	public static void main(String[] args) {
		try {
			String rutaOrigen=args[0];
			String rutaDestino=args[1];

			FileInputStream fis = new FileInputStream(rutaOrigen);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(rutaDestino);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			byte[] array = new byte[1000];
			int leidos = bis.read(array);
			while (leidos > 0) {
				bos.write(array, 0, leidos);
				leidos = bis.read(array);
			}
			bis.close();
			bos.close();
		} catch (IndexOutOfBoundsException ie) {
			System.out.println("Uso: java Copiar fichOrigen fichDestino");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
