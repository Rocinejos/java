package prog.ud12.ejercicios.ej16;

public class Persona {
	private ISaludoStrategy iSaludoStrategy;
	private String nombre;

	public Persona() {
		iSaludoStrategy = new SaludoAmableStrategy();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void saludar() {
		iSaludoStrategy.saludar(this);
	}
}
