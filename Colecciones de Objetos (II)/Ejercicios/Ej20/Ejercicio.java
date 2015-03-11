   import java.util.*;

   public class Ejercicio {
      public static void main(String[] args) {
         ArrayList<Integer> c = new ArrayList<Integer>();
         for (int i=0;i<args.length;i++) {
            int elemAAnadir = Integer.parseInt(args[i]);
            c.add(new Integer(elemAAnadir));
         }
         System.out.println(c);
         boolean estaElSeis = false;
      	
         for ( Integer i : c ) {
            if (i.intValue() == 6) {
               estaElSeis = true;
            }
         }
      	
         if (estaElSeis) {
            System.out.println("El 6 está");
         }
         else {
            System.out.println("El 6 NO está");
         }
      }
   }