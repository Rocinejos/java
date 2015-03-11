package prog.ud12.ejercicios.ej21;

public class Guitarrista implements IMusico {

	private String nombre;

	@Override
	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	@Override
	public void tocar() {
		System.out.println("(" + this.nombre + ")" + "RIAANG");
	}
}
