package prog.ud12.ejercicios.ej19;

public class SaludoFormalStrategy implements ISaludoStrategy {

	@Override
	public void saludar(Persona p) {
		System.out.println("Hola, soy "+p.getNombre());
	}

}
