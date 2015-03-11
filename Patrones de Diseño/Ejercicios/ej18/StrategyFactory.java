package prog.ud12.ejercicios.ej18;

import java.util.Calendar;

public class StrategyFactory {

	// Paso 1 singleton: Atributo estático del singleton.
	private static StrategyFactory strategyFactory;

	// Paso 2 singleton: Constructor privado
	private StrategyFactory() {

	}

	private ISaludoStrategy iSaludoStrategy;

	public ISaludoStrategy getiSaludoStrategy() {
		cargarEstrategia();
		return iSaludoStrategy;
	}

	private void cargarEstrategia() {
		int minuto = Calendar.getInstance().get(Calendar.MINUTE);
		if (minuto % 2 != 0) {
			iSaludoStrategy = new SaludoFormalStrategy();
		} else {
			iSaludoStrategy = new SaludoAmableStrategy();
		}
	}

	// Paso 3: método estático público para devolver el singleton.
	public static StrategyFactory getStrategyFactory() {
		if (strategyFactory == null) {
			strategyFactory = new StrategyFactory();
		}
		return strategyFactory;
	}

}
