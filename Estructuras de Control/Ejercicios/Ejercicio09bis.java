public class Ejercicio09bis {
	public static boolean esImpar(int x) {
		return ((x%2)==1);
	}
	
	
	public static void main(String[] args) {
		int i; //Declaración de variable de control (contador)
		
		/*
		i = 1; //INICIALIZACIÓN de la variable de control
		
		while (i<=10) { //CONDICIÓN booleana de permanencia en el bucle (dependiente de la variable de control)
			if (esImpar(i)) { //Sentencias "útiles" internas al bucle
				System.out.println(i); //Sentencias "útiles" internas al bucle
			}

			i = i+1; //ACTUALIZACIÓN de la variable de CONTROL
		}
		*/
		
		for (i = 1; i<=10; i++) {
			if (esImpar(i)) { //Sentencias "útiles" internas al bucle
				System.out.println(i); //Sentencias "útiles" internas al bucle
			}
		}
		
	}
}