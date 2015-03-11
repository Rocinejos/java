import java.util.*;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = scan.nextInt();		
		
		if (numero%2 == 0) {
			System.out.println("ES PAR");
		}
		else {
			System.out.println("ES IMPAR");
		}
	}
}