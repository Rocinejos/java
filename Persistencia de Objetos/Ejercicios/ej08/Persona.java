package prog.ud11.ejercicios.ej08;

import java.io.Serializable;

public class Persona implements Serializable {
	private static final long serialVersionUID = -3329189416364309936L;
	private int dni;
	private String nombre;
	private int peso;
	private Persona padre;

	public Persona(int dni, String nombre, int peso) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.peso = peso;
	}

	
	public Persona(int dni, String nombre, int peso, Persona padre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.peso = peso;
		this.padre = padre;
	}


	public Persona getPadre() {
		return padre;
	}


	public Persona(int dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "(" + dni + ") " + nombre  ;
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPeso() {
		return peso;
	}
	
	
	
}
