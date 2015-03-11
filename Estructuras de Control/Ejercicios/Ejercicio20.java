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
		
		System.out.print("Introduce un n�mero: ");
		int numero = scan.nextInt();
		
		//System.out.println(numero+"/"+reves(numero)); //DEBUG
		
		/*
		if (numero == reves(numero) ) {
			System.out.print("El n�mero es capic�a");
		}
		else {
			System.out.print("El n�mero NO es capic�a");
		}
		*/
		
		System.out.println("El n�mero"+( (numero==reves(numero))?" ":" NO ")+"es capic�a");
	}
}