package proyecto.gestionBiblioteca.servicio;

import java.util.List;

import proyecto.gestionBiblioteca.modelo.Ejemplar;


public interface IEjemplarServicio {
	
	public void insertarEjemplar(Ejemplar nuevoEjemplar);
	public void actualizarEjemplar(Ejemplar nuevoEjemplar);
	public void eliminarEjemplar(int id);
	public List<Ejemplar> listarEjemplar();

}
