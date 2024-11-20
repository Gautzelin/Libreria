package proyecto.gestionBiblioteca.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import proyecto.gestionBiblioteca.modelo.Usuario;
import proyecto.gestionBiblioteca.servicio.IUsuarioServicio;

@Controller
public class UsuarioControlador {

	@Autowired
	private IUsuarioServicio servicioUsuario;
	private List<Usuario> listaResultado;

	// Listar
	@GetMapping("/lista")
	public String listarUsuario(Model model) {
		listaResultado = servicioUsuario.listarUsuario();
		System.out.println(listaResultado);
		model.addAttribute("Lista", listaResultado);
		return "listarUsuario";
	}

	// crear nuevo usuario registro
	@GetMapping("/nuevoUsuario")
	public String nuevoUsuario(Model model) {
		model.addAttribute("nuevoUsuario", new Usuario());
		return "nuevoUsuario";
	}

	// Guardar usuario
	@PostMapping("/guardarUsuario")
	public String guardarUsuario(@ModelAttribute("nuevo") Usuario nuevoUsuario) {
		servicioUsuario.insertarUsuario(nuevoUsuario);
		return "redirect:/lista";
	}

	// Actualizar usuario
	@GetMapping("/editar/{idUsuario}")
	public String actualizarUsuario(Model model, @PathVariable(value = "idUsuario") int idUsuario) {

		model.addAttribute("nuevoUsuario", servicioUsuario.buscarId(idUsuario));
		return "nuevoUsuario";
	}
	
	// Eliminar usuario
	@GetMapping("/eliminar/{idUsuario}")
	public String eliminarUsuario(@PathVariable(value = "idUsuario") int idUsuario) {
	    servicioUsuario.eliminarUsuario(idUsuario);
	    return "redirect:/lista";
	}
	
	@GetMapping("/login")
    public String mostrarFormularioLogin(Model model) {
        model.addAttribute("credenciales", new Usuario()); // Objeto para enlazar datos del formulario
        return "login";
    }

    @PostMapping("/login")
    public String procesarLogin(@ModelAttribute("credenciales") Usuario credenciales, Model model) {
        Usuario usuario = servicioUsuario.validarCredenciales(credenciales.getEmail(), credenciales.getPassword());

        if (usuario != null) {
            // Login exitoso
            return "redirect:/lista"; // Redirige a la página principal
        } else {
            // Credenciales incorrectas
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login";
        }
    }
	

}
