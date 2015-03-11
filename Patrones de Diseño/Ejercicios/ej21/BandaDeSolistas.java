package prog.ud12.ejercicios.ej21;

import java.util.ArrayList;
import java.util.Collection;

public class BandaDeSolistas implements IBanda {
	private String nombreBanda;

	private Collection<IMusico> musicos;

	public BandaDeSolistas() {
		musicos = new ArrayList<IMusico>();
	}

	@Override
	public void setNombre(String nombreBanda) {
		this.nombreBanda = nombreBanda;
	}

	@Override
	public void tocar() {
		for (IMusico m : musicos) {
			m.tocar();
		}
	}

	@Override
	public void addMusico(IMusico musico) {
		if (!(musico instanceof IBanda)) {
			musicos.add(musico);
		}
	}

}
