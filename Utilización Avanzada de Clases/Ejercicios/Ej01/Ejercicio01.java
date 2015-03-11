import java.util.Random;

public class Ejercicio01 {
	public static void main(String[] args) {
		Figura[] f = new Figura[10];
		Random r = new Random();
		int[] monedas = new int[10];
		
		//RELLENO
		for (int i=0; i<f.length; i++) {
			int monedas[i] = r.nextInt(2);
			if (moneda == 0) {
				int base, altura;
				base = r.nextInt(10)+1;
				altura = r.nextInt(10)+1;
				f[i] = new Triangulo(base,altura);
			}
			else {
				int radio;
				radio = r.nextInt(10)+1;
				f[i] = new Circulo(radio);
			}
		}
		
		//MOSTRAR
		for (int i=0; i<f.length; i++) {
			if (f[i] instanceof Triangulo) {
				System.out.println(f[i]+" // "+
					( ((long)(f[i].area() * 100))/100F+" u.c." )
					);
			}
			else {
				System.out.println(f[i]);
			}
		}		

		
	}
}