package tema7.ej06;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PruebaRadio")
public class PruebaRadio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre="color";
		String seleccionado="G";
		Map<String,String> etiquetas=new LinkedHashMap<String, String>();
		etiquetas.put("R","Rojo");
		etiquetas.put("G","Verde");
		etiquetas.put("B","Azul");
		String salida = UtilHTML.pintarRadio(nombre, etiquetas, seleccionado);
		response.setContentType("text/html");
		response.getWriter().print(salida);
	}

}
