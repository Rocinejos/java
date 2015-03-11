package tema7.ej06;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PruebaSelect
 */
@WebServlet("/PruebaSelect")
public class PruebaSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String> etiquetas = new LinkedHashMap<String, String>();
		etiquetas.put("ES", "España");
		etiquetas.put("IT", "Italia");
		etiquetas.put("PO", "Portugal");
		etiquetas.put("DE", "Alemania");
		
		Set<String> seleccionados = new HashSet<String>();
		seleccionados.add("IT");
		seleccionados.add("PO");
		
		String salida = "";
		salida += UtilHTML.pintarSelect("paises", etiquetas, seleccionados, "multiple");
		
		seleccionados.remove("PO");
		salida += UtilHTML.pintarSelect("paises", etiquetas, seleccionados, "simple");
		
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println(salida);
	}

}
