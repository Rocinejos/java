   import java.util.*;

   public class Ejercicio {
      public static void main(String[] args) {
         double nTiradas = Double.parseDouble(args[0]);
         int nCaras = Integer.parseInt(args[1]);
      
         int[] a = new int[nCaras+1]; //Desperdicio a[0] por legibilidad del código
      
         java.util.Random r = new java.util.Random();
      
         for (int i=0;i<nTiradas;i++) {
            int tiradaAlAzar = r.nextInt(nCaras)+1;
            a[tiradaAlAzar]++;
         }
      
         for (int i=1;i<=nCaras;i++) {
				//double resultado = Math.round((((a[i]*100)/nTiradas)*100))/100.0; //Redondeando a dos decimales
				double resultado = a[i]*100/nTiradas;
            System.out.println("Veces que ha salido el "+i+": ("+a[i]+"/"+(long)nTiradas+") "+resultado+"%" );
         }
      
      }
   }