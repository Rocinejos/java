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
   
      public int compareTo(Object otro) {
         return compararPorDniAsc(otro);
      }
   
   }