   import java.util.*;

   public class Ejercicio33 {
      public static void main(String[] args) {
         int i;
         int j;
         boolean amor;
      
      	//-----------------------------------------------------
         System.out.println("\na (while)");
         System.out.println("---------");
      
         i=10;
         while (i>0) {
            System.out.println(i);
            i=i-2;
         }
      
      	//-----------------------------------------------------
         System.out.println("\na (for)");
         System.out.println("---------");
      	
         for (i=10; i>0; i-=2) {
            System.out.println(i);
         }
      	
      
      	//-----------------------------------------------------
         System.out.println("\nb (while)");
         System.out.println("---------");
      	
         i = 10;
         j = 20;
      	
         while (j>i) {
            int k=i+1;
            i=i*2;
            System.out.println(i+","+j+","+k);
            j=j-1;
         }
      	
      	//-----------------------------------------------------
         System.out.println("\nb (for)");
         System.out.println("---------");
      	
         i = 10;
         for (j = 20; j>i ; j-- ) {
            int k=i+1;
            i=i*2;
            System.out.println(i+","+j+","+k);
         }
      	
      	//-----------------------------------------------------
         System.out.println("\nc (while)");
         System.out.println("---------");

			amor = true;
         i=1;
			
         while (amor || i<=4) {
            if (amor) {
               System.out.println("Me quiere");
            }
            else {
               System.out.println("NO Me quiere");
            }
            amor = ! amor;
            i++;
         }

      	//-----------------------------------------------------
         System.out.println("\nc (for)");
         System.out.println("---------");

			for ( amor=true,i=1 ; (amor || i<=4) ; amor=!amor,i++ ) {
				if (amor) {
               System.out.println("Me quiere");
            }
            else {
               System.out.println("NO Me quiere");
            }
			}      
      }
   }