import java.util.*;

public class Ejercicio26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int x = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int y = scan.nextInt();
		
		if (x<y) {
			//Intercambiar x por y
			int aux;
			aux = x;
			x = y;
			y = aux;
		}
		
		while (y!=0) {
			//System.out.println("x: "+x+"/y: "+y); //DEBUG
			int aux;
			aux = x % y;
			x = y;
			y = aux;
		}
		
		System.out.println("El m.c.d. es "+x);
	}
}