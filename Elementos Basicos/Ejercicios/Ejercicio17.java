import java.util.*;
   public class Ejercicio17 {
	
      public static boolean esPar (int numero) {
         return ( (numero%2) == 0);
      }
   
      public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Introduce un n�mero: ");
			int numero = scan.nextInt();
			
			System.out.println("El n�mero "+numero+" es "+ ( esPar(numero) ?"par" : "impar" ) );
			
      }
   }