package tema7.ej06;

import java.util.Map;
import java.util.Set;

public class UtilHTML {

	public static String pintarRadio(String nombre,
			Map<String, String> etiquetas, String seleccionado) {
		String salida = "";
		for (String k : etiquetas.keySet()) {
			String v = etiquetas.get(k);

			salida += "<input type=\"radio\" name=\"";
			salida += nombre;
			salida += "\" id=\"";
			salida += k;
			salida += "\" value=\"";
			salida += k;
			salida += "\"";
			salida += (k == seleccionado ? "checked=\"checked\"" : "");
			salida += "> \n";

			salida += "<label for=\"";
			salida += k;
			salida += "\">";
			salida += v;
			salida += "</label><br/> \n";
		}
		return salida;
	}

	public static String pintarCheckboxes(String nombre,
			Map<String, String> etiquetas, Set<String> seleccionados) {
		String salida = "";
		for (String k : etiquetas.keySet()) {
			String v = etiquetas.get(k);

			salida += "<input type=\"checkbox\" name=\"";
			salida += nombre;
			salida += "[]\" id=\"";
			salida += k;
			salida += "\" value=\"";
			salida += k;
			salida += "\"";
			salida += seleccionados.contains(k) ? " checked=\"checked\"" : "";
			salida += "> \n";

			salida += "<label for=\"";
			salida += k;
			salida += "\">";
			salida += v;
			salida += "</label><br/> \n";
		}
		return salida;
	}

	public static String pintarSelect(String nombre,
			Map<String, String> etiquetas, Set<String> seleccionados,
			String tipo) {
		String salida = "";
		salida += "<label for=\"id";
		salida += nombre;
		salida += "\">";
		salida += nombre;
		salida += "</label> \n";

		salida += "<select ";
		salida += tipo.equals("multiple") ? "multiple=\"multiple\"" : "";
		salida += " id=\"id";
		salida += nombre;
		salida += "\" name=\"";
		salida += nombre;
		salida += tipo.equals("multiple") ? "[]" : "";
		salida += "\"> \n";

		for (String k : etiquetas.keySet()) {
			String v = etiquetas.get(k);

			salida += "<option ";
			salida += seleccionados.contains(k) ? "selected=\"selected\"" : "";
			salida += " value=\"";
			salida += k;
			salida += "\">";
			salida += v;
			salida += "</option> \n";
		}
		salida += "</select> \n";
		return salida;
	}
}
