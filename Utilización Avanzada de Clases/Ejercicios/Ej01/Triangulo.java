public class Triangulo implements Figura {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public String toString() {
		return "(T)"+this.base+","+this.altura;
	}
	
	public double area() {
		return ( this.base * this.altura )/2 ;
	}
}