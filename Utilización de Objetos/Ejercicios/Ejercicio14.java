	import java.util.Scanner;

   public class Ejercicio14 {
  
      public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Introduce número de tiradas: ");
			int numTiradas = scan.nextInt();
			int numVeces1 = 0;
			int numVeces2 = 0;
			int numVeces3 = 0;
			int numVeces4 = 0;
			int numVeces5 = 0;
			int numVeces6 = 0;

			for (int i=0; i<numTiradas; i++) {
				int numeroAzar = (int)((Math.random()*6)+1);
				//System.out.print(numeroAzar+" ");
				switch (numeroAzar) {
					case 1: numVeces1++;break; 
					case 2: numVeces2++;break; 
					case 3: numVeces3++;break; 
					case 4: numVeces4++;break; 
					case 5: numVeces5++;break; 
					case 6: numVeces6++;break; 
				}
			}
			
			System.out.println("Ha salido el 1 el "+ ((double)numVeces1*100/numTiradas) +"% de las veces");
			System.out.println("Ha salido el 2 el "+ ((double)numVeces2*100/numTiradas) +"% de las veces");
			System.out.println("Ha salido el 3 el "+ ((double)numVeces3*100/numTiradas) +"% de las veces");
			System.out.println("Ha salido el 4 el "+ ((double)numVeces4*100/numTiradas) +"% de las veces");
			System.out.println("Ha salido el 5 el "+ ((double)numVeces5*100/numTiradas) +"% de las veces");
			System.out.println("Ha salido el 6 el "+ ((double)numVeces6*100/numTiradas) +"% de las veces");
      }
   }