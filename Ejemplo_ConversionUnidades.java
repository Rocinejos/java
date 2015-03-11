
import java.util.*;

public class Practica2SergioSantosGil{

//-------------------------------------------- Métodos de las magnitudes -----------------------------------------------------------------
     
   public static double metodoVelocidad(double espacio, double tiempo){
      return espacio/tiempo;
	}

	public static double metodoAceleracion(double espacio, double tiempo){
		return espacio/(tiempo*tiempo);
	}
   
	public static double metodoFuerza(double masa, double aceleracion){
		return masa*aceleracion;
	}
   
	public static double metodoTrabajo(double fuerza, double espacio){
		return fuerza*espacio;
	}
   
	public static double metodoPotencia(double trabajo, double tiempo){
		return trabajo/tiempo;
	}
   
	public static double metodoPresion(double fuerza, double espacio){
		return fuerza/(espacio*espacio);
	}     

//-------------------------------------------- Void Main ---------------------------------------------------------------------

   public static void main(String[] agrs){
   
      Scanner scan = new Scanner(System.in);

//------------------------------------------- Declaraciones -------------------------------------------------------------      
      
      byte numero;

      double masa=1;
      double tiempo=1;
      double espacio=1;
     
      double velocidad;
      double aceleracion;
	   double fuerza;
		double trabajo;
		double potencia;
		double presion;

     
      String sistema = "SI"; 
      String unidadLongitud;
      String unidadPeso;
      String unidadTiempo;
      String unidadVelocidad;
      String unidadAceleracion;
      String unidadFuerza;
      String unidadTrabajo;      
      String unidadPotencia;
      String unidadPresion;  
     
//--------------------------------------- Comienzo del bucle --------------------------------------------------------------
      
      do{
     
//------------------------------ Asignación a las medidas de unidades ------------------------------------------------------- 

      if (sistema.equals("SI")){
      
            unidadLongitud="m";
            unidadPeso="kg";
            unidadTiempo="s";
            unidadVelocidad="m";
			unidadAceleracion="kg";
			unidadFuerza="s";
			unidadTrabajo="m/s";
			unidadPotencia="m/s^2";
			unidadPresion="N";
      }				    
            
      else {
      
            unidadLongitud="cm";
            unidadPeso="g";
            unidadTiempo="s";
            unidadVelocidad="cm/s";
			unidadAceleracion="cm/s^2";
			unidadFuerza="dyn";
			unidadTrabajo="erg";
			unidadPotencia="erg/s";
			unidadPresion="baria"; 
      }

//--------------------------------- Asignación a las magnitudes ---------------------------------------------------------------- 

      velocidad=metodoVelocidad(espacio,tiempo);
      aceleracion=metodoAceleracion(espacio,tiempo);
      fuerza=metodoFuerza(masa,aceleracion);
      trabajo=metodoTrabajo(fuerza,espacio);
      potencia=metodoPotencia(trabajo,tiempo);
      presion=metodoPresion(fuerza,espacio);

// --------------------------------------- Menú principal -----------------------------------------------------------------------
     
      System.out.println("--------------------------------------------------------------------------------");
   
      System.out.println("CONVERSOR de MAGNITUDES FISICAS");
      
      System.out.println("--------------------------------------------------------------------------------");
   
      System.out.println("Sistema de unidades utilizado en este momento: "+sistema);
      System.out.println(" ");
      System.out.println("Valores utilizados: ");
      System.out.println(espacio+" "+unidadLongitud+" "+masa+" "+unidadPeso+" "+tiempo+" "+unidadTiempo);
   
      System.out.println("-------------------------------------------------------------------------------");
   
      System.out.println("MAGNITUDES");
   
      System.out.println("-------------------------------------------------------------------------------");
            
      System.out.println("Velocidad \t \t(v=e/t): "+velocidad+" "+unidadVelocidad);
      System.out.println("Aceleracion \t \t(a=e/t2): "+aceleracion+" "+unidadAceleracion);
      System.out.println("Fuerza \t \t \t(F=m*a): "+fuerza+" "+unidadFuerza);
      System.out.println("Trabajo \t \t(T=F*e): "+trabajo+" "+unidadTrabajo);
      System.out.println("Potencia \t \t(W=T/t): "+potencia+" "+unidadPotencia);
      System.out.println("Presion \t \t(P=F/e2): "+presion+" "+unidadPresion);
   
      System.out.println("-------------------------------------------------------------------------------");
   
      System.out.println("OPCIONES de USUARIO");
   
      System.out.println("-------------------------------------------------------------------------------");
      System.out.println("1. Cambiar el valor de masa.");
      System.out.println("2. Cambiar el valor de tiempo.");
      System.out.println("3. Cambiar el valor de espacio.");
      System.out.println("4. Cambiar el sistema de unidades.");
      System.out.println("5. Salir.");
   
      System.out.println("-------------------------------------------------------------------------------");
   
      System.out.print("Indique con el numero correspondiente la opcion que quieres utilizar: ");
   
      numero = scan.nextByte();
      
//--------------------------------- Valores no validos del menú --------------------------------------------------------------
                
      while ((numero<1)||(numero>=6)) {
         System.out.print("Por favor revisa las opciones del menu e introduce un valor correcto: ");
         numero = scan.nextByte();
      }
            
//---------------------------------------- Opciones del menú ---------------------------------------------------------------------  
                             
      switch (numero){
         	
            case 1:
               System.out.print("Indique el valor de tiempo: ");
               tiempo=scan.nextDouble();
               break;
            
            case 2:
               System.out.print("Indique el valor de masa: ");
               masa=scan.nextDouble();
               break;
         	
            case 3:
               System.out.print("Indique el valor de espacio: ");
               espacio=scan.nextDouble();
               break;
            
            case 4:
               if (sistema == "SI"){
                 sistema = "CGS";
                 masa=masa*1000;
                 espacio=espacio*100;
               }
               else {
                  sistema = "SI";
                  masa=masa/1000;
                  espacio=espacio/100;
               }
            break;
        }           
      }     
      while (numero!=5);
   }
}