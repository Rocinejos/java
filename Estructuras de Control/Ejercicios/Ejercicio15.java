   import java.util.*;

   public class Ejercicio15 {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
      
			int anterior;
         int actual;

         System.out.print("Introduce un número: ");
         actual = scan.nextInt();	
      
			do 
         {
				anterior = actual;
            System.out.print("Introduce un número: ");
            actual = scan.nextInt();	
         }
			while (actual > anterior);

         System.out.print("FIN");
      
      }
   }