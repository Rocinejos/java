package prog.ud12.ejercicios.ej17;

public class Persona {
	
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
