package localhost.svalle.Controller;

import localhost.svalle.Model.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("/")
    public String index(Model model) {
        // Consulta los productos en MySQL.
        model.addAttribute("productos", productoRepository.findAll());

        // Abre /WEB-INF/jsp/index.jsp.
        return "index";
    }
}