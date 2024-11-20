package proyecto.gestionBiblioteca.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Autores implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellido;
	private String nacionalidad;
	
	@ManyToMany
	@JoinTable(
			name = "autores_libros",
			joinColumns = @JoinColumn(name= "fkAutor", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "fkLibros", referencedColumnName = "id")
			)
	private List<Libros> listaLibros = new ArrayList<>();
	
}