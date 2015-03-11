import java.util.*;

public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce num. de HORAS: ");		
		int horas = scan.nextInt();
				
		System.out.print("Introduce num. de MINUTOS: ");		
		int minutos = scan.nextInt();

		System.out.print("Introduce num. de SEGUNDOS: ");		
		int segundos = scan.nextInt();
		
		// int totalSegundos = segundos + minutos*60 + horas*60*60;
		System.out.println("El número total de segundos es :"+(segundos + minutos*60 + horas*3600) );
	}
}