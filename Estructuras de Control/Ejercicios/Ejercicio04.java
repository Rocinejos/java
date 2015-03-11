   import java.util.*;

   public class Ejercicio04 {
      public static void main(String[] args) {
      
         Scanner scan = new Scanner(System.in);
         System.out.print("Introduce una letra: ");
         String letra = scan.next();		

         switch (letra) {
            case "a":;
            case "e":;
            case "i":;
            case "o":;
            case "u":;
            case "A":;
            case "E":;
            case "I":;
            case "O":;
            case "U":;
               System.out.print("VOCAL");
               break;
				default:
               System.out.print("CONSONANTE");
               break;
					
         }
      
      }
   }