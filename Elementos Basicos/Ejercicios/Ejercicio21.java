   import java.util.*;

   public class Ejercicio21 {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Introduce total segundos: ");
      
         int totalSegundos = scan.nextInt();
      
         System.out.print("Horas: "+ (totalSegundos/3600));
			int restoMinutos = totalSegundos%3600;
         System.out.print(", minutos: "+ (restoMinutos/60) );
         System.out.print(", segundos: "+ (restoMinutos%60) );
      	
      }
   }