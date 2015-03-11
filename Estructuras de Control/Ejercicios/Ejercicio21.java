import java.util.*;

public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("introduce un número: ");
		long num;
		num = scan.nextLong();

		long acc;
		acc = 0;

		do {
			long cifra;
			cifra = num%10;
			acc = acc + cifra;
			num = num / 10;
		}
		while (num != 0);
		
		System.out.println(acc);
	}
}