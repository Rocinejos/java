package tema7.ej05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Aficiones")
public class Aficiones extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String salida = "";
		salida = "<form action=\"Aficiones\" method=\"post\">"
				+ "\n"
				+ "<label for=\"idNombre\">Nombre</label>"
				+ "\n"
				+ "<input type=\"text\" name=\"nombre\" id=\"idNombre\">"
				+ "\n"
				+ "<h4>AFICIONES</h4>"
				+ "\n"
				+ "Bailar <input type=\"checkbox\" name=\"aficion[]\" value=\"bailar\">"
				+ "\n"
				+ "Cantar <input type=\"checkbox\" name=\"aficion[]\" value=\"cantar\"><br/>"
				+ "\n" + "<input type=\"submit\" value=\"Enviar\">" + "\n";

		out.println(salida);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String nombre = request.getParameter("nombre");
		if (!nombre.equals("")) {
			String[] aficion = request.getParameterValues("aficion[]");

			if (aficion != null) {
				out.println("A " + nombre+" le gusta ");
				for (String a : aficion) {
					out.print(a+" ");
				}
			} else {
				out.println("A "+nombre+" no le gusta nada");
			}
		} else {
			out.println("Debes introducir un nombre");
		}
		out.println("<br/>");
		out.println("<a href=\"Aficiones\">Volver al formulario</a>");

	}

}
