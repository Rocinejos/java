import java.util.*;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Díme un número: ");
		int tablaLimite = scan.nextInt();
		
		for (int i=1;i<=tablaLimite;i++) {
			for (int j=1;j<=10;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			if (i!=tablaLimite) {
				System.out.println("--------------");
			}
		}
	}
}