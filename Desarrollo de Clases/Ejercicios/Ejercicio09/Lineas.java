public class Lineas {
	String relleno;
	public Lineas(String s) {
		this.relleno = s;
	}
	public void linea(int x) {
		for (int i=0;i<x;i++) {
			System.out.print(this.relleno);
		}
		System.out.println();
	}
	public void linea(int x, int y) {
		for (int i=0;i<x;i++) {
			System.out.print(" ");
		}
		for (int i=0;i<y;i++) {
			System.out.print(this.relleno);
		}
		System.out.println();
	}
}