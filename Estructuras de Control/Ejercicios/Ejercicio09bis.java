public class Ejercicio09bis {
	public static boolean esImpar(int x) {
		return ((x%2)==1);
	}
	
	
	public static void main(String[] args) {
		int i; //Declaraci�n de variable de control (contador)
		
		/*
		i = 1; //INICIALIZACI�N de la variable de control
		
		while (i<=10) { //CONDICI�N booleana de permanencia en el bucle (dependiente de la variable de control)
			if (esImpar(i)) { //Sentencias "�tiles" internas al bucle
				System.out.println(i); //Sentencias "�tiles" internas al bucle
			}

			i = i+1; //ACTUALIZACI�N de la variable de CONTROL
		}
		*/
		
		for (i = 1; i<=10; i++) {
			if (esImpar(i)) { //Sentencias "�tiles" internas al bucle
				System.out.println(i); //Sentencias "�tiles" internas al bucle
			}
		}
		
	}
}