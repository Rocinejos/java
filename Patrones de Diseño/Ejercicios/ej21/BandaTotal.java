package prog.ud12.ejercicios.ej21;

import java.util.ArrayList;
import java.util.Collection;

public class BandaTotal implements IBanda {

	//El composite
	private Collection<IMusico> musicos;
	
	private String nombre;
	
	public BandaTotal() {
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

	@Override
	public void addMusico(IMusico musico) {
		musicos.add(musico);
	}
	

}
