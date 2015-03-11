   public class Ejercicio11 {
   
      public static void saludar(String mensaje) {
         System.out.println(mensaje);
      }
   
      public static void main(String[] args) {
         String x="Pepe";
         saludar("hola qué tal!");
         saludar("Adiós, muy buenas");
         saludar("Hola "+"soy "+x);
      }
   }