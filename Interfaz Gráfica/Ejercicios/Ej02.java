package prog.ud13.ejercicios;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ej02 extends JFrame {

	public Ej02() {
		inicializar();
		setVisible(true);
	}

	private void inicializar() {
		setTitle("Mi primera aplicación en Swing");
		setSize(400, 200);
		setLocation(100, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ej02();
	}
}
