   class ArgsException extends Exception {
   }

   class Persona {
      private String nombre;
      private String apellido;
      public Persona (String nombre, String apellido) {
         this.nombre = nombre;
         this.apellido = apellido;
      }
      public void saludar() {
         System.out.println("Hola, soy "+this.nombre+" "+this.apellido);
      }
   }
   public class Ejercicio {
      public static void main(String[] args) {
         try {
            if (args.length == 0 || Integer.parseInt(args[0])*2 != args.length-1) {
               throw new ArgsException();
            }
         	
				int numPersonas = Integer.parseInt(args[0]);
            Persona[] personas = new Persona[numPersonas];
				
            for (int i=0;i<numPersonas;i++) {
               personas[i] = new Persona(args[2*i+1],args[2*i+2]);
					//System.out.println(i+"//"); //DEBUG
					//personas[i-1].saludar(); //DEBUG
            }
				
				for (int i=0; i<numPersonas; i++) {
					personas[i].saludar();
				}
         
         }
            catch (ArgsException e) {
               System.out.println("Usage: java Ejercicio <numP> <nom1> <ape1> [<nom2> <ape2> .... <nomN> <apeN>]");
            }
				catch (NumberFormatException e) {
					System.out.println("El primer dato ha de ser el número de personas a procesar");
               System.out.println("Usage: java Ejercicio <numP> <nom1> <ape1> [<nom2> <ape2> .... <nomN> <apeN>]");
				}
      
      }
   }