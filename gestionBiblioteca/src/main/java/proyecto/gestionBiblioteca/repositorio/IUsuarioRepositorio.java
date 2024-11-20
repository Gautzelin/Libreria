package proyecto.gestionBiblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.gestionBiblioteca.modelo.Usuario;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer>{

	Usuario findByEmailAndPassword(String email, String password);
	

}
