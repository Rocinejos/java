import java.util.*;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Díme tu nombre: ");
		String nombre = scan.next();
		
		System.out.print("Díme tu edad: ");
		int edad = scan.nextInt();
		
		/*
		String estado;
		estado = (edad>=18) ? "mayor" : "menor" ;
		*/
		System.out.println(nombre + ", eres " + ((edad>=18) ? "mayor" : "menor") + " de edad");
	}
}