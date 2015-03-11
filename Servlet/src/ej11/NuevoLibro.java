package tema7.ej11;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/NuevoLibro")
public class NuevoLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String salidaHTML="";
		salidaHTML+="<form action=\"InsertarLibro\" method=\"post\"><br/>\n";
		salidaHTML+="ISBN<input type=\"text\" name=\"isbn\"><br/>\n";
		salidaHTML+="TITULO<input type=\"text\" name=\"titulo\"><br/>\n";
		salidaHTML+="CATEGORIA<input type=\"text\" name=\"categoria\"><br/>";
		salidaHTML+="<input type=\"submit\" ><br/>";
		salidaHTML+="</form>";
		response.setContentType("text/html");
		response.getWriter().print(salidaHTML);
	}
}
