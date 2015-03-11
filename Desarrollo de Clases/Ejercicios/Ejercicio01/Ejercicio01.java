   import java.util.*;

   class Persona {
   
      String nombre;
      int numeroDeLaSuerte;
      
      public void saludar() {
         System.out.println("Hola soy "+this.nombre+" y mi número de la suerte es el "+this.numeroDeLaSuerte);
      }
	
		public int calcularNumeroDeLaSuerte() {
			Random r = new Random();
			return (r.nextInt(10)+1);
		}
			
		public Persona() {
			this.nombre="Anónimo";
			this.numeroDeLaSuerte = this.calcularNumeroDeLaSuerte();
		}
		     		
		public Persona(String nombre) {
			this.nombre = nombre;
			this.numeroDeLaSuerte = calcularNumeroDeLaSuerte();
		}

		public Persona(int numeroDeLaSuerte) {
			this.nombre = "Anónimo";
			this.numeroDeLaSuerte = numeroDeLaSuerte;
		}

		public Persona(String nombre, int numeroDeLaSuerte) {
			this.nombre = nombre;
			this.numeroDeLaSuerte = numeroDeLaSuerte;
		}
		
   }

   public class Ejercicio01 {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
      
         boolean terminar = false;
      
         while (!terminar) {
            System.out.print("Introduce un nombre: ");
            String nombreUsuario = scan.next();
      		
				Persona p;
				   
            switch (nombreUsuario) {
               case "s": 
						terminar = true; 
                  break;
               case ".": 
						p = new Persona();
						p.saludar();
						break;
					default:
						p = new Persona(nombreUsuario);
						p.saludar();
						break;
            }
         }
      }
   }