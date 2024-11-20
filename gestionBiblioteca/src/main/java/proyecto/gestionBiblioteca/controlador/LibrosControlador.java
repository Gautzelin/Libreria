package proyecto.gestionBiblioteca.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import proyecto.gestionBiblioteca.modelo.Libros;
import proyecto.gestionBiblioteca.servicio.ILibrosServicio;

@Controller
public class LibrosControlador {
	
	@Autowired
	private ILibrosServicio servicioLibro;
	private List<Libros> listaResultado;
	
    // Mostrar todos los libros
	@GetMapping("/libros")
    public String listarLibros(Model model) {
        listaResultado = servicioLibro.listarLibros();
        model.addAttribute("Lista", listaResultado);
        return "listarLibro"; // Nombre del archivo HTML
    }

    // Formulario para agregar un nuevo libro
    @GetMapping("/nuevoLibro")
    public String nuevoLibro(Model model) {
        model.addAttribute("nuevoLibro", new Libros());
        return "nuevoLibro"; // Nombre del archivo HTML para agregar un nuevo libro
    }

    // Guardar un nuevo libro
    @PostMapping("/guardarLibro")
    public String guardarLibro(@ModelAttribute("nuevo") Libros nuevoLibro) {
        servicioLibro.insertarLibros(nuevoLibro);
        return "redirect:/libros";
    }

    // editar un libro
    @GetMapping("/editarLibro/{id}")
    public String actualizarLibros(Model model, @PathVariable(value="id") int id) {
        
        model.addAttribute("nuevoLibro", servicioLibro.buscarId(id));
        return "nuevoLibro"; // Nombre del archivo HTML para editar un libro
    }


    // Eliminar un libro
    @GetMapping("/eliminarLibro/{id}")
    public String eliminarLibros(@PathVariable(value="id") int id) {
        servicioLibro.eliminarLibros(id);
        return "redirect:/libros";
    }

}
