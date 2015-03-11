import java.util.Arrays;

   public class Ej05 {
      public static void main(String[] args) {
         int nPersonas = Integer.parseInt(args[0]);
      	
         int j = 1;
         Persona[] p = new Persona[nPersonas];
      	
      	//RELLENAR
         for (int i=0 ; i<nPersonas ; i++) {
            int dni = Integer.parseInt(args[j++]);
            String nombre = args[j++];
            String apellido = args[j++];
         	
            p[i] = new Persona(dni,nombre,apellido);
         }
      	
      	//MOSTRAR sin ORDENAR
         for (int i=0 ; i<nPersonas ; i++) {
            System.out.println(p[i]);
         }
      	
         System.out.println("-------------");
      	
      	//MOSTRAR ORDENADAS
         //Persona[] pOrd = Ordenamiento.burbuja(p);
        Arrays.sort(p);
			
         for (int i=0 ; i<nPersonas ; i++) {
            System.out.println(p[i]);
         }
      	
      }
   }