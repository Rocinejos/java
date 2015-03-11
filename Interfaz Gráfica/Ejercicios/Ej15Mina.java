package prog.ud13.ejercicios;

import javax.swing.JButton;

public class Ej15Mina extends JButton {

	private int numMinasAlrededor;

	public void setNumMinasAlrededor(int numMinasAlrededor) {
		this.numMinasAlrededor = numMinasAlrededor;

	}

	public int getNumMinasAlrededor() {
		return this.numMinasAlrededor;
	}

	public void mostrar() {
		if (numMinasAlrededor==9) {
			setText("*");
		}
		else if (numMinasAlrededor>0 && numMinasAlrededor<9) {
			setText(""+numMinasAlrededor);
		}
	}

}
