   import java.util.*;  
   public class Ejercicio11 {
      public static void main(String[] args) {
         int i; //Declaraci�n de variable de control (contador)
         int numero;
      
         Scanner scan = new Scanner(System.in);
			System.out.print("introduce un n�mero: ");
         numero = scan.nextInt();
      	
			/*
         i = 1; //INICIALIZACI�N de la variable de control
      
         while (i<=10) { //CONDICI�N booleana de permanencia en el bucle (dependiente de la variable de control)
            System.out.println(numero+"x"+i+"="+(numero*i)); //Sentencias "�tiles" internas al bucle
         
            i = i+1; //ACTUALIZACI�N de la variable de CONTROL
         }
			*/
			for (i = 1; i<=10; i++) {
            System.out.println(numero+"x"+i+"="+(numero*i)); //Sentencias "�tiles" internas al bucle
			}
      }
   }