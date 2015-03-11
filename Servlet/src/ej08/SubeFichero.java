package tema7.ej08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(location = "d:\\agaray", maxFileSize = 10485760L)
// 10MB
@WebServlet("/SubeFichero")
public class SubeFichero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/tema7/ej08/form.html").include(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Part parteArchivo = request.getPart("fichero");
		String nuevoNombre = request.getParameter("nuevoNombre");
		if (nuevoNombre.equals("")) { // Mantiene el original
			nuevoNombre=devuelveNombreOriginal(parteArchivo);
		}

		parteArchivo.write(nuevoNombre);

		PrintWriter out = response.getWriter();
		out.println("<h2>Fichero recibido</h2>");
	}

	private static String devuelveNombreOriginal(Part parte) {
		for (String cd : parte.getHeader("content-disposition").split(";")) {
			if (cd.trim().startsWith("filename")) {
				String filename = cd.substring(cd.indexOf("=") + 1).trim()
						.replace("\"", "");
				return filename.substring(filename.lastIndexOf("/") + 1)
						.substring(filename.lastIndexOf("\\") + 1); // MSIE fix
			}
		}
		
		return null;
	}
}
