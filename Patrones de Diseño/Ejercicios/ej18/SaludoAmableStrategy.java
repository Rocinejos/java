package prog.ud12.ejercicios.ej18;

public class SaludoAmableStrategy implements ISaludoStrategy {

	@Override
	public void saludar(Persona p) {
		System.out.println("Hola, buenos d�as, soy " + p.getNombre());

	}

}
