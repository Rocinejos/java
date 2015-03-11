package tema7.ej11;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MostrarLibros")
public class MostrarLibros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
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
		ResultSet rs = null;
		String sentenciaSQL = "select * from libros";

		try {
			ps = con.prepareStatement(sentenciaSQL);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

		String salidaHTML = "";
		salidaHTML += "<table>";
		salidaHTML += "<tr><th>ISBN</th><th>Título</th><th>Categoría</th></tr>";
		try {
			while (rs.next()) {
				String isbn=rs.getString("isbn");
				String titulo=rs.getString("titulo");
				String categoria=rs.getString("categoria");
				salidaHTML+="<tr><td>"+isbn+"</td><td>"+titulo+"</td><td>"+categoria+"</td></tr>";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		salidaHTML += "</table>";
		response.setContentType("text/html");
		response.getWriter().print(salidaHTML);
	}
}
