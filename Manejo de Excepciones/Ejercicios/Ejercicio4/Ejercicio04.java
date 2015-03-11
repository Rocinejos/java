   import java.util.Scanner;
	
   public class Ejercicio04 {
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
					String mensaje = null;
					
					if (tipo.equals("CERO")) {
						//Acciones a hacer si es cero
						mensaje = " es NULO";
					}
					else if (tipo.equals("PAR")) {
						//Acciones a hacer si el tipo es par
						mensaje = " es divisible por dos";
					}
					else if (tipo.equals("IMPAR")) {
						//Acciones a hacer si el tipo es impar
						mensaje = " NO es divisible por dos";
					}
					
               System.out.println("El número "+ n + mensaje );
            }
      
      }
   
   }
	
   class NumeroException extends Exception {
      public NumeroException(String s) {
         super(s);
      }
   }