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

@WebServlet("/PruebaCheckBox")
public class PruebaCheckBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String> etiquetas = new LinkedHashMap<String, String>();
		etiquetas.put("C", "Correr");
		etiquetas.put("N", "Nadar");
		etiquetas.put("S", "Saltar");
		
		Set<String> seleccionados = new HashSet<String>();
		seleccionados.add("C");
		seleccionados.add("S");
		String salida=UtilHTML.pintarCheckboxes("aficion", etiquetas, seleccionados);
		response.setContentType("text/html");
		response.getWriter().print(salida);
	}
}
