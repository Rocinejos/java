   import java.util.Random;
	import java.util.Scanner;

   public class Ejercicio11 {
		public static final int NUM_CARAS = 4;
	
      public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.print("Introduce número de tiradas: ");
			int nTiradas = scan.nextInt();

         Random r;
         r = new Random();
			
			for (int i=0;i<nTiradas;i++) {
	         System.out.print((r.nextInt(NUM_CARAS)+1)+" ");
      	}
      }
   }