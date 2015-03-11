package prog.ud13.ejercicios;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ej18 extends JFrame {
	private JPanel pContenido;
	private Ej18Lienzo pDibujo;
	private JPanel pBotones;
	private JButton bCirculo;
	private JButton bCuadrado;
	private JLabel lX;
	private JLabel lY;
	private JCheckBox ckVerCirculos;
	private JCheckBox ckVerCuadrados;
	private JButton bBorrar;
	private int x = 300;
	private int y = 300;

	public Ej18() {
		inicializarVentana();
		inicializarComponentes();
		inicializarListeners();
	}

	private void inicializarListeners() {
		bCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionarCirculo();
			}
		});

		bCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionarCuadrado();
			}
		});

		bBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionarBorrar();
			}
		});

		pDibujo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				accionarClicPanel(e);
			}
		});
	}

	protected void accionarClicPanel(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		lX.setText("x: " + x);
		lY.setText("y: " + y);
	}

	protected void accionarBorrar() {
		pDibujo.borrar();
		pDibujo.repaint();
	}

	protected void accionarCuadrado() {
		pDibujo.addNuevoCuadrado(x,y);
		pDibujo.repaint();
	}

	protected void accionarCirculo() {
		pDibujo.addNuevoCirculo(x,y);
		pDibujo.repaint();
	}

	private void inicializarComponentes() {
		pContenido = new JPanel(new BorderLayout());
		add(pContenido);

		pDibujo = new Ej18Lienzo();
		add(pDibujo, BorderLayout.CENTER);

		pBotones = new JPanel(new GridLayout(7, 1));
		add(pBotones, BorderLayout.EAST);

		bCirculo = new JButton("Círculo");
		pBotones.add(bCirculo);

		bCuadrado = new JButton("Cuadrado");
		pBotones.add(bCuadrado);

		lX = new JLabel("x: ");
		pBotones.add(lX);

		lY = new JLabel("y: ");
		pBotones.add(lY);

		ckVerCirculos = new JCheckBox("Ver círculos");
		pBotones.add(ckVerCirculos);

		ckVerCuadrados = new JCheckBox("Ver cuadrados");
		pBotones.add(ckVerCuadrados);

		bBorrar = new JButton("BORRAR");
		pBotones.add(bBorrar);

	}

	private void inicializarVentana() {
		setSize(700, 400);
		setLocation(200, 50);
		setTitle("Ej18 - Dibujos");
	}

	public static void main(String[] args) {
		(new Ej18()).setVisible(true);
	}
}
