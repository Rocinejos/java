import java.util.*;

class Matriz2Exception extends Exception {
}

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
	
   public Matriz2(int filas, int columnas) {
      this.a = new int[filas][columnas];
   }
	
   public Matriz2 multiplicar(Matriz2 m) throws Matriz2Exception {
      Matriz2 m1, m2, m3;
      m1 = this;
      m2 = m;
   
      int f1,c1,f2,c2,f3,c3;
      f1 = m1.a.length;
      c1 = m1.a[0].length;
      f2 = m2.a.length;
      c2 = m2.a[0].length;
   
      if (c1!=f2) {
         throw new Matriz2Exception();
      }
   	
      m3 = new Matriz2(m1.a.length, m2.a[0].length);
      f3 = m3.a.length;
      c3 = m3.a[0].length;
   
   	
   	
   
      for (int i=0; i<c2; i++) {
         for (int j=0; j<f1; j++) {
            int acc = 0;
            for (int k=0; k<f2; k++) {
               acc += m1.a[j][k] * m2.a[k][i];
            }
            m3.a[j][i] = acc;
         }
      }
   
      return m3;
   }
}


public class Ejercicio {
   public static void main(String[] args) {
      int[][] a1 = { 
            {1,2} , 
            {4,5} 
            };
      int[][] a2 = { 
            {1,0,0}, 
            {0,1,0}, 
            {0,0,1} 
            };
   	
      Matriz2 m1 = new Matriz2(a1);
      Matriz2 m2 = new Matriz2(a2);
   
      System.out.println(m1);
      System.out.println("\n\n"+m2);
      try {
         System.out.println("\n\n"+m1.multiplicar(m2));
      }
      catch (Matriz2Exception e) {
         System.out.println("Las dimensiones de las matrices no cuadran");
      }
   }
}