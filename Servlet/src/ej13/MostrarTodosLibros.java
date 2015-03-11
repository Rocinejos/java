package tema7.ej13;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tema7/ej13/MostrarTodosLibros")
public class MostrarTodosLibros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Libro> libros = Libro.getTodosLibros();
		request.setAttribute("libros", libros);
		request.getRequestDispatcher(
				"/tema7/ej13/mostrarLibros.jsp")
				.forward(request, response);
	}
}
