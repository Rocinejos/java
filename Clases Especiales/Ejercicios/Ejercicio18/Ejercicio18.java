class Persona {
	private String nombre;
	private String ape1;
	private String ape2;
	private String nacionalidad;
	
	public Persona(String nombre, String ape1, String ape2, String nacionalidad) {
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.nacionalidad = nacionalidad;
	}
	
	public String toString() {
		return this.ape1+" "+this.ape2+", "+this.nombre+" ("+this.nacionalidad+")";
	}
}

public class Ejercicio18 {
	public static void main(String[] args) {
		Persona p1 = new Persona("Pepe","Muñoz","Sánchez","español");
		Persona p2 = new Persona("Karen","Stewart","Smith","portuguesa");
		System.out.println(p1);
		System.out.println(p2);
	}
}