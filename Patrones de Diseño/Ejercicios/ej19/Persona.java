package prog.ud12.ejercicios.ej19;

public class Persona {
	private int edad;
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	private String nombre;

		public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void saludar() {
		StrategyFactory.getStrategyFactory().getiSaludoStrategy().saludar(this);
	}
}
