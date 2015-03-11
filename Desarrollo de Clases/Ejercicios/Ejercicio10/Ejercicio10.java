   import java.util.*;

   class Letras {
      private String cadena;
		
      public Letras(String cadena) {this.cadena=cadena;}

      public void setCadena(String cadena) {this.cadena=cadena;}

      public void p(String cadena) {
         System.out.print(this.cadena + "a" + cadena);
      }

      public static void q() {
         System.out.print(" es ");
      }
   }

   public class Ejercicio10 {
      public static void main(String[] args) {
			//Carlos es inaudito
			Letras letras;
			// Opción 1
			letras = new Letras("C");
			letras.p("rlos es inaudito");
			
			// Opción 2
			System.out.println();
			letras = new Letras("Carlos es in");
			letras.p("udito");
			
			//Opción 3
			System.out.println();
			letras = new Letras("C");
			letras.p("rlos");
			letras.q();
			letras.setCadena("in");
			letras.p("udito");
      }
   }