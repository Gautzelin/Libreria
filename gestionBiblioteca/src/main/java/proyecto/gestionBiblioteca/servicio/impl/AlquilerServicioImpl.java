package proyecto.gestionBiblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import proyecto.gestionBiblioteca.modelo.Alquiler;
import proyecto.gestionBiblioteca.repositorio.IAlquilerRepositorio;
import proyecto.gestionBiblioteca.servicio.IAlquilerServicio;

@Service
@Component
public class AlquilerServicioImpl implements IAlquilerServicio{

	@Autowired
	private IAlquilerRepositorio repositorioAlquiler;
	@Override
	public void insertarAlquiler(Alquiler nuevoAlquiler) {
		// TODO Auto-generated method stub
		try {
			repositorioAlquiler.save(nuevoAlquiler);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar alquiler"+e.getMessage());
		}
		
	}

	@Override
	public void actualizarAlquiler(Alquiler nuevoAlquiler) {
		// TODO Auto-generated method stub
		try {
			repositorioAlquiler.save(nuevoAlquiler);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al actualzizar el alquiler"+e.getMessage());
		}
		
	}

	@Override
	public void eliminarAlquiler(int id) {
		// TODO Auto-generated method stub
		try {
			repositorioAlquiler.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar un alquiler"+e.getMessage());
		}
	}

	@Override
	public List<Alquiler> listarAlquiler() {
		// TODO Auto-generated method stub
		try {
			return repositorioAlquiler.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al listar el alquiler"+e.getMessage());
		}
		return null;
	}

}
