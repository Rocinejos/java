   import java.util.*;

   class Burbuja {
      private static char[] copiar(char[] a) {
         char[] b = new char[a.length];
         for (int i=0;i<b.length;i++) {
            b[i] = a[i];
         }
         return b;
      }
   
      private static void swap(char[] a, int ini, int fin) {
         char aux;
         aux = a[ini];
         a[ini] = a[fin];
         a[fin] = aux;
      }
   
      public static char[] ordenar(char[] original) {
         char[] v = copiar(original);
         for (int i=v.length-1;i>=1;i--) {
            for (int j=0;j<=i-1;j++) {
               if (v[j]>v[j+1]) {
                  swap(v,j,j+1);
               }
            }
         }
         return v;
      }
   	
   }
	
   public class Ejercicio {
      public static String ordenar(String s) {
         return aString(Burbuja.ordenar(transformar(s)));
      			
      }
   	
      private static char[] transformar(String s)  {
         int tam = s.length();
         char[] sol = new char[tam];
         for (int i=0;i<tam; i++) {
            sol[i] = s.charAt(i);
         }
         return sol;
      }
   	
      private static String aString(char[] a) {
         String sol = "";
         for (int i=0;i<a.length;i++) {
            sol += a[i];
         }
         return sol;
      }
   
      public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
      
         int nCasos = s.nextInt();  
         //String[] a = new String[nCasos];
      	
         for (int i=0;i<nCasos;i++) {
				System.out.println(ordenar(s.next()));
            //a[i] = s.next();
         }
      	
			/*
         for (int i=0;i<nCasos;i++) {
            System.out.println(ordenar(a[i]));
         }
			*/
      }	
   		
   }