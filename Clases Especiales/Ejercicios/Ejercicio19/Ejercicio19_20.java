   import java.util.Date;

   public class Ejercicio19_20 {
      public static void esperar() {
         Date d1 = new Date();
      
         for (int i=0;i<289000;i++) {
            for (int j=0; j<10000;j++) {}
         }
      
         Date d2 = new Date();
        // System.out.println(d2.getTime()-d1.getTime());
      }
   	
      public static void esperar(int s) {
         for (int i=0;i<s;i++) {
            esperar();
         }
      }
   
      public static void main(String[] args) {
         int s=0;
         int m=0;
         int h=0;
        	
         do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+m+":"+s);
            esperar();
            if (s <= 58) 
            {
               s = s+1;
            }
            else {
               s = 0;
               if (m <= 58) 
               {
                  m = m+1;
               }
               else {
                  m = 0;
                  h = h+1;
               }
            }
         }
         while (true);
      }
   }