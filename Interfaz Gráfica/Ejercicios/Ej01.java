package prog.ud13.ejercicios;

import javax.swing.JFrame;

public class Ej01 {

	/**
	 * Ventana sencilla
	 * 
	 * @param args
	 *            sin uso en esta aplicación
	 */
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Mi primera aplicación en Swing");
		f.setSize(400, 200);
		f.setLocation(100, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
