   import java.util.*;  
   public class Ejercicio11 {
      public static void main(String[] args) {
         int i; //Declaración de variable de control (contador)
         int numero;
      
         Scanner scan = new Scanner(System.in);
			System.out.print("introduce un número: ");
         numero = scan.nextInt();
      	
			/*
         i = 1; //INICIALIZACIÓN de la variable de control
      
         while (i<=10) { //CONDICIÓN booleana de permanencia en el bucle (dependiente de la variable de control)
            System.out.println(numero+"x"+i+"="+(numero*i)); //Sentencias "útiles" internas al bucle
         
            i = i+1; //ACTUALIZACIÓN de la variable de CONTROL
         }
			*/
			for (i = 1; i<=10; i++) {
            System.out.println(numero+"x"+i+"="+(numero*i)); //Sentencias "útiles" internas al bucle
			}
      }
   }