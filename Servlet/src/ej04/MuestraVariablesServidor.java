package tema7.ej04;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/MuestraVariablesServidor")
public class MuestraVariablesServidor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Recepción de variables
		String[][] variables = {
				{ "AUTH_TYPE", request.getAuthType() },
				{ "CONTENT_LENGTH", String.valueOf(request.getContentLength()) },
				{ "CONTENT_TYPE", request.getContentType() },
				{ "DOCUMENT_ROOT", getServletContext().getRealPath("/") },
				{ "PATH_INFO", request.getPathInfo() },
				{ "PATH_TRANSLATED", request.getPathTranslated() },
				{ "QUERY_STRING", request.getQueryString() },
				{ "REMOTE_ADDR", request.getRemoteAddr() },
				{ "REMOTE_HOST", request.getRemoteHost() },
				{ "REMOTE_USER", request.getRemoteUser() },
				{ "REQUEST_METHOD", request.getMethod() },
				{ "SCRIPT_NAME", request.getServletPath() },
				{ "SERVER_NAME", request.getServerName() },
				{ "SERVER_PORT", String.valueOf(request.getServerPort()) },
				{ "SERVER_PROTOCOL", request.getProtocol() },
				{ "SERVER_SOFTWARE", getServletContext().getServerInfo() }, };

		// Creación de la página html de respuesta
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body> \n");
		out.println("<h1>" + "Variables de Servidor" + "</h1> \n");
		out.println("<table border=\"1\"> \n");
		out.println("<tr> \n");
		out.println("<th>Variable</th><th>Valor</th>");
		for (int i = 0; i < variables.length; i++) {
			String nombre = variables[i][0];
			String valor = variables[i][1];
			if (valor == null) {
				valor = "<i>No especificado</i>";
			}
			out.println("<tr><td>" + nombre + "</td><td>" + valor + "</tr>");
		}
		out.println("</table></body></html>");
	}
}