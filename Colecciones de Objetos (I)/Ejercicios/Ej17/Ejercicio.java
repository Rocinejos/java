   import java.util.*;

   class Matriz2 {
      private int[][] a;
   
      public Matriz2(int fila,int col, String[] datos) {
         this.a = new int[fila][col];
         int n = 0;
         for (int i=0;i<fila;i++) {
            for (int j=0;j<col;j++) {
               a[i][j] = Integer.parseInt(datos[n]);
               n++;
            }
         }
      }
   
      public Matriz2(int[][] a) {
         this.a = new int[a.length][a[0].length];
         for (int i=0; i < a.length ;i++) {
            for (int j=0; j < a[0].length ;j++) {
               this.a[i][j] = a[i][j];
            }
         }
      }
   
   
      public String toString() {
         String sol = "";
         for (int i=0;i<this.a.length;i++) {
            for (int j=0;j<this.a[0].length;j++) {
               sol = sol + a[i][j]+"\t";
            }
            sol += "\n";
         }
         return sol;
      }
 		public Matriz2 sumar(Matriz2 m) {
			Matriz2 sol;
			sol = new Matriz2(m.a);
			
			for (int i=0; i<this.a.length ;i++) {
				for (int j=0; j<this.a[0].length ;j++) {
					sol.a[i][j] = sol.a[i][j] + this.a[i][j];
				}
			}
			
			return sol;
		}
	}

   public class Ejercicio {
      public static void main(String[] args) {
      	
      	/*
         int f = Integer.parseInt(args[0]);
         int c = Integer.parseInt(args[1]);
         String[] datos = new String[args.length-2];
         for (int i=0; i<datos.length; i++) {
            datos[i] = args[i+2];
         }
      	
      
         Matriz2 m2 = new Matriz2(f,c,datos);
      	*/
         int[][] a1 = { 
               {1,2,3} , 
               {4,5,6} 
               };
         int[][] a2 = { 
               {1,0,0} , 
               {0,0,1} 
               };
      	
         Matriz2 m1 = new Matriz2(a1);
         Matriz2 m2 = new Matriz2(a2);

			System.out.println(m1);
			System.out.println("\n\n"+m2);
			System.out.println("\n\n"+m2.sumar(m1));
      }
   }