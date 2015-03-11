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
         sol = new Matriz2(m.getArray());
      	
         for (int i=0; i<m.getArray().length ;i++) {
            for (int j=0; j<m.getArray()[0].length ;j++) {
               sol.set(i,j, sol.get(i,j) + this.get(i,j) );
            }
         }
      	
         return sol;
      }

 		public int get(int f,int c) {
			return this.a[f][c];
		}  
		
		public int[][] getArray() {
			return this.a;
		}

 		public void set(int f,int c, int dato) {
			this.a[f][c] = dato;
		}  
	}

   public class EjercicioBis {
      public static void main(String[] args) {
      	
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