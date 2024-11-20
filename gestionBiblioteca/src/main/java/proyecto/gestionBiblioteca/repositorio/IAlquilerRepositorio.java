package proyecto.gestionBiblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.gestionBiblioteca.modelo.Alquiler;

public interface IAlquilerRepositorio extends JpaRepository<Alquiler, Integer>{

}
