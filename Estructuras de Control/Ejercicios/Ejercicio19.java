   import java.util.*;

   public class Ejercicio19 {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
      
         System.out.print("Introduce un número: ");
         int numero = scan.nextInt();
      
         int nCifras = 0;
      
         do {
            nCifras = nCifras + 1;
            numero = numero / 10;
         }
         while (numero!=0); 
      
         System.out.println("Número de cifras: "+nCifras);
      }
   }