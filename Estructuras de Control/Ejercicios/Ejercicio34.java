   public class Ejercicio34 {
      public static void main(String[] args) {
      
         System.out.println("----------------");
         System.out.println("a (for)");
      
         for (int j=10;(j<20 || j%3==0);j*=2) {
            int k=j/4;
            System.out.println(k);
         }
      
         System.out.println("----------------");
         System.out.println("a (while)");
      
         int j=10;
      	
         while (j<20 || j%3==0) {
            int k=j/4;
            System.out.println(k);
         
            j*=2;
         }
      	
      
      }
   }