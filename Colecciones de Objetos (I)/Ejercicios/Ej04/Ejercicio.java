   import java.util.*;

   public class Ejercicio {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
      
         String[] a = new String[30];
         int n = 0;
      
         String palabra = "";
      	
         do {
            System.out.print("Palabra "+(n+1)+":");
            palabra = scan.next();
            if (!palabra.equals("FIN")) {
               a[n] = palabra;
               n++;
            }
         }
         while (!palabra.equals("FIN") && n<30);
      
			System.out.print("\nPalabra secreta: ");
			for (int i=0;i<n;i++) {
				System.out.print(a[i].charAt(0));
			}
      }
   }