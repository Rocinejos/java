   import java.util.*;

   public class Ejercicio03 {
      public static void main(String[] args) {
      
         Scanner scan = new Scanner(System.in);
         System.out.print("Introduce un número: ");
         int numero = scan.nextInt();		
      /*
      if (numero == 1) {
      	System.out.print("UNO");
      }
      else if (numero==2) {
      	System.out.print("DOS");
      } 
      else if (numero==3) {
      	System.out.print("TRES");
      } 
      else {
      	System.out.print("NO SÉ");
      }
      */
         switch (numero) {
            case 1:
               System.out.print("UNO");
               break;
            case 2:
               System.out.print("DOS");
               break;
            case 3:
               System.out.print("TRES");
               break;
            case 5:
               System.out.print("CINCO");
               break;
         }
      
      }
   }