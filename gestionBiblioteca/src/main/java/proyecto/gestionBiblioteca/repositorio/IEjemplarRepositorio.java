package proyecto.gestionBiblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.gestionBiblioteca.modelo.Ejemplar;

public interface IEjemplarRepositorio extends JpaRepository<Ejemplar, Integer>{

}
