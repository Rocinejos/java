public class Circulo implements Figura {
	private final double PI = 3.141592;
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public String toString() {
		return "(C)"+this.radio;
	}
	
	public double area() {
		return (PI * this.radio * this.radio);
	}
	
}