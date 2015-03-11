package prog.ud13.ejercicios;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Ej13 extends JFrame {

	enum Estado {
		PRIMERA_PALABRA, SEGUNDA_PALABRA, CONCATENACION
	};

	private Estado estadoActual;

	private JTextField tPalabra;
	private JButton bContinuar;

	private String primeraPalabra;

	public Ej13() {
		inicializarVentana();
		inicializarComponentes();
		inicializarListeners();
		inicializarMaquinaEstados();
	}

	private void inicializarMaquinaEstados() {
		estadoActual = Estado.PRIMERA_PALABRA;
		accionesPrimeraPalabra();
	}

	private void accionesPrimeraPalabra() {
		tPalabra.setText("");
		bContinuar.setText("Segunda palabra");
	}

	private void inicializarListeners() {
		bContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionContinuar();
			}
		});
	}

	protected void accionContinuar() {
		switch (estadoActual) {
		case PRIMERA_PALABRA:
			accionesSegundaPalabra();
			actualizarEstado(Estado.SEGUNDA_PALABRA);
			break;
		case SEGUNDA_PALABRA:
			accionesConcatenar();
			actualizarEstado(Estado.CONCATENACION);
			break;
		case CONCATENACION:
			accionesPrimeraPalabra();
			actualizarEstado(Estado.PRIMERA_PALABRA);
			break;
		}
	}

	private void actualizarEstado(Estado nuevoEstado) {
		this.estadoActual = nuevoEstado;
	}

	private void accionesConcatenar() {
		tPalabra.setText(primeraPalabra + tPalabra.getText());
		//bContinuar.setText("FIN");
		bContinuar.setText("Nueva palabra");
		//bContinuar.setEnabled(false);
	}

	private void accionesSegundaPalabra() {
		primeraPalabra = tPalabra.getText();
		tPalabra.setText("");
		bContinuar.setText("Concatenar");
	}

	private void inicializarComponentes() {
		tPalabra = new JTextField();
		bContinuar = new JButton();
		add(tPalabra);
		add(bContinuar);
	}

	private void inicializarVentana() {
		setSize(300, 400);
		setLocation(500, 50);
		setTitle("Ej 13. Máquina de estados simple");
		setLayout(new GridLayout(2, 1));
	}

	public static void main(String[] args) {
		(new Ej13()).setVisible(true);
	}

}
