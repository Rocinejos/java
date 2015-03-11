import java.util.*;

public class Ejercicio39 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("introduce n: ");
		int n = scan.nextInt();

		for (int i=1; i<=n; i++) { //FILAS
			for (int j=1;j<=n-i;j++) {	//HUECOS
				System.out.print(" ");
			}
			
			for (int j=1; j<=i ; j++) { //ASTERISCOS
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}