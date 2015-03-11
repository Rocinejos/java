package tema7.ej14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {
	public void insertarLibro(Libro libro) {
		Connection con=DataBaseHelper.getConnection();
		PreparedStatement ps = null;
		try {
			String sentenciaSQL = "insert into libros(isbn,titulo,categoria) values (?,?,?)";
			ps = con.prepareStatement(sentenciaSQL);

			ps.setString(1, libro.getIsbn());
			ps.setString(2, libro.getTitulo());
			ps.setString(3, libro.getCategoria());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Libro> getTodosLibros() {
		Connection con=DataBaseHelper.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sentenciaSQL = "select * from libros";

		try {
			ps = con.prepareStatement(sentenciaSQL);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<Libro> libros=new ArrayList<Libro>();
		try {
			while (rs.next()) {
				String isbn=rs.getString("isbn");
				String titulo=rs.getString("titulo");
				String categoria=rs.getString("categoria");
				Libro libro=new Libro(isbn,titulo,categoria);
				libros.add(libro);
			}
		}
		catch (SQLException e) {
			
		}
		
		return libros;

	}
}
