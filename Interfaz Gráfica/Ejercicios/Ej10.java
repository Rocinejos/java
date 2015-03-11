package prog.ud13.ejercicios;

import java.awt.GridLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ej10 extends JFrame {
	private Ej10MiPanel pContenido;

	public Ej10() {
		inicializarVentana();
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		pContenido = new Ej10MiPanel(new GridLayout(1,1));
		add(pContenido);
	}

	private void inicializarVentana() {
		setTitle("Ej10: Circunferencia en movimiento");
		setSize(700, 400);
		setLocation(250, 150);
	}

	public static void main(String[] args) {
		(new Ej10()).setVisible(true);
	}
}
