import java.util.*;

public class Ejercicio25 {
	public static boolean esPrimo(int n) {
		boolean sigueSiendoPrimo;
		sigueSiendoPrimo = true;
	
		for (int i=2; i<n && sigueSiendoPrimo; i++) {
			if (n%i==0) {
				sigueSiendoPrimo = false;
			}
		}
		
		return sigueSiendoPrimo;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce a: ");
		int a = scan.nextInt();
		
		System.out.print("Introduce b: ");
		int b = scan.nextInt();

		for (int i=a; i<=b; i++) {
			if (esPrimo(i)) {
				System.out.print(i+" ");
			}
		}
	}
}