package proyecto.gestionBiblioteca.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String password;
	private String direccion;
	private Date fechaRegistro;
	private Boolean activo;
	
	@ManyToOne
	@JoinColumn(name = "fkRoles")
	private Roles fkRoles;
}
