package prog.ud12.ejercicios.ej16;

public class SaludoAmableStrategy implements ISaludoStrategy {

	@Override
	public void saludar(Persona p) {
		System.out.println("Hola, buenos días, soy " + p.getNombre());

	}

}
