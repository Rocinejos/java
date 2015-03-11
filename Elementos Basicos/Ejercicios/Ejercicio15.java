import java.util.*;
public class Ejercicio15 {

	public static int maximo (int n1, int n2) {
		return ( (n1>n2) ? n1 : n2);
	}
	
	public static void main(String[] args) {
		int n1,n2;
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		n1 = scan.nextInt();

		System.out.print("Introduce un número: ");
		n2 = scan.nextInt();

		System.out.println("El mayor de "+n1+" y "+n2+" es "+maximo(n1,n2));
	}

}