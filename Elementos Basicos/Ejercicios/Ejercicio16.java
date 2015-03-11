   public class Ejercicio16 {
      public static boolean esPar (int numero) {
      /*
      int resto;
      resto = numero%2;
      
      boolean esParElNumero;
      esParElNumero = ( resto == 0 ? true : false );
      
      return esParElNumero;
      */
      
         return ( (numero%2) == 0);
      }
   
      public static void main(String[] args) {
         System.out.println(esPar(2));
         System.out.println(esPar(1));
         System.out.println(esPar(1898));
         System.out.println(esPar(-1111));
      }
   }