package prog.ud12.ejercicios.ej06;

import prog.ud12.ejercicios.ej03.Translator;

public class InglesAdapter implements ITraductor {

	private Translator translator;

	public InglesAdapter() {
		this.translator = new Translator();
	}

	@Override
	public String traducir(String palabraATraducir) {
		return translator.translate(palabraATraducir);
	}
}
