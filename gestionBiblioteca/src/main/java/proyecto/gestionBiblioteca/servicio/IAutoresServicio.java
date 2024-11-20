package proyecto.gestionBiblioteca.servicio;

import java.util.List;

import proyecto.gestionBiblioteca.modelo.Autores;


public interface IAutoresServicio {
	
	public void insertarAutores(Autores nuevoAutores);
	public void actualizarAutores(Autores nuevoAutores);
	public void eliminarAutores(int id);
	public List<Autores> listarAutores();

}
