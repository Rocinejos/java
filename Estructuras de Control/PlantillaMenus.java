   import java.util.*;

   public class PlantillaMenus {
   
      public static String mostrarMenu() {
         Scanner scan = new Scanner(System.in);
         boolean opcionInvalida = false;   
         boolean terminar = false;
         String opcion = null;
      
         do {
         
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if (opcionInvalida) {
            }
         
         
            System.out.println("1.Opci�n primera");
            System.out.println("2.Opci�n segunda");
            System.out.println("3.Opci�n tercera");
         
            System.out.println("\nS.SALIR\n\n");
         
         
         
            System.out.print("Escoge una opci�n: ");
            opcion = scan.next();
            switch (opcion) {
               case "1":;
               case "2":;
               case "3":;
               case "S":terminar = true;
                  break;
               default: opcionInvalida = true;
            }
         }
         while (!terminar);
      	
         return opcion;
      }
   
      public static void esperarTecla() {
         System.out.println("Pulsa una tecla y RETURN para continuar");
         Scanner scan = new Scanner(System.in);
         scan.next();			
      }
   			
      public static void acciones1() {
         System.out.println("Acciones de la opci�n 1");
         esperarTecla();
      }
   
      public static void acciones2() {
         System.out.println("Acciones de la opci�n 2");
         esperarTecla();
      }
   
      public static void acciones3() {
         System.out.println("Acciones de la opci�n 3");
         esperarTecla();
      }
   
      public static void main(String[] args) {
         boolean terminar = false;
      	
         while (!terminar) {
            switch (mostrarMenu()) {
               case "1":acciones1();
                  break;
               case "2":acciones2();
                  break;
               case "3":acciones3();
                  break;
            
               case "S":terminar = true;
                  break;
            }  
           
         }
      }
   }