   import java.util.*;

   public class Ejercicio02 {
      public static void main (String[] args) {
         System.out.print("Dime tu nombre: ");
         Scanner scan = new Scanner(System.in);
         String nombre;
         nombre = scan.next();
         System.out.println("Hola "+nombre);
      }
   }