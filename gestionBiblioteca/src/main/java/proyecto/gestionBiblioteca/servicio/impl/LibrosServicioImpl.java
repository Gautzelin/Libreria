package proyecto.gestionBiblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import proyecto.gestionBiblioteca.modelo.Libros;
import proyecto.gestionBiblioteca.repositorio.ILibrosRepositorio;
import proyecto.gestionBiblioteca.servicio.ILibrosServicio;

@Service
@Component
public class LibrosServicioImpl implements ILibrosServicio{

	@Autowired
	private ILibrosRepositorio repositorioLibros;
	@Override
	public void insertarLibros(Libros nuevoLibro) {
		// TODO Auto-generated method stub
		try {
			repositorioLibros.save(nuevoLibro);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar Libros: "+e.getMessage());
		}
		
	}

	@Override
	public void actualizarLibros(Libros nuevoLibro) {
		// TODO Auto-generated method stub
		try {
			repositorioLibros.save(nuevoLibro);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al actualizar Rol: "+e.getMessage());
		}
	}

	@Override
	public void eliminarLibros(int id) {
		// TODO Auto-generated method stub
		try {
			repositorioLibros.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar Rol: "+e.getMessage());
		}
	}

	@Override
	public List<Libros> listarLibros() {
		// TODO Auto-generated method stub
		try {
			return repositorioLibros.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar Rol: "+e.getMessage());
		}
		return null;
	}

	@Override
	public Object buscarId(int id) {
		// TODO Auto-generated method stub
		return repositorioLibros.findById(id).get();
	}

}
