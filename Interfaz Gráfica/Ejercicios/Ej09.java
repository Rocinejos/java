package prog.ud13.ejercicios;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Ej09 extends JFrame {

	private JMenuItem mAbrir;
	private JMenuItem mGuardar;
	private JMenuItem mTXT;
	private JMenuItem mPDF;
	private JMenuItem mCopiar;
	private JMenuItem mCortar;
	private JMenuItem mPegar;

	public Ej09() {
		inicializarVentana();
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);

		JMenu mArchivo = new JMenu("Archivo");
		mb.add(mArchivo);
		JMenu mEditar = new JMenu("Editar");
		mb.add(mEditar);
		JMenu mAyuda = new JMenu("Ayuda");
		mb.add(mAyuda);

		mAbrir = new JMenuItem("Abrir");
		mArchivo.add(mAbrir);
		mGuardar = new JMenuItem("Guardar");
		mArchivo.add(mGuardar);
		JMenu mGuardarComo = new JMenu("Guardar como");
		mArchivo.add(mGuardarComo);

		mTXT = new JMenuItem("TXT");
		mGuardarComo.add(mTXT);
		mPDF = new JMenuItem("PDF");
		mGuardarComo.add(mPDF);

		mCopiar = new JMenuItem("Copiar");
		mEditar.add(mCopiar);
		mCortar = new JMenuItem("Cortar");
		mEditar.add(mCortar);
		mPegar = new JMenuItem("Pegar");
		mEditar.add(mPegar);

	}

	private void inicializarVentana() {
		setTitle("Ej09: Menús");
		setSize(500, 400);
		setLocation(350, 150);
	}

	public static void main(String[] args) {
		(new Ej09()).setVisible(true);
	}
}
