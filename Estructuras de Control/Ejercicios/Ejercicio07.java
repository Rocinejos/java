public class Ejercicio07 {
	public static void main(String[] args) {
		int i; //Declaraci�n de variable de control (contador)
		
		/*
		i = 10; //INICIALIZACI�N de la variable de control
		
		while (i>=1) { //CONDICI�N booleana de permanencia en el bucle (dependiente de la variable de control)
			System.out.println(i); //Sentencias "�tiles" internas al bucle

			i = i-1; //ACTUALIZACI�N de la variable de CONTROL
		}
		*/
		
		for (i = 10; i>=1; i--) {
			System.out.println(i);
		}
	}
}