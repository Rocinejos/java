import java.util.*;

public class Ejercicio13 {
	public static int doble (int numero) {
		return (2*numero);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = scan.nextInt();

		System.out.println("El doble de "+numero+" es "+doble(numero));
	}
	
}