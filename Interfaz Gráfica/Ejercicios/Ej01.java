package prog.ud13.ejercicios;

import javax.swing.JFrame;

public class Ej01 {

	/**
	 * Ventana sencilla
	 * 
	 * @param args
	 *            sin uso en esta aplicaci�n
	 */
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Mi primera aplicaci�n en Swing");
		f.setSize(400, 200);
		f.setLocation(100, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
