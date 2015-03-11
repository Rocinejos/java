package prog.ud12.ejercicios.ej19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StrategyFactory {

	// Paso 1 singleton: Atributo estático del singleton.
	private static StrategyFactory strategyFactory;

	// Paso 2 singleton: Constructor privado
	private StrategyFactory() {

	}

	private ISaludoStrategy iSaludoStrategy;

	public ISaludoStrategy getiSaludoStrategy() {
		if (iSaludoStrategy == null) {
			try {
				cargarEstrategia();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return iSaludoStrategy;
	}

	private void cargarEstrategia() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/prog/ud12/ejercicios/ej19/dat/estrategia.ini"));
		iSaludoStrategy = (ISaludoStrategy) Class.forName(br.readLine()).newInstance();
	}

	// Paso 3: método estático público para devolver el singleton.
	public static StrategyFactory getStrategyFactory() {
		if (strategyFactory == null) {
			strategyFactory = new StrategyFactory();
		}
		return strategyFactory;
	}

}
