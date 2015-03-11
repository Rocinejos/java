import java.util.*;

public class Ejercicio22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("introduce un número: ");
		long num;
		num = scan.nextLong();

		long acc;
		acc = 0;
		
		boolean esPosicionImpar = true; //NUEVO

		do {
			long cifra;
			cifra = num%10;
			if (esPosicionImpar) { //NUEVO
				acc = acc + cifra;
			}
			num = num / 10;
			esPosicionImpar = !esPosicionImpar; //NUEVO
		}
		while (num != 0);
		
		System.out.println(acc);
	}
}