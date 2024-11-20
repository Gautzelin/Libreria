package proyecto.gestionBiblioteca.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import proyecto.gestionBiblioteca.modelo.Roles;
import proyecto.gestionBiblioteca.servicio.IRolesServicio;

@Controller
public class RolesControlador {
	
	@Autowired
    private IRolesServicio rolesServicio;
	private List<Roles> listaResultado;
		

    // Listar roles
    @GetMapping("/roles")
    public String listarRoles(Model model) {
        listaResultado = rolesServicio.listarRoles();
        System.out.println(listaResultado);
        model.addAttribute("ListaRoles", listaResultado);
        return "listaRoles"; // Nombre de la vista
    }

    // Crear nuevo rol
    @GetMapping("/nuevoRol")
    public String nuevoRol(Model model) {
        model.addAttribute("nuevoRol", new Roles());
        return "nuevoRol"; // Nombre de la vista
    }

    // Guardar rol
    @PostMapping("/guardarRol")
    public String guardarRol(@ModelAttribute("nuevoRol") Roles nuevoRol) {
        rolesServicio.insertarRoles(nuevoRol);
        return "redirect:/roles";
    }

    // Actualizar rol
    @GetMapping("/editarRol/{idRol}")
    public String actualizarRol(Model model, @PathVariable(value = "idRol") int idRol) {
        model.addAttribute("nuevoRol", rolesServicio.buscarId(idRol));
        return "nuevoRol"; // Reutilizamos la vista para crear y actualizar
    }

    // Eliminar rol
    @GetMapping("/eliminarRol/{idRol}")
    public String eliminarRol(@PathVariable(value = "idRol") int idRol) {
        rolesServicio.eliminarRoles(idRol);
        return "redirect:/roles";
    }

}
