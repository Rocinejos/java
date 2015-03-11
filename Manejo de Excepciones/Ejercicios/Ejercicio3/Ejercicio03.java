   import java.util.Scanner;
	
   public class Ejercicio03 {
      public static void examinar(int x) throws NumeroException {
         String tipo = (x==0?"CERO":(x%2==0?"PAR":"IMPAR"));
         throw new NumeroException(tipo);
      }
   		
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Introduce n: ");
         int n = scan.nextInt();
         try {
            examinar(n);
         }
            catch (NumeroException e) {
               String tipo = e.getMessage();
               System.out.println("El número "+ n + " es " + tipo );
            }
      
      }
   
   }
	
   class NumeroException extends Exception {
      public NumeroException(String s) {
         super(s);
      }
   }