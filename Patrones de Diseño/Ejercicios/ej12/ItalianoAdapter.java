package prog.ud12.ejercicios.ej12;

import prog.ud12.ejercicios.ej06.ITraductor;

public class ItalianoAdapter implements ITraductor {

	private Traduttore traduttore;

	public ItalianoAdapter() {
		this.traduttore = new Traduttore();
	}

	@Override
	public String traducir(String palabraATraducir) {
		String sol = "";
		traduttore.activare();
		try {
			sol = traduttore.tradurre(palabraATraducir);
		} catch (WordException e) {
			e.printStackTrace();
		}
		return sol;
	}

}
