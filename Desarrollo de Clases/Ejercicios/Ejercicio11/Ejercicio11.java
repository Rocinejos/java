
   class Persona {
      private String nom;
      private String ape1;
      private String ape2;
		
      public Persona(String nom, String ape1, String ape2) {
         this.nom=nom;
         this.ape1=ape1;
         this.ape2=ape2;
      }
      public static void mostrarApellidos(Persona padre, Persona madre) {
         System.out.println(
            padre.ape1+" "+madre.ape1+" "+
            padre.ape2+" "+madre.ape2
            );
      }
   }

   public class Ejercicio11 {
      public static void main(String[] args) {
			//Pérez Manzano Santos Borreguero
			Persona p1 = new Persona("DaIgual","Pérez","Santos");
			Persona p2 = new Persona("TambiénDaIgual","Manzano","Borreguero");
			p2.mostrarApellidos(p1,p2);
      }
   }