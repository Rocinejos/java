package tema7.ej12;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tema7/ej12/InsertarLibro")
public class CrearLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/test",
					"root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		PreparedStatement ps = null;
		try {
			String sentenciaSQL = "insert into libros(isbn,titulo,categoria) values (?,?,?)";
			ps = con.prepareStatement(sentenciaSQL);

			String isbn=request.getParameter("isbn");
			String titulo=request.getParameter("titulo");
			String categoria=request.getParameter("categoria");

			ps.setString(1, isbn);
			ps.setString(2, titulo);
			ps.setString(3, categoria);
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.getWriter().print("LIBRO INSERTADO");
		String baseURI=request.getContextPath();
		response.sendRedirect(baseURI+"/tema7/ej12/mostrarLibros.jsp");
	}

}
