package proyecto.gestionBiblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.gestionBiblioteca.modelo.Libros;

public interface ILibrosRepositorio extends JpaRepository<Libros, Integer>{

}
