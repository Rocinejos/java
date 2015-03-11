package prog.ud13.ejercicios;

import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ej04 extends JFrame {
	private String tituloVentana = "EJ_04";
	private final int ANCHO_VENTANA = 200;
	private final int ALTO_VENTANA = 200;

	public Ej04(String titulo) {
		this.tituloVentana = titulo;
		inicializar();
		setVisible(true);
	}

	public Ej04() {
		setTitle(tituloVentana);
		inicializar();
		setVisible(true);
		mover();
	}

	private void mover() {
		for (int i = 0; i < 200; i++) {
			this.setLocation(this.getLocation().x + 1, this.getLocation().y);
			esperar();
		}

	}

	private void esperar() {
		for (int i=0;i<10000000;i++) {
		}
		
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

	public static void main(String[] args) {
		new Ej04();
	}
}
