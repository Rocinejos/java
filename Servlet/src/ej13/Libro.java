package tema7.ej13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Libro {
	private String isbn;
	private String titulo;
	private String categoria;
	
	
	public Libro(String isbn, String titulo, String categoria) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.categoria = categoria;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void insertarLibro() {
		Connection con=DataBaseHelper.getConnection();
		PreparedStatement ps = null;
		try {
			String sentenciaSQL = "insert into libros(isbn,titulo,categoria) values (?,?,?)";
			ps = con.prepareStatement(sentenciaSQL);

			ps.setString(1, this.isbn);
			ps.setString(2, this.titulo);
			ps.setString(3, this.categoria);
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Libro> getTodosLibros() {
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
