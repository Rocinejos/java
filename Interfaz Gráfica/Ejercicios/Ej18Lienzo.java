package prog.ud13.ejercicios;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ej18Lienzo extends JPanel {
	private ArrayList<Ej18Cuadrado> cuadrados;
	private ArrayList<Ej18Circulo> circulos;

	public Ej18Lienzo() {
		super();
		cuadrados = new ArrayList<Ej18Cuadrado>();
		circulos = new ArrayList<Ej18Circulo>();
	}

	public void paint(Graphics g) {
		super.paint(g);
			for (Ej18Cuadrado cu : cuadrados) {
				g.drawRect(cu.getX(), cu.getY(), 50, 50);
			}
			for (Ej18Circulo ci : circulos) {
				g.drawOval(ci.getX(), ci.getY(), 50, 50);
			}
	}

	public void addNuevoCuadrado(int x, int y) {
		cuadrados.add(new Ej18Cuadrado(x, y));

	}

	public void addNuevoCirculo(int x, int y) {
		circulos.add(new Ej18Circulo(x, y));

	}

	public void borrar() {
		cuadrados=new ArrayList<Ej18Cuadrado>();
		circulos=new ArrayList<Ej18Circulo>();
	}
}
