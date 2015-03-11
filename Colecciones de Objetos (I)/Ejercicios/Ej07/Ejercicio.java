   import java.util.*;

   public class Ejercicio {
      public static void examinar(String[] args) throws ParametroException {
         if (args.length<2) {
            throw new ParametroException();
         }
      }
   	
      public static void main(String[] args) {
      	
         try {
            examinar(args);
            int n = Integer.parseInt(args[0]);
         
            for (int i=1;i<args.length;i+=n) {
               System.out.println("("+i+")"+args[i]);
            }
         }
            catch (ParametroException e) {
               System.out.println("Usage: java Ejercicio <salto> <elem1> [<elem2> .... <elemN>]");
            }
      }
   }
	
   class ParametroException extends Exception {
   }