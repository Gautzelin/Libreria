package proyecto.gestionBiblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import proyecto.gestionBiblioteca.modelo.Ejemplar;
import proyecto.gestionBiblioteca.repositorio.IEjemplarRepositorio;
import proyecto.gestionBiblioteca.servicio.IEjemplarServicio;

@Service
@Component
public class EjemplarServicioImpl implements IEjemplarServicio{

	@Autowired
	private IEjemplarRepositorio repositorioEjemplar;
	@Override
	public void insertarEjemplar(Ejemplar nuevoEjemplar) {
		// TODO Auto-generated method stub
		try {
			repositorioEjemplar.save(nuevoEjemplar);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar ejemplar"+e.getMessage());
		}
		
	}

	@Override
	public void actualizarEjemplar(Ejemplar nuevoEjemplar) {
		// TODO Auto-generated method stub
		try {
			repositorioEjemplar.save(nuevoEjemplar);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al actualizar ejemplar"+e.getMessage());
		}
	}

	@Override
	public void eliminarEjemplar(int id) {
		// TODO Auto-generated method stub
		try {
			repositorioEjemplar.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar ejemplar"+e.getMessage());
		}
		
	}

	@Override
	public List<Ejemplar> listarEjemplar() {
		// TODO Auto-generated method stub
		try {
			return repositorioEjemplar.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar ejemplares"+e.getMessage());
		}
		return null;
	}

}
