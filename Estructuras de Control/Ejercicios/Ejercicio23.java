import java.util.*;

public class Ejercicio23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un n�mero: ");
		int num;
		num = scan.nextInt();
		
		boolean esPrimo;
		esPrimo = true;
	
		//System.out.println("\n------------");
		for (int i=2; i<num && esPrimo; i++) {
			//System.out.print(i+", ");
			if (num%i==0) {
				esPrimo = false;
			}
		}
		
		System.out.println(
			"\nEl n�mero "+
			num+ 
			(esPrimo?"":" NO")+
			" es primo");
	}
}