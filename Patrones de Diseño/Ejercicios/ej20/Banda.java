package prog.ud12.ejercicios.ej20;

import java.util.ArrayList;
import java.util.Collection;

public class Banda implements IMusico {

	//El composite
	private Collection<IMusico> musicos;
	
	private String nombre;
	
	public Banda() {
		musicos = new ArrayList<IMusico>();
	}
	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void tocar() {
		System.out.println("****");
		System.out.println(this.nombre);
		System.out.println("****");
		for (IMusico m :musicos ) {
			m.tocar();
		}
	}
	
	public void addMusico(IMusico musico) {
		musicos.add(musico);
	}

}
