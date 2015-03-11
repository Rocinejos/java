package prog.ud13.ejercicios;

import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ej05 extends JFrame {
	private String tituloVentana = "EJ_05: Ventana que rebota";
	
	private final int ANCHO_VENTANA = 200;
	private final int ALTO_VENTANA = 200;
	
	private final int ANCHO_PANTALLA = Toolkit.getDefaultToolkit().getScreenSize().width;
	private final int ALTO_PANTALLA = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	private int x = (ANCHO_PANTALLA/2)-(ANCHO_VENTANA/2);
	private int y = (ALTO_PANTALLA/2)-(ALTO_VENTANA/2);
	
	private int incX = ((int)(Math.random()*2)==1)?1:-1;
	private int incY = ((int)(Math.random()*2)==1)?1:-1;

	public Ej05() {
		inicializar();
		setVisible(true);
		mover();
	}

	private void mover() {
		while (true) {
			actualizarCoordenadasAlt();
			setLocation(x,y);
			esperar();
		}
	}

	private void actualizarCoordenadas() {
		if ( (x+ANCHO_VENTANA == ANCHO_PANTALLA) && incX==1 ) { //extremo derecho y avanzando
			incX = -1;
		}
		
		if ((x==0) && incX==-1) { //extremo iquierdo y retrocediendo
			incX = 1;
		}
		
		if ((y+ALTO_VENTANA == ALTO_PANTALLA) && incY==1) { //extremo inferior y avanzando
			incY = -1;
		}
		
		if ((y==0) && incY==-1) { //extremo superior y retrocediendo
			incY = 1;
		}
		
		x = x + incX;
		y = y + incY;
	}

	private void actualizarCoordenadasAlt() {
		if (x+ANCHO_VENTANA == ANCHO_PANTALLA) { //extremo derecho y avanzando
			incX = -1;
		}
		
		if (x==0) { //extremo iquierdo y retrocediendo
			incX = 1;
		}
		
		if (y+ALTO_VENTANA == ALTO_PANTALLA) { //extremo inferior y avanzando
			incY = -1;
		}
		
		if (y==0) { //extremo superior y retrocediendo
			incY = 1;
		}
		
		x = x + incX;
		y = y + incY;
	}

	private void esperar() {
		for (int i=0;i<10000000;i++) {
		}
	}

	private void inicializar() {
		setTitle(this.tituloVentana);
		setSize(ANCHO_VENTANA, ALTO_VENTANA);
		setLocation(x, y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ej05();
		new Ej05();
		new Ej05();
		new Ej05();
		
	}
}
