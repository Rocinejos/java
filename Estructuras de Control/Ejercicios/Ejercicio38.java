   import java.util.*;

   public class Ejercicio38 {
      public static void main(String[] args) {
      
         Scanner scan = new Scanner(System.in);
      
         System.out.print("Introduce altura de cada montaña: ");
         int a = scan.nextInt();
      
         System.out.print("Introduce número de montañas: ");
         int m = scan.nextInt();
      
         for (int k=1;k<=m;k++) { //Dibujo de todas las montañas
         
            for (int i=1; i<=a; i++) { //Dibujo SUBIDA de una montaña
               for (int j=1; j<=i ; j++) {
                  System.out.print("*");
               }
               System.out.println();
            }
         
            for (int i=a-1; i>=1; i--) { //Dibujo de BAJADA de una montaña
               for (int j=1; j<=i ; j++) {
                  System.out.print("*");
               }
               System.out.println();
            }
				
				a *= 2;
         
         }
      }
   }