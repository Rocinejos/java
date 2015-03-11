   import java.util.*;

   public class Ejercicio28 {
      public static long factorial(long n) {
         long acc = 1;
      //for (long i = n; i>=2; i--) {
         for (long i = 2; i<=n; i++) {
         //System.out.println(i+" "+acc); //DEBUG
            acc = acc * i;
         }
         return acc;
      }
   
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Introduce n: ");
         long n;
         n = scan.nextLong();
         System.out.println(n+"! = "+factorial(n) );
      }
   }