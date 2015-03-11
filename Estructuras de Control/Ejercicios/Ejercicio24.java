import java.util.*;

public class Ejercicio24 {
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
		for (int i=1; i<=100; i++) {
			if (esPrimo(i)) {
				System.out.print((i==1?"":", ")+i);
			}
		}
	}
}