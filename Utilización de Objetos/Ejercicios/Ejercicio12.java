   import java.util.Random;
	import java.util.Scanner;

   public class Ejercicio12 {
		public static Random r;
		
		public static int azar(int nCaras) {
			return r.nextInt(nCaras)+1;
		}
  
      public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.print("Introduce número de caras: ");
			int nCaras = scan.nextInt();

			System.out.print("Introduce número de tiradas: ");
			int nTiradas = scan.nextInt();

         r = new Random();

			for (int i=0;i<nTiradas;i++) {
	         System.out.print(azar(nCaras)+" ");
      	}
      }
   }