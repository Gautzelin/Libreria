package proyecto.gestionBiblioteca.modelo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity
public class Alquiler implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private Date fechaAlquiler;
	private Date fechaDevolucion;
	
	@ManyToOne
	@JoinColumn(name = "fkUsuario")
	private Usuario fkUsuario;

	@ManyToOne
	@JoinColumn(name = "fkEjemplar")
	private Ejemplar fkEjemplar;
}
