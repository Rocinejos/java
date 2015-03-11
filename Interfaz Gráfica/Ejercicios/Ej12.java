package prog.ud13.ejercicios;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ej12 extends JFrame {
	public static void main(String[] args) {
		(new Ej12()).setVisible(true);
	}

	private JPanel pContenido;
	private JLabel lResultado;
	private JButton bCero;
	private JButton bUno;
	private JButton bDos;
	private JButton bTres;
	private JButton bCuatro;
	private JButton bCinco;
	private JButton bSeis;
	private JButton bSiete;
	private JButton bOcho;
	private JButton bNueve;
	private JButton bMas;
	private JButton bMenos;
	private JButton bPor;
	private JButton bDiv;
	private JButton bIgual;
	private JButton bBorrar;

	public Ej12() {
		inicializarVentana();
		inicializarComponentes();
		inicializarListener();
	}

	private void inicializarListener() {
		bUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionUno();
			}
		});

		bDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDos();
			}
		});
		
		bTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionTres();
			}
		});

		bCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionCuatro();
			}
		});

		bCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionCinco();
			}
		});

		bSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionSeis();
			}
		});

		bSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionSiete();
			}
		});

		bOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionOcho();
			}
		});

		bNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionNueve();
			}
		});

		bCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionCero();
			}
		});

		bMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionMas();
			}
		});

		bMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionMenos();
			}
		});

		bPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionPor();
			}
		});

		bDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDiv();
			}
		});

		bIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionIgual();
			}
		});

		bBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBorrar();
			}
		});

	}

	protected void accionBorrar() {
		// TODO Auto-generated method stub
		System.out.println("BORRAR");
	}

	protected void accionIgual() {
		// TODO Auto-generated method stub
		System.out.println("IGUAL");
	}

	protected void accionDiv() {
		// TODO Auto-generated method stub
		System.out.println("/");
	}

	protected void accionPor() {
		// TODO Auto-generated method stub
		System.out.println("x");
	}

	protected void accionMenos() {
		// TODO Auto-generated method stub
		System.out.println("-");
	}

	protected void accionMas() {
		// TODO Auto-generated method stub
		System.out.println("+");
	}

	protected void accionCero() {
		// TODO Auto-generated method stub
		System.out.println("0");
	}

	protected void accionNueve() {
		// TODO Auto-generated method stub
		System.out.println("9");
	}

	protected void accionOcho() {
		// TODO Auto-generated method stub
		System.out.println("8");
	}

	protected void accionSiete() {
		// TODO Auto-generated method stub
		System.out.println("7");
	}

	protected void accionSeis() {
		// TODO Auto-generated method stub
		System.out.println("6");
	}

	protected void accionUno() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	protected void accionDos() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	protected void accionTres() {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

	protected void accionCuatro() {
		// TODO Auto-generated method stub
		System.out.println("4");
	}

	protected void accionCinco() {
		// TODO Auto-generated method stub
		System.out.println("5");
	}

	private void inicializarComponentes() {
		// Panel de contenido
		pContenido = new JPanel(new GridLayout(5, 1));
		add(pContenido);

		// FILA 1
		lResultado = new JLabel();
		pContenido.add(lResultado);

		// FILA 2
		bSiete = new JButton("7");
		bOcho = new JButton("8");
		bNueve = new JButton("9");
		bMas = new JButton("+");
		JPanel pDos = new JPanel(new GridLayout(1, 4));
		pDos.add(bSiete);
		pDos.add(bOcho);
		pDos.add(bNueve);
		pDos.add(bMas);
		pContenido.add(pDos);

		// FILA 3
		bCuatro = new JButton("4");
		bCinco = new JButton("5");
		bSeis = new JButton("6");
		bMenos = new JButton("-");
		JPanel pTres = new JPanel(new GridLayout(1, 4));
		pTres.add(bCuatro);
		pTres.add(bCinco);
		pTres.add(bSeis);
		pTres.add(bMenos);
		pContenido.add(pTres);

		// FILA 4
		bUno = new JButton("1");
		bDos = new JButton("2");
		bTres = new JButton("3");
		bPor = new JButton("x");
		JPanel pCuatro = new JPanel(new GridLayout(1, 4));
		pCuatro.add(bUno);
		pCuatro.add(bDos);
		pCuatro.add(bTres);
		pCuatro.add(bPor);
		pContenido.add(pCuatro);

		// FILA 5
		bBorrar = new JButton("C");
		bCero = new JButton("0");
		bIgual = new JButton("=");
		bDiv = new JButton("/");
		JPanel pCinco = new JPanel(new GridLayout(1, 4));
		pCinco.add(bBorrar);
		pCinco.add(bCero);
		pCinco.add(bIgual);
		pCinco.add(bDiv);
		pContenido.add(pCinco);
	}

	
	private void inicializarVentana() {
		setSize(300, 400);
		setLocation(500, 50);
		setTitle("Calculadora");
	}
	
	
}
