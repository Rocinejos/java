package prog.ud11.ejercicios.ej08;

public class GeneradorPersonas {

	public static void main(String[] args) {
		final int NUM_PERSONAS = 100;
		for (int i = 1; i <= NUM_PERSONAS; i++) {
			System.out.print(i*10000+" NOMBRE"+(i*10000)+" "+(i*10000)+" ");
		}

	}

}
