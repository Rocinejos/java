import java.util.*;

public class Ejercicio20 {
	public static int reves(int n) {
		int numeroAlReves=0;
		int num = n;
		
		do {
			numeroAlReves = numeroAlReves*10 + (num%10);
			num = num/10;
		}
		while (num != 0);
		
		return numeroAlReves;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int numero = scan.nextInt();
		
		//System.out.println(numero+"/"+reves(numero)); //DEBUG
		
		/*
		if (numero == reves(numero) ) {
			System.out.print("El número es capicúa");
		}
		else {
			System.out.print("El número NO es capicúa");
		}
		*/
		
		System.out.println("El número"+( (numero==reves(numero))?" ":" NO ")+"es capicúa");
	}
}