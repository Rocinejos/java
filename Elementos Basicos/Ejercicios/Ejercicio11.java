   public class Ejercicio11 {
   
      public static void saludar(String mensaje) {
         System.out.println(mensaje);
      }
   
      public static void main(String[] args) {
         String x="Pepe";
         saludar("hola qu� tal!");
         saludar("Adi�s, muy buenas");
         saludar("Hola "+"soy "+x);
      }
   }