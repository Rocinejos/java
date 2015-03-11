package prog.ud13.ejercicios;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Ej11 extends JFrame {
	private JPanel pContenido;
	private JLabel lMensaje;
	private JTextField tPalabra1;
	private JTextField tPalabra2;
	private JButton bUno;
	private JButton bDos;
	private JButton bUnoDos;
	private JButton bDosUno;

	public Ej11() {
		inicializarVentana();
		inicializarComponentes();
		inicializarListeners();
	}

	private void inicializarListeners() {
		bUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ponerUno();
			}
		});

		bDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerDos();
			}
		});

		bUnoDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerUnoDos();
			}
		});

		bDosUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerDosUno();
			}
		});
	}

	protected void ponerDosUno() {
		lMensaje.setText(tPalabra2.getText()+tPalabra1.getText());
	}

	protected void ponerUnoDos() {
		lMensaje.setText(tPalabra1.getText()+tPalabra2.getText());
	}

	protected void ponerDos() {
		lMensaje.setText(tPalabra2.getText());
	}

	protected void ponerUno() {
		lMensaje.setText(tPalabra1.getText());
	}

	private void inicializarComponentes() {
		pContenido = new JPanel(new GridLayout(4, 1));
		add(pContenido);

		// 1ª FILA
		lMensaje = new JLabel();
		pContenido.add(lMensaje);

		// 2ª FILA
		tPalabra1 = new JTextField();
		tPalabra2 = new JTextField();
		JPanel pDos = new JPanel(new GridLayout(1, 2));
		pDos.add(tPalabra1);
		pDos.add(tPalabra2);
		pContenido.add(pDos);

		// 3ª FILA
		bUno = new JButton("Uno");
		bDos = new JButton("Dos");
		JPanel pTres = new JPanel(new GridLayout(1, 2));
		pTres.add(bUno);
		pTres.add(bDos);
		pContenido.add(pTres);

		// 4ª FILA
		bUnoDos = new JButton("Uno => Dos");
		bDosUno = new JButton("Dos => Uno");
		JPanel pCuatro = new JPanel(new GridLayout(1, 2));
		pCuatro.add(bUnoDos);
		pCuatro.add(bDosUno);
		pContenido.add(pCuatro);
	}

	private void inicializarVentana() {
		setSize(400, 300);
		setLocation(300, 100);
		setTitle("Ej11 - Concatenación");
	}

	public static void main(String[] args) {
		(new Ej11()).setVisible(true);
	}
}
