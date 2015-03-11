   public class Ejercicio02 {
      public static void main(String[] args) {
         Bomba b=new Bomba();
         try {
            b.f();
            b.g();
            System.out.println("Hola");         
         }
            catch (E1 e) {
               System.out.println(e.getMessage());
            }
            catch (E2 e) {
               System.out.println(e);
            }
      }
   }

   class Bomba  {
      public void f() throws E1 {
         int x=30;
         if (x>30) {
            System.out.println("Hola amigos");
            throw (new E1());
         }
      }
      public void g() throws E2 {
         throw (new E2());
      }
   	
   }
	
   class E1 extends Exception {
   }

   class E2 extends Exception {
		public String getMessage() {
			return "Hola amigos";
		}
   }
