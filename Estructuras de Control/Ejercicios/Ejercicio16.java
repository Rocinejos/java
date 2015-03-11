   import java.util.*;

   public class Ejercicio16 {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
      
         int anterior;
         int actual;
      
         System.out.print("Introduce un número: ");
         actual = scan.nextInt();	
      
         if (actual!=0) {
            do 
            {
               anterior = actual;
               System.out.print("Introduce un número: ");
               actual = scan.nextInt();	
            }
            while (actual > anterior && actual!=0);
         }
      	
         System.out.print("FIN");
      
      }
   }