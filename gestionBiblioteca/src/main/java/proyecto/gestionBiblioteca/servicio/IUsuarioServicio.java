package proyecto.gestionBiblioteca.servicio;

import java.util.List;

import proyecto.gestionBiblioteca.modelo.Usuario;

public interface IUsuarioServicio {
	
	public void insertarUsuario(Usuario nuevoUsuario);
	public void actualizarUsuario(Usuario nuevoUsuario);
	public void eliminarUsuario(int id);
	public List<Usuario> listarUsuario();
	public Usuario buscarId(int id);
	public Usuario validarCredenciales(String email, String password);


}
