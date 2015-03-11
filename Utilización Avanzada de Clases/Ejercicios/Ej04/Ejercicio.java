   import java.util.*;

   public class Ejercicio {
      private static Persona[] copiar(Persona[] a) {
         Persona[] b = new Persona[a.length];
         for (int i=0;i<b.length;i++) {
            b[i] = a[i];
         }
         return b;
      }
   
      private static void swap(Persona[] a, int ini, int fin) {
         Persona aux;
         aux = a[ini];
         a[ini] = a[fin];
         a[fin] = aux;
      }
   
      public static Persona[] burbuja(Persona[] original) {
         Persona[] v = copiar(original);
         for (int i=v.length-1;i>=1;i--) {
            for (int j=0;j<=i-1;j++) {
               if (v[j].compareTo(v[j+1]) > 0 ) {
                  swap(v,j,j+1);
               }
            }
         }
         return v;
      }
   }