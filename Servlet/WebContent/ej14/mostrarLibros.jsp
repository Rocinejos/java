<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="tema7.ej14.Libro" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		

<table>
<tr><th>ISBN</th><th>T�tulo</th><th>Categor�a</th></tr>

<%--JSTL obteniendo los datos del controlador --%>
<c:forEach var="libro" items="${libros}">
	<tr>
		<td>${libro.isbn}</td>
		<td>${libro.titulo}</td>
		<td>${libro.categoria}</td>
	</tr>
</c:forEach>

</table>

<input type="button" value="Nuevo libro" onclick="window.open('<%=request.getContextPath()+"/tema7/ej14/insertarLibro.jsp"%>')">
</body>
</html>

