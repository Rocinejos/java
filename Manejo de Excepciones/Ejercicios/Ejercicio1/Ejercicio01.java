   public class Ejercicio01 {
      public static void main(String[] args) {
         Bomba b=new Bomba();
         try {
            System.out.println("Inicio bloque");
            // AQUÍ IRÍA EL CÓDIGO DEL EJERCICIO
				//b.a();
				//b.b();
				//b.c1();
				b.c2();

            System.out.println("Fin bloque");
         }
            catch (Exception e) {
               System.out.println(e); //toString()
               System.out.println(e.getMessage());
            }
         System.out.println("Fin programa");
      }
   }

   class Bomba  {
      public void a() throws A {
         throw (new A());
      }
      public void b() throws B {
         throw (new B());
      }
      public void c1() throws C {
         throw (new C());
      }
      public void c2() throws C {
         int n=10;
         if (n<10) {throw (new C());}
      }
   }
	
   class A extends Exception {
      public String toString() {
         return "aS";}
      public String getMessage() {
         return "aM";}
   }
	
   class B extends Exception {
      public String getMessage() {
         return "bM";}
   }
	
   class C extends Exception {
      public String toString() {
         return "cS";}
   }
