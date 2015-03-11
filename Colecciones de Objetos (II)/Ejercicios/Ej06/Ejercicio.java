   import java.util.*;

//========================
   class Humano implements Comparable {
      private int dni;
      private String nombre;
      public Humano(int dni, String nombre) {
         this.dni = dni;
         this.nombre = nombre;
      }
      public int getDni() {
         return this.dni;
      }
      public String getNombre() {
         return this.nombre;
      }
      public void saludar() {
         System.out.println("Hola");
      }
      public String toString() {
         return "(H)"+this.dni+" "+this.nombre;
      }
      public boolean equals(Object otro) {
         boolean sol = false;
         if (otro instanceof Humano && (this.dni == ((Humano)otro).getDni())) {
            sol = true;	
         }
         return sol;
      }
   	
      public int compareTo(Object otro) {
         int sol = 1;
         if (otro instanceof Humano) {
            if (this.dni == ((Humano)otro).getDni()) {
               sol = 0;
            }
            else if(this.dni > ((Humano)otro).getDni()) {
               sol = -1;
            }
         }
         return sol;
      }
   
      public int hashCode() {
         return this.dni;
      }
   }
//========================
   class Perro {
      private int collar;
      private float peso;
      public Perro(int collar, float peso) {
         this.collar = collar;
         this.peso = peso;
      }
      public int getCollar() {
         return this.collar;
      }
      public float getPeso() {
         return this.peso;
      }
      public void saludar() {
         System.out.println("Guau");
      }
      public String toString() {
         return "(P)"+this.collar+" "+this.peso;
      }
      public boolean equals(Object otro) {
         boolean sol = false;
         if (otro instanceof Perro && (this.collar == ((Perro)otro).getCollar())) {
            sol = true;	
         }
         return sol;
      }
      public int compareTo(Object otro) {
         int sol = 1;
      	
         if (otro instanceof Humano) {
            sol = -1;
         }
         else if (otro instanceof Perro) {
            if (this.collar == ((Perro)otro).getCollar()) {
               sol = 0;
            }
            else if(this.collar > ((Perro)otro).getCollar()) {
               sol = -1;
            }
         }
         return sol;
      }
      public int hashCode() {
         return this.collar;
      }
   	
   }

//========================
   class Gato {
      private String nombre;
      private float peso;
   
      public Gato(String nombre, float peso) {
         this.nombre = nombre;
         this.peso = peso;
      }
      public String getNombre() {
         return this.nombre;
      }
      public float getPeso() {
         return this.peso;
      }
      public void saludar() {
         System.out.println("MIAAU");
      }
      public String toString() {
         return "(G)"+this.nombre+" "+this.peso;
      }
      public boolean equals(Object otro) {
         boolean sol = false;
         if (otro instanceof Gato && 
         	(this.peso == ((Gato)otro).getPeso()) &&
         	(this.nombre.equals(((Gato)otro).getNombre()))
         	) {
            sol = true;	
         }
         return sol;
      }
   
      public int compareTo(Object otro) {
         int sol = -1;
         if (otro instanceof Gato) {
            if (this.nombre.equals(((Gato)otro).getNombre())) {
               if (this.peso == ((Gato)otro).getPeso()) {
                  sol = 0;
               }
               else if (this.peso > ((Gato)otro).getPeso()) {
                  sol = 1;
               }
            }
            else if (this.nombre.compareTo( ((Gato)otro).getNombre() )>0) {
               sol = 1;
            } 
         }
         return sol;
      }
   
      public int hashCode() {
         return (int)(this.peso);
      }
   }
//========================
   public class Ejercicio {
      public static void main(String[] args) {
			Collection c = new ArrayList();
         for (int i=0;i<args.length ;i+=3) {
            switch (args[i]) {
               case "H":
                  Humano h = new Humano(Integer.parseInt(args[i+1]),args[i+2]);
						c.add(h);
                  break;
               case "G":;
                  Gato g = new Gato(args[i+1],Float.parseFloat(args[i+2]));
						c.add(g);
                  break;
               case "P":;
                  Perro p = new Perro(Integer.parseInt(args[i+1]),Float.parseFloat(args[i+2]));
						c.add(p);
                  break;
            }
         }
			System.out.println(c);
      }
   }