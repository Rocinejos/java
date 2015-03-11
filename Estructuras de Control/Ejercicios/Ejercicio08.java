public class Ejercicio08 {
	public static void main(String[] args) {
		int i; //Declaración de variable de control (contador)
		
		/*
		i = 10; //INICIALIZACIÓN de la variable de control
		
		while (i>=4) { //CONDICIÓN booleana de permanencia en el bucle (dependiente de la variable de control)
			System.out.println(i); //Sentencias "útiles" internas al bucle

			i = i-1; //ACTUALIZACIÓN de la variable de CONTROL
		}
		*/
		
		for (i = 10; i>=4; i--) {
			System.out.println(i);
		}
	}
}