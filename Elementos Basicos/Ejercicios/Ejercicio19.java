import java.util.*;

public class Ejercicio19 {

	public static float areaCirculo(float radio) {
		final float PI = 3.141592f;
		return ( PI * radio * radio);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el radio: ");
		float r;
		r = scan.nextFloat();
		
		System.out.println("El área de un círculo de radio "+
			r +
			" vale "+ 
			(areaCirculo(r)) 
		);
	}

}