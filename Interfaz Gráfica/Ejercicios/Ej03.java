package prog.ud13.ejercicios;

import java.awt.Toolkit;
import java.util.Scanner;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ej03 extends JFrame {
	private String tituloVentana;
	private final int ANCHO_VENTANA = 400;
	private final int ALTO_VENTANA = 200;

	public Ej03(String titulo) {
		this.tituloVentana = titulo;
		inicializar();
		setVisible(true);
	}

	private void inicializar() {
		setTitle(this.tituloVentana);
		setSize(ANCHO_VENTANA, ALTO_VENTANA);
		inicializarUbicacion();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void inicializarUbicacion() {
		int x, y, anchoEscritorio, altoEscritorio;

		anchoEscritorio = Toolkit.getDefaultToolkit().getScreenSize().width;
		altoEscritorio = Toolkit.getDefaultToolkit().getScreenSize().height;

		x = (anchoEscritorio / 2) - (ANCHO_VENTANA / 2);
		y = (altoEscritorio / 2) - (ALTO_VENTANA / 2);

		setLocation(x, y);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Introduce el título de la ventana: ");
		Scanner in = new Scanner(System.in);
		String titulo = in.nextLine();

		new Ej03(titulo);
	}
}
