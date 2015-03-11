import java.util.*;

public class Ejercicio03 {
	public static void main(String[] args) {

		System.out.print("Dime tu nombre: ");
		String nombre;
		Scanner scan = new Scanner(System.in);
		nombre = scan.next();		

		System.out.print("Dime tu apellido: ");
		String apellido;
		apellido = scan.next();
		
		System.out.println("Hola "+nombre+" "+apellido);
		System.out.println("Hola "+apellido+", "+nombre);
	}
}