   import java.util.*;

   public class Ejercicio29 {
      public static long factorial(long n) {
         long acc = 1;
      //for (long i = n; i>=2; i--) {
         for (long i = 2; i<=n; i++) {
         //System.out.println(i+" "+acc); //DEBUG
            acc = acc * i;
         }
         return acc;
      }
   
      public static long combinaciones(long n, long k) {
         return ( factorial(n) / ( factorial(k) * factorial(n-k) ) );
      }
   
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
      
         System.out.print("Introduce n: ");
         long n;
         n = scan.nextLong();
      
         System.out.print("Introduce k: ");
         long k;
         k = scan.nextLong();
      
         System.out.println("("+n+","+k+")="+combinaciones(n,k) );
      
      }
   }