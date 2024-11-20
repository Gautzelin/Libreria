package proyecto.gestionBiblioteca.servicio;

import java.util.List;

import proyecto.gestionBiblioteca.modelo.Libros;

public interface ILibrosServicio {
	
	public void insertarLibros(Libros nuevoLibro);
	public void actualizarLibros(Libros nuevoLibro);
	public void eliminarLibros(int id);
	public List<Libros> listarLibros();
	public Object buscarId(int id);

}
