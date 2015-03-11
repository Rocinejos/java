public class Ejercicio14 {

	public static int maximo (int n1, int n2) {
		return ( (n1>n2) ? n1 : n2);
	}
	
	public static void main(String[] args) {
		System.out.println(maximo(100,1));
		System.out.println(maximo(1,100));
	}

}