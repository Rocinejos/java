import java.util.*;
public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero1;
		numero1 = scan.nextInt();

		System.out.println("Introduce otro número: ");
		int numero2;
		numero2 = scan.nextInt();
		
		/*
		System.out.print("La suma de ");
		System.out.print(numero1);
		System.out.print(" y ");
		System.out.print(numero2);
		System.out.print(" vale ");
		
		int suma;
		suma = numero1 + numero2;

		System.out.print(suma);
		*/

		System.out.println("La suma de "+numero1+" y "+numero2+" vale "+ (numero1+numero2) );

	}
}