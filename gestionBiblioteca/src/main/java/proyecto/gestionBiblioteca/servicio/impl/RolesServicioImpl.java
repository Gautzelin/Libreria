package proyecto.gestionBiblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import proyecto.gestionBiblioteca.modelo.Roles;
import proyecto.gestionBiblioteca.repositorio.IRolesRepositorio;
import proyecto.gestionBiblioteca.servicio.IRolesServicio;

@Service
@Component
public class RolesServicioImpl implements IRolesServicio{

	@Autowired
	private IRolesRepositorio repositorioRoles;
	@Override
	public void insertarRoles(Roles nuevoRoles) {
		// TODO Auto-generated method stub
		try {
			repositorioRoles.save(nuevoRoles);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar Rol: "+e.getMessage());
		}
		
	}

	@Override
	public void actualizarRoles(Roles nuevoRoles) {
		// TODO Auto-generated method stub
		try {
			repositorioRoles.save(nuevoRoles);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al actualizar Rol: "+e.getMessage());
		}
	}

	@Override
	public void eliminarRoles(int id) {
		// TODO Auto-generated method stub
		try {
			repositorioRoles.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar Rol: "+e.getMessage());
		}
	}

	@Override
	public List<Roles> listarRoles() {
		// TODO Auto-generated method stub
		try {
			return repositorioRoles.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar Rol: "+e.getMessage());
		}
		return null;
	}

	@Override
	public Roles buscarId(int id) {
		// TODO Auto-generated method stub
		return repositorioRoles.findById(id).get();
	}

}
