package proyecto.gestionBiblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import proyecto.gestionBiblioteca.modelo.Autores;
import proyecto.gestionBiblioteca.repositorio.IAutoresRepositorio;
import proyecto.gestionBiblioteca.servicio.IAutoresServicio;

@Service
@Component
public class AutoresServicioImpl implements IAutoresServicio{

	@Autowired
	private IAutoresRepositorio repositorioAutor;
	@Override
	public void insertarAutores(Autores nuevoAutores) {
		// TODO Auto-generated method stub
		try {
			repositorioAutor.save(nuevoAutores);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al insertar autores"+e.getMessage());
		
		}
		
	}

	@Override
	public void actualizarAutores(Autores nuevoAutores) {
		// TODO Auto-generated method stub
		try {
			repositorioAutor.save(nuevoAutores);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al actualizar autores"+e.getMessage());
		}
		
	}

	@Override
	public void eliminarAutores(int id) {
		// TODO Auto-generated method stub
		try {
			repositorioAutor.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar autores"+e.getMessage());
		}
	}

	@Override
	public List<Autores> listarAutores() {
		// TODO Auto-generated method stub
		try {
			return repositorioAutor.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar autores"+e.getMessage());
		}
		return null;
	}

}
