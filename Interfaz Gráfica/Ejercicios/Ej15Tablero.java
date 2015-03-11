package prog.ud13.ejercicios;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Ej15Tablero extends JPanel {
	private int ancho;
	private int alto;
	private Ej15Mina[][] minas;
	private int numMinas;

	private void inicializarMinas() {
		minas = new Ej15Mina[alto][ancho];
		setLayout(new GridLayout(alto, ancho));
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				Ej15Mina mina = new Ej15Mina();
				add(mina);
				minas[i][j] = mina;
			}
		}

	}

	public Ej15Tablero() {
		this.ancho = 9;
		this.alto = 9;
		this.numMinas = 10;
		inicializarMinas();
		distribuirMinasAzar();
		inicializarValoresMinasAlrededor();
		descubrirMinas();
	}

	private void inicializarValoresMinasAlrededor() {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				int numMinasAlrededor = calcularNumMinasAlredor(i,j);
				minas[i][j].setNumMinasAlrededor(numMinasAlrededor);
			}
		}

	}

	private int calcularNumMinasAlredor(int i, int j) {
		int numMinasAlrededor = 0;
		for (int iAux=i-1;iAux<=i+1;iAux++) {
			for (int jAux=j-1;jAux<=j+1;jAux++) {
				if (iAux!=i && jAux!=j) {
					if (minas[iAux][jAux].getNumMinasAlrededor()==9) {
						numMinasAlrededor++;
					}
				}
			}
		}
		return numMinasAlrededor;
	}

	private void distribuirMinasAzar() {
		int numMinasColocadas = 0;
		while (numMinasColocadas < numMinas) {
			for (int i = 0; numMinasColocadas < numMinas && i < alto; i++) {
				for (int j = 0; numMinasColocadas < numMinas && j < ancho; j++) {
					if (minas[i][j].getNumMinasAlrededor() != 9
							&& (int) (Math.random() * 6) == 0) {
						minas[i][j].setNumMinasAlrededor(9);
						numMinasColocadas++;
					}
				}
			}
		}
	}

	private void descubrirMinas() {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				minas[i][j].mostrar();
			}
		}
	}

}
