package prog.ud12.ejercicios.ej06;

public interface ITraductor {
	/**
	 * Traduce la palabra proporcionada al idioma del adaptador
	 * @param palabraATraducir la palabra a traducir
	 * @return la palabra traducida
	 */
	public String traducir(String palabraATraducir);
}
