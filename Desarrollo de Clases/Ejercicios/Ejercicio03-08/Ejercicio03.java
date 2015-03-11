   import java.util.*;

   class Naranja {
      private int peso;

		public int getPeso() {
			return this.peso;
		}

      public Naranja(int peso) {
         this.peso = peso;
      }
		public void comer() {
			System.out.println("MMmm...qué rica naranja");
		}
   }

	class Limon {
      private int peso;
		
		public int getPeso() {
			return this.peso;
		}
  
      public Limon(int peso) {
         this.peso = peso;
      }
		public void comer() {
			System.out.println("fffff...qué limón más ácido");
		}
   }
	
	class CestaCompra {
		private Naranja n;
		private Limon l;
		
		public Naranja getNaranja() {
			return this.n;
		}
		
		public Limon getLimon() {
			return this.l;
		}
		
		public CestaCompra() {
			this.n = new Naranja(50);
			this.l = new Limon(30);
		}
		
		public CestaCompra(int pesoNaranja, int pesoLimon) {
			this.n = new Naranja(pesoNaranja);
			this.l = new Limon(pesoLimon);
		}
		
		
		
		public void comerFruta() {
			this.n.comer(); //n.comer();
			this.l.comer(); //l.comer();
		}
		
		public void getPesos() {
			System.out.println(
				"Mi naranja pesa "+this.n.getPeso()+
				"gr. y mi limón "	+this.l.getPeso()+
				"gr."
				);
		}
	}

   public class Ejercicio03 {
      public static void main(String[] args) {
			CestaCompra cc1 = new CestaCompra();
			CestaCompra cc2 = new CestaCompra(1,1);
			CestaCompra cc3 = new CestaCompra(1000,1000);
			CestaCompra cc4 = new CestaCompra(30,70);
			
			cc1.getPesos();
			cc2.getPesos();
			cc3.getPesos();
			cc4.getPesos();
			cc4.getLimon().comer();
	     }
   }
   
	
	
