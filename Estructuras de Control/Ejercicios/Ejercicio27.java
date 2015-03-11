   import java.util.*;

   public class Ejercicio27 {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Introduce n: ");
         int n;
         n = scan.nextInt();
      
         if (n==1) {
            System.out.print("(1)0");
         }
         else if (n==2) {
            System.out.print("(1)0 (2)1 ");
         }
         else {
            System.out.print("(1)0 (2)1 ");
            int ant = 0;
            int act = 1;
         
            for (int i=3;i<=n;i++) {
               int aux = ant;
               ant = act;
               act = aux + act;
               System.out.print("("+i+")"+act+" ");
            }
         }
      
      }
   }