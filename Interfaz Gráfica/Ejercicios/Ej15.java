package prog.ud13.ejercicios;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ej15 extends JFrame {
	private JPanel pContenido;
	private JButton bNuevaPartida;
	private Ej15Tablero pTablero;
	public Ej15() {
		inicializarVentana();
		inicializarComponentes();
		inicializarListeners();
	}
	private void inicializarListeners() {
		// TODO Auto-generated method stub
		
	}
	
	private void inicializarComponentes() {
		pContenido = new JPanel(new BorderLayout());
		add(pContenido);
		
		bNuevaPartida = new JButton("Nueva partida");
		pContenido.add(bNuevaPartida,BorderLayout.NORTH);
		
		pTablero = new Ej15Tablero();
		pContenido.add(pTablero);
	}
	private void inicializarVentana() {
		setSize(300,400);
		setLocation(300,50);
		setTitle("Ej15 - BUSCAMINAS");
	}
	public static void main(String[] args) {
		(new Ej15()).setVisible(true);
	}

}
