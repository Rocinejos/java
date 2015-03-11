package prog.ud12.ejercicios.ej21;

import java.util.ArrayList;
import java.util.Collection;

public class BandaDeTrompetas implements IBanda {
	private String nombreBanda;

	private Collection<IMusico> musicos;

	public BandaDeTrompetas() {
		musicos = new ArrayList<IMusico>();
	}

	@Override
	public void setNombre(String nombreBanda) {
		this.nombreBanda = nombreBanda;
	}

	@Override
	public void tocar() {
		for (IMusico m:musicos) {
			if (m instanceof Trompetista) {
				m.tocar();
			}
		}
	}

	@Override
	public void addMusico(IMusico musico) {
		musicos.add(musico);
	}

}
