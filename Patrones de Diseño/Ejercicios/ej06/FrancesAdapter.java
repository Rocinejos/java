package prog.ud12.ejercicios.ej06;

import prog.ud12.ejercicios.ej03.Traducteur;

public class FrancesAdapter implements ITraductor {

	private Traducteur traducteur;

	public FrancesAdapter() {
		this.traducteur = new Traducteur();
	}

	@Override
	public String traducir(String palabraATraducir) {
		traducteur.preparez(palabraATraducir);
		traducteur.traduire();
		return traducteur.getMotTraduit();
	}
}
