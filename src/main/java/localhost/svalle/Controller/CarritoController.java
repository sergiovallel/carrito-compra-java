package localhost.svalle.Controller;

import localhost.svalle.Model.Producto;
import localhost.svalle.Model.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/carrito")

public class CarritoController {

    @Autowired
    private ProductoRepository productoRepository;
    private List<Producto> carrito = new ArrayList<>();

    @GetMapping("")
    public String verCarrito(Model model){
        model.addAttribute("productos", carrito);
        return "carrito";
    }

    // Aregar producto al carrito.
    @PostMapping("/agregar")
    public String agregarAlCarrito(@RequestParam Long idProducto){
        //Busca producto en la base.
        Producto producto = productoRepository.findById(idProducto).orElse(null);
        //Se agrega producto
        if (producto != null){
            carrito.add(producto);
        }
        //Regresa a pagina principal
        return "redirect:/";
    }

    // Eliminar producto del carrito.
    @GetMapping("/eliminar/{id}")
    public String eliminarDelCarrito(@PathVariable Long id){
        //se busca y se elimina el producto que tenga el id indicado.
        carrito.removeIf(p -> p.getIdProducto().equals(id));
        //Regresa al carrito.
        return "redirect:/carrito";
    }

    //Vaciar todo el carrito.
    @GetMapping("/vaciar")
    public String vaciarCarrito(){
        carrito.clear();

        //Regresa al carrito.
        return "redirect:/carrito";
    }

}
