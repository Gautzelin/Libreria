package proyecto.gestionBiblioteca.servicio;

import java.util.List;

import proyecto.gestionBiblioteca.modelo.Alquiler;


public interface IAlquilerServicio {
	
	public void insertarAlquiler(Alquiler nuevoAlquiler);
	public void actualizarAlquiler(Alquiler nuevoAlquiler);
	public void eliminarAlquiler(int id);
	public List<Alquiler> listarAlquiler();

}
