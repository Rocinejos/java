import java.util.*;

public class Ejercicio18 {

	public static float areaRectangulo(float base, float altura) {
		return (base * altura);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce la base: ");
		float base;
		base = scan.nextFloat();
		
		System.out.print("Introduce la altura: ");
		float altura;
		altura = scan.nextFloat();
		
		System.out.println("El área vale "+ (areaRectangulo(base,altura)) );
	}

}