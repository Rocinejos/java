<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="tema7.ej13.Libro" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		

<table>
<tr><th>ISBN</th><th>Título</th><th>Categoría</th></tr>

<%--JSTL obteniendo los datos del controlador --%>
<c:forEach var="libro" items="${libros}">
	<tr>
		<td>${libro.isbn}</td>
		<td>${libro.titulo}</td>
		<td>${libro.categoria}</td>
	</tr>
</c:forEach>


<%-- JAVA puro (scriplet) llamando al modelo directamente 
<% for (Libro libro:Libro.getTodosLibros()) { %> 
	<tr>
		<td><%=libro.getIsbn()%></td>
		<td><%=libro.getTitulo()%></td>
		<td><%=libro.getCategoria()%></td>
	</tr>

<% } %> 
--%>

</table>

<input type="button" value="Nuevo libro" onclick="window.location.href=<%=request.getContextPath()+"/tema7/ej13/insertarLibro.jsp"%>">
</body>
</html>

