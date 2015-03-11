   import java.util.*;

   public class Ejercicio {
      public static void main(String[] args) {
         int[] a = {1,2,3,4,5,6,7,8,9,10};
         Scanner scan = new Scanner(System.in);
      	//int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
      	
         System.out.print("Introduce n: ");
         int n = scan.nextInt();
         for (int i=0;i<a.length;i+=n) {
            System.out.println("("+i+")"+a[i]);
         }
      }
   }