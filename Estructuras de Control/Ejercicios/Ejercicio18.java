import java.util.*;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero = scan.nextInt();
		int numeroOriginal = numero;
		
		do {
			System.out.print(numero%10);
			numero = numero / 10;
		}
		while (numero != 0);

		System.out.println(" es el inverso de "+numeroOriginal);
	}
}