   import java.util.*;

   public class Ejercicio40 {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
      
         System.out.print("Introduce n: ");
         int n = scan.nextInt();
      
      //Variaciones con repetición de n elementos tomandos de 3 en 3
         for (int c=0; c<n ; c++) {
            for (int d=0; d<n ; d++) {
               for (int u=0; u<n ; u++) {
						System.out.println(c+""+d+""+u);
               }
            }
         }
      }
   }