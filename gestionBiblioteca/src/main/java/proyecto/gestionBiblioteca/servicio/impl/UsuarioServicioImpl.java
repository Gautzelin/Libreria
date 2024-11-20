package proyecto.gestionBiblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import proyecto.gestionBiblioteca.modelo.Usuario;
import proyecto.gestionBiblioteca.repositorio.IUsuarioRepositorio;
import proyecto.gestionBiblioteca.servicio.IUsuarioServicio;

@Service
@Component
public class UsuarioServicioImpl implements IUsuarioServicio{

	@Autowired
	private IUsuarioRepositorio repositorioUsuario;
	@Override
	public void insertarUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		try {
			repositorioUsuario.save(nuevoUsuario);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar usuario: "+e.getMessage());
		}
	}

	@Override
	public void actualizarUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		try {
			repositorioUsuario.save(nuevoUsuario);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al actualizar usuario: "+e.getMessage());
		}
	}

	@Override
	public void eliminarUsuario(int id) {
		// TODO Auto-generated method stub
		try {
			repositorioUsuario.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar usuario: "+e.getMessage());
		}
	}

	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		try {
			return repositorioUsuario.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar usuario: "+e.getMessage());
		}
		return null;
	}

	@Override
	public Usuario buscarId(int id) {
		// TODO Auto-generated method stub
		return repositorioUsuario.findById(id).get();
	}

	@Override
	public Usuario validarCredenciales(String email, String password) {
		// TODO Auto-generated method stub
		return repositorioUsuario.findByEmailAndPassword(email, password);
	}


}
