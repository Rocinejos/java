   import java.util.*;

   public class Ejercicio {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int[] a = new int[30];
         int n = 0;
      
			int num = 0;
         do {
            System.out.print("Introduce n: ");
            num = scan.nextInt();
            if (num != 0) {
               a[n] = num;
               n++;
            }
         }
         while (num != 0 && n<30);
      	
         for (int i=0; i<n; i++) {
            System.out.print(a[i]+(i==n-1?"":","));
         }
      				
      }
   }