package prog.ud13.ejercicios;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ej14 extends JFrame {
	enum Operacion {
		SUMAR, RESTAR, MULTIPLICAR, DIVIDIR, NULA
	};

	enum Estado {
		PRIMER_OPERANDO, OPERACION, SEGUNDO_OPERANDO, RESULTADO
	};

	public static void main(String[] args) {
		(new Ej14()).setVisible(true);
	}

	private JPanel pContenido;
	private JLabel lPantalla;
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
	private Estado estadoActual;
	private int primerOperando;
	private Operacion operacion;

	public Ej14() {
		inicializarVentana();
		inicializarComponentes();
		inicializarListener();
		inicializarMaquinaEstados();
	}

	private void inicializarMaquinaEstados() {
		estadoActual = Estado.PRIMER_OPERANDO;
		accionBorrar();
	}

	private void inicializarListener() {
		bUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDigito(1);
			}
		});

		bDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDigito(2);
			}
		});

		bTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDigito(3);
			}
		});

		bCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDigito(4);
			}
		});

		bCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDigito(5);
			}
		});

		bSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDigito(6);
			}
		});

		bSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDigito(7);
			}
		});

		bOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDigito(8);
			}
		});

		bNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDigito(9);
			}
		});

		bCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionDigito(0);
			}
		});

		bMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionOperacion(Operacion.SUMAR);
			}
		});

		bMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionOperacion(Operacion.RESTAR);
			}
		});

		bPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionOperacion(Operacion.MULTIPLICAR);
			}
		});

		bDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionOperacion(Operacion.DIVIDIR);
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

	protected void accionOperacion(Operacion operacion) {
		switch (estadoActual) {
		case PRIMER_OPERANDO:
			accionOperacionPrimera(operacion);
			estadoActual = Estado.OPERACION;
			break;
		case OPERACION:
			accionOperacionSiguientes(operacion);
			estadoActual = Estado.OPERACION;
			break;
		}
	}

	private void accionOperacionSiguientes(Operacion operacion) {
		lPantalla.setText(operacionAsociada(operacion));
	}

	private void accionOperacionPrimera(Operacion operacionPrimera) {
		primerOperando = Integer.parseInt(lPantalla.getText());
		lPantalla.setText(operacionAsociada(operacionPrimera));
	}

	private String operacionAsociada(Operacion operacion) {
		String sol = "";
		switch (operacion) {
		case SUMAR:
			sol = "+";
			break;
		case RESTAR:
			sol = "-";
			break;
		case MULTIPLICAR:
			sol = "X";
			break;
		case DIVIDIR:
			sol = "%";
			break;
		}
		return sol;
	}

	protected void accionDigito(int i) {
		switch (estadoActual) {
		case PRIMER_OPERANDO:
			accionConcatenar(i);
			cambiarEstado(Estado.PRIMER_OPERANDO);
			break;
		case OPERACION:
			accionSegundoOperandoPrimera(i);
			cambiarEstado(Estado.SEGUNDO_OPERANDO);
			break;
		case SEGUNDO_OPERANDO:
			accionConcatenar(i);
			cambiarEstado(Estado.SEGUNDO_OPERANDO);
			break;
		case RESULTADO:
			acccionPrimerOperando(i);
			cambiarEstado(Estado.PRIMER_OPERANDO);
			break;
		}
	}

	private void acccionPrimerOperando(int i) {
		accionBorrar();
		lPantalla.setText("" + i);
	}

	private void memorizarOperacion() {
		switch (lPantalla.getText()) {
		case "+":
			operacion = Operacion.SUMAR;
			break;
		case "-":
			operacion = Operacion.RESTAR;
			break;
		case "X":
			operacion = Operacion.MULTIPLICAR;
			break;
		case "%":
			operacion = Operacion.DIVIDIR;
			break;
		}
	}

	private void accionSegundoOperandoPrimera(int i) {
		memorizarOperacion();
		lPantalla.setText(Integer.toString(i));
	}

	private void cambiarEstado(Estado estadoSiguiente) {
		estadoActual = estadoSiguiente;
	}

	private void accionConcatenar(int i) {
		lPantalla.setText((lPantalla.getText() + Integer.toString(i)));
	}

	protected void accionBorrar() {
		lPantalla.setText("");
		primerOperando = 0;
		operacion = Operacion.NULA;
		cambiarEstado(Estado.PRIMER_OPERANDO);
	}

	protected void accionIgual() {
		switch (estadoActual) {
		case SEGUNDO_OPERANDO:
			accionResultado();
			estadoActual = Estado.RESULTADO;
			break;
		}
	}

	private void accionResultado() {
		int op1 = primerOperando;
		int op2 = Integer.parseInt(lPantalla.getText());
		int resultado = 5555;

		Ej14APIOperaciones operar = new Ej14APIOperaciones();
		switch (operacion) {
		case SUMAR:
			resultado = operar.sumar(op1, op2);
			break;
		case RESTAR:
			resultado = operar.restar(op1, op2);
			break;
		case MULTIPLICAR:
			resultado = operar.multiplicar(op1, op2);
			break;
		case DIVIDIR:
			resultado = operar.dividir(op1, op2);
			break;
		}
		lPantalla.setText(""+resultado);

	}

	private void inicializarComponentes() {
		// Panel de contenido
		pContenido = new JPanel(new GridLayout(5, 1));
		add(pContenido);

		// FILA 1
		lPantalla = new JLabel();
		pContenido.add(lPantalla);

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
