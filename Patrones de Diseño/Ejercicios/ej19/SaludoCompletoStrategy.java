package prog.ud12.ejercicios.ej19;

import prog.ud12.ejercicios.ej19.ISaludoStrategy;
import prog.ud12.ejercicios.ej19.Persona;

public class SaludoCompletoStrategy implements ISaludoStrategy {

	@Override
	public void saludar(Persona p) { 
		System.out.println("Hola, soy " + p.getNombre() + " y tengo "
				+ p.getEdad() + " años");
	}

}
