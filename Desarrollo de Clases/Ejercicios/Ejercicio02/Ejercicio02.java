import java.util.*;

class A {
	static int numObjetosCreados;

	
	public static int getNumObjetosCreados() {
		return numObjetosCreados;
	}

	public A() {
		numObjetosCreados++;
	}
}

public class Ejercicio02 {
	public static void main(String[] args) {
		Random r = new Random();
		int limite = r.nextInt(100)+1;
		
		for (int i=0;i<limite;i++) {
			new A();
		}

		System.out.println("Se dieron "+limite+" vueltas al bucle");
		System.out.println("Se crearon "+A.getNumObjetosCreados()+" objetos de la clase A");
		System.out.println("Se crearon "+A.numObjetosCreados+" objetos de la clase A");
	}
}