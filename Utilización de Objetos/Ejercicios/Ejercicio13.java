	import java.util.Scanner;

   public class Ejercicio13 {
  
      public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Introduce n�mero de caras: ");
			int numCaras = scan.nextInt();

			System.out.print("Introduce n�mero de tiradas: ");
			int numTiradas = scan.nextInt();

			for (int i=0; i<numTiradas; i++) {
				int numeroAzar = (int)((Math.random()*numCaras)+4);
				System.out.print(numeroAzar+" ");
			}
      }
   }