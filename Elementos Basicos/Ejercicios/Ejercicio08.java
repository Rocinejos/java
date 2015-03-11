   import java.util.*;

   public class Ejercicio08 {
   
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
      
         System.out.print("Dame un número: ");
      
         int numero1;
         numero1 = scan.nextInt();
      
         System.out.print("Dame otro número: ");
      
         int numero2;
         numero2 = scan.nextInt();
      
         int mayor;
         mayor = ((numero1>numero2) ? (numero1) : (numero2)) ;
      
         System.out.println("El mayor de "+numero1+" y "+numero2+" es "+mayor);
      }
   
   }