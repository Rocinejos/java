import java.util.*;

public class Ejercicio36 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("introduce n: ");
		int n = scan.nextInt();

		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i=n-1; i>=1; i--) {
			for (int j=1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}
}