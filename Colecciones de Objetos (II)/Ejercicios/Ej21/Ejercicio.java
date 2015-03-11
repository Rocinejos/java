   import java.util.*;

   public class Ejercicio {
      public static void main(String[] args) {
         Collection<Integer> c = new LinkedList<Integer>();
			
			//RELLENO			
         for (int i=0;i<args.length;i++) {
            int elemAAnadir = Integer.parseInt(args[i]);
            c.add(elemAAnadir);
         }
			
			//Muestro desordenada
         System.out.println("DESORDENADA\n"+c);
         boolean estaElSeis = false;
			
			//Muestro ordenada
			Collections.sort((List)c);
         System.out.println("ORDENADA\n"+c);
			
      	
      }
   }