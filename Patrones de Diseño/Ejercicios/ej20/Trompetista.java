package prog.ud12.ejercicios.ej20;

public class Trompetista implements IMusico {

	private String nombre;
	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void tocar() {
		System.out.println("("+this.nombre+")"+"PUEETTT");
	}

}
