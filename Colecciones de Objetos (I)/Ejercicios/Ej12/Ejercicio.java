   import java.util.*;

   public class Ejercicio {
      private static int[] copiar(int[] a) {
         int[] b = new int[a.length];
         for (int i=0;i<b.length;i++) {
            b[i] = a[i];
         }
         return b;
      }
   
      private static void swap(int[] a, int ini, int fin) {
         int aux;
         aux = a[ini];
         a[ini] = a[fin];
         a[fin] = aux;
      }
   
      public static int[] burbuja(int[] original) {
         int[] v = copiar(original);
         for (int i=v.length-1;i>=1;i--) {
            for (int j=0;j<=i-1;j++) {
               if (v[j]>v[j+1]) {
                  swap(v,j,j+1);
               }
            }
         }
         return v;
      }
   
      public static void main(String[] args) {
         int[] desordenado = new int[args.length];
			for (int i=0;i<args.length;i++) {
				desordenado[i] = Integer.parseInt(args[i]);
			}
						
         System.out.println(Arrays.toString(desordenado));
			int[] ordenado = burbuja(desordenado);
         System.out.println(Arrays.toString(ordenado));
      }
   }