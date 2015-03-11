   public class Persona implements Comparable {
      private int dni;
      private String nombre;
      private String apellido;
   	
      public Persona(int dni, String nombre, String apellido) {
         this.dni = dni;
         this.nombre = nombre;
         this.apellido = apellido;
      }
   	
      public String toString() {
         return "("+this.dni+")"+this.nombre+" "+this.apellido;
      }
   	
      public int getDni() {
         return this.dni;
      }
   
      public String getNombre() {
         return this.nombre;
      }
   	
      public String getApellido() {
         return this.apellido;
      }
   	
      private int compararPorDniAsc(Object otro) {
         int sol = 0;
         int miDni = this.dni;
         int otroDni = ((Persona)otro).getDni();
      	
         if (miDni > otroDni ) {
            sol = 1;
         }
         else if (miDni < otroDni) {
            sol = -1;
         }
      	
         return sol;
      }
   	
      private int compararPorApeNomAsc(Object otro) {
         int sol = 0;
         String miNombre = this.nombre;
         String miApellido = this.apellido;
      	
         String otroNombre = ((Persona)otro).getNombre();
         String otroApellido = ((Persona)otro).getApellido();
      	
         if (miApellido.compareToIgnoreCase(otroApellido) > 0) {
            sol = 1;
         }
         else if (miApellido.compareToIgnoreCase(otroApellido) < 0) {
            sol = -1;
         }
         else {
            if (miNombre.compareToIgnoreCase(otroNombre) > 0) {
               sol = 1;
            }
            else if (miNombre.compareToIgnoreCase(otroNombre) < 0) {
               sol = -1;
            }
         }
      
         return sol;
      }
   
   
      public int compareTo(Object otro) {
         return compararPorApeNomAsc(otro);
      }
   
   }