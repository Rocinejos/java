import java.util.*;

public class Ejercicio01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int edad = scan.nextInt();

		final int MI_EDAD = 40;
		
		if (edad<MI_EDAD) {
			System.out.println("Demasiado joven");
		}
		else if (edad == MI_EDAD) {
			System.out.println("Buena edad");
		}
		else {
			System.out.println("Viejales");
		}
				
	}
}