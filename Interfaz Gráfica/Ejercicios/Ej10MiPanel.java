package prog.ud13.ejercicios;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ej10MiPanel extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval(((int)Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100));
	}
}
