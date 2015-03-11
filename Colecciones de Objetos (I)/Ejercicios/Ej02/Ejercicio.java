   import java.util.*;

   public class Ejercicio {
      private static int maximo(int[] v, int tam) {
         int sol;
      	
         if (tam>0) {
            sol = v[0];
         }
         else {
            sol = 0;
         }
      	
         for (int i=1; i<tam; i++) {
            if (v[i] > sol) {
               sol = v[i];
            }
         }
      	
         return sol;
      }
   	
      private static int minimo(int[] v, int tam) {
         int sol;
      	
         if (tam>0) {
            sol = v[0];
         }
         else {
            sol = 0;
         }
      	
         for (int i=1; i<tam; i++) {
            if (v[i] < sol) {
               sol = v[i];
            }
         }
      	
         return sol;
      }
   	
      private static float media(int[] v, int tam) {
			float acc = 0;
      	
         for (int i=0; i<tam; i++) {
				acc += v[i];
         }
      	
         return (acc/tam);
      }
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
      	
         int max = maximo(a,n);
         int min = minimo(a,n);
			float med = media(a,n);
      	
         for (int i=0; i<n; i++) {
				if (a[i]!=max && a[i] != min) {
	            System.out.print(a[i]+(i==n-1?"":","));
				}
         }
      	
         System.out.println("\nMEDIA: "+med);
      				
      }
   }