   import java.util.*;

   public class Ejercicio17 {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
      
         int anterior;
         int actual;
      
         System.out.print("Introduce un n�mero: ");
         actual = scan.nextInt();
         anterior = actual;
      
         if (actual!=0) {
            do 
            {
               if (actual>anterior) {
                  anterior = actual;
               }
               System.out.print("Introduce un n�mero mayor que el "+anterior+": ");
               actual = scan.nextInt();	
            }
            while (actual!=0);
         }
      	
         System.out.print("FIN");
      
      }
   }