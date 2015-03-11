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
         System.out.println("Hola, soy  "+this.nombre);
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
            else if (this.dni < ((Humano)otro).getDni()) {
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
   public class Ejercicio {
      public static void rellenar(String[] args, Map<Integer,Humano> m) throws Exception {
         for (int i=0;i<args.length ;i+=3) {
            switch (args[i]) {
               case "H":
                  Humano h = new Humano(Integer.parseInt(args[i+1]),args[i+2]);
                  m.put(new Integer(Integer.parseInt(args[i+1])) , h );
                  break;
               default: throw new Exception("Clase no soportada");
            
            }
         }
      
      }
   
      public static String nombre(Map<Integer,Humano> m, int dni) {
         String sol = "NO EXISTE";
         Humano h = m.get(new Integer(dni));
         if (h != null) {
            sol = h.getNombre();
         }
         return sol;
      }
   	
      public static void main(String[] args) throws Exception {
         Map<Integer,Humano> m = new HashMap<Integer,Humano>();
         rellenar(args,m);
         System.out.println(m);
      
         Scanner in = new Scanner(System.in);
         System.out.print("Introduce dni: ");
         int dniABuscar = in.nextInt();
      	
         System.out.println("Nombre: "+ nombre(m,dniABuscar));
      
      	//containsKey			
         System.out.println("containsKey 1?: "+ m.containsKey(new Integer(dniABuscar)));
      	
      	//containsValue			
         System.out.println("containsVlaue Alberto?: "+ m.containsValue(new Humano(1,"Alberto")));
      	
      	//keySet			
         System.out.println("keySet: "+ m.keySet());
      	
      	//values			
         System.out.println("values: "+ m.values());
      	
      	//remove
         System.out.println("remove: "+ m.remove(new Integer(dniABuscar)));
         System.out.println(m);
      	
      	
      
      }
   }