<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.io.IOException" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
<%@page import="javax.servlet.ServletException" %>
<%@page import="javax.servlet.annotation.WebServlet" %>
<%@page import="javax.servlet.http.HttpServlet" %>
<%@page import="javax.servlet.http.HttpServletRequest" %>
<%@page import="javax.servlet.http.HttpServletResponse" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
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

%>
		

<table>
<tr><th>ISBN</th><th>T�tulo</th><th>Categor�a</th></tr>

<%
try {
	while (rs.next()) {
		String isbn=rs.getString("isbn");
		String titulo=rs.getString("titulo");
		String categoria=rs.getString("categoria");
%>
		<tr><td><%=isbn%></td><td><%=titulo%></td><td><%=categoria%></td></tr>
<%		
	}
} catch (SQLException e) {
	e.printStackTrace();
}
%>

</table>

<input type="button" value="Nuevo libro" onclick="">
</body>
</html>

