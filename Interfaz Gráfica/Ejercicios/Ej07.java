package prog.ud13.ejercicios;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ej07 extends JFrame {

	private String tituloVentana = "Ejercicio: Labels con scanner";
	private JPanel pContenido;

	public Ej07(String mensaje) {
		inicializarComponentes(mensaje);
		inicializarVentana();
	}

	private void inicializarComponentes(String mensaje) {
		pContenido = new JPanel(new GridLayout(1, 1));
		pContenido.setBackground(Color.BLUE);
		pContenido.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JLabel lHolaMundo = new JLabel(mensaje);
		lHolaMundo.setForeground(Color.WHITE);
		lHolaMundo.setFont(new Font("Comic sans ms", Font.BOLD, 38));
		lHolaMundo.setBackground(Color.RED);
		lHolaMundo.setOpaque(true);
		lHolaMundo.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		lHolaMundo.setAlignmentY(JLabel.CENTER_ALIGNMENT);

		pContenido.add(lHolaMundo);

		this.add(pContenido);
	}

	private void inicializarVentana() {
		setSize(400, 400);
		setLocation(400, 200);
		setTitle(tituloVentana);
		setVisible(true);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce mensaje: ");
		String mensaje = in.nextLine();
		new Ej07(mensaje);
	}

}
