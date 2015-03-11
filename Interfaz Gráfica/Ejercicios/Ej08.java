package prog.ud13.ejercicios;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ej08 extends JFrame {

	private String tituloVentana = "EJEMPLO_03: Labels-Hola mundo";
	private JPanel pContenido;

	public Ej08() {
		inicializarComponentes();
		inicializarVentana();
	}

	private void inicializarComponentes() {
		pContenido = new JPanel(new GridLayout(1, 1));
		pContenido.setBackground(Color.BLUE);
		pContenido.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JLabel lHolaMundo = new JLabel("Hola mundo");

		lHolaMundo.setForeground(Color.WHITE);

		pContenido.add(lHolaMundo);

		this.add(pContenido);
	}

	private void inicializarVentana() {
		setSize(400, 400);
		setLocation(300, 300);
		setTitle(tituloVentana);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ej08();
	}

}
