   import java.util.Scanner;
	
   public class Ejercicio05 {
      public static void examinar(int x) throws CeroException, ParException, ImparException {
         if (x == 0) {
            throw new CeroException();
         }
         else {
            if (x%2 == 0) {
               throw new ParException();
            }
            else {
               throw new ImparException();
            }
         }
      
      }
   		
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Introduce n: ");
         int n = scan.nextInt();
         try {
            examinar(n);
         }
            catch (CeroException e) {
               System.out.println("El número "+ n + " nulo" );
            }
            catch (ParException e) {
               System.out.println("El número "+ n + " par" );
            }
            catch (ImparException e) {
               System.out.println("El número "+ n + " impar" );
            }
      
      }
   
   }
	
   class ParException extends Exception {
   }
   class ImparException extends Exception {
   }
   class CeroException extends Exception {
   }
