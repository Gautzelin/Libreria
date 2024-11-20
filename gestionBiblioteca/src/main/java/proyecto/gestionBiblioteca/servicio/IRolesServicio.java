package proyecto.gestionBiblioteca.servicio;

import java.util.List;

import proyecto.gestionBiblioteca.modelo.Roles;

public interface IRolesServicio {
	
	public void insertarRoles(Roles nuevoRoles);
	public void actualizarRoles(Roles nuevoRoles);
	public void eliminarRoles(int id);
	public List<Roles> listarRoles();
	public Roles buscarId(int id);

}
