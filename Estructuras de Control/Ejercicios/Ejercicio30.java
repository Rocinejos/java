import java.util.*;

public class Ejercicio30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce número de términos a visualizar: ");
		int n = scan.nextInt();		
		
		int x = 1;

		for (int i=1; i<=n; i++) {
			System.out.print("("+i+")"+x+" ");
			x = x*3;
		}
		
	}
}