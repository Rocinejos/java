   import java.util.*;

   public class Ejercicio38 {
      public static void main(String[] args) {
      
         Scanner scan = new Scanner(System.in);
      
         System.out.print("Introduce altura de cada monta�a: ");
         int a = scan.nextInt();
      
         System.out.print("Introduce n�mero de monta�as: ");
         int m = scan.nextInt();
      
         for (int k=1;k<=m;k++) { //Dibujo de todas las monta�as
         
            for (int i=1; i<=a; i++) { //Dibujo SUBIDA de una monta�a
               for (int j=1; j<=i ; j++) {
                  System.out.print("*");
               }
               System.out.println();
            }
         
            for (int i=a-1; i>=1; i--) { //Dibujo de BAJADA de una monta�a
               for (int j=1; j<=i ; j++) {
                  System.out.print("*");
               }
               System.out.println();
            }
				
				a *= 2;
         
         }
      }
   }