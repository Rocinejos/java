package prog.ud13.ejercicios;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ej06 extends JFrame {
	private JPanel pContenido;

	public Ej06() {
		inicializarVentana();
		inicializarComponentes();
		// dibujarBanderaEspanya();
		dibujarBanderaItalia();
	}

	private void dibujarBanderaEspanya() {
		JPanel panelRojo1 = new JPanel();
		panelRojo1.setBackground(Color.RED);
		JPanel panelAmarillo = new JPanel();
		panelAmarillo.setBackground(Color.YELLOW);
		JPanel panelRojo2 = new JPanel();
		panelRojo2.setBackground(Color.RED);
		pContenido.add(panelRojo1);
		pContenido.add(panelAmarillo);
		pContenido.add(panelRojo2);
	}

	private void dibujarBanderaItalia() {
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.GREEN);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.RED);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.BLACK);
		pContenido.add(panel1);
		pContenido.add(panel2);
		pContenido.add(panel3);
		pContenido.add(panel4);
	}

	private void inicializarComponentes() {
		pContenido = new JPanel(new GridLayout(3, 3));
		this.add(pContenido);
	}

	private void inicializarVentana() {
		setSize(400, 200);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ej06();
	}

}
