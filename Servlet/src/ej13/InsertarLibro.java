package tema7.ej13;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tema7/ej13/InsertarLibro")
public class InsertarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

			String isbn=request.getParameter("isbn");
			String titulo=request.getParameter("titulo");
			String categoria=request.getParameter("categoria");

			Libro libro=new Libro(isbn, titulo, categoria);
			libro.insertarLibro();
		
		String baseURI=request.getContextPath();
		response.sendRedirect(baseURI+"/tema7/ej13/MostrarTodosLibros");
	}

}
