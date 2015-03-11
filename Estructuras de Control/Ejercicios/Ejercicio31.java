public class Ejercicio31 {
	public static void main(String[] args) {
		double acc = 0;
		for (double i=1; i<=100; i++) {
			double terminoActual = 	(i*i + 1) / i;
			System.out.print("("+i+")"+terminoActual+" ");
			acc += terminoActual; // acc = acc + terminoActual;
		}
		System.out.println("\nEl sumatorio vale: "+acc);
	}
}