/**package localhost.svalle.model;

import localhost.svalle.Model.ProductoRepository;
import localhost.svalle.Model.Producto;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

//Esta notacion configura la prueba para base de datos y repositorios
@DataJpaTest

//Esta otra es para que la prueba utilice la base de deatos configurada en el proyecto.
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)

public class ProductoRepositoryTest {

    @Autowired
    private ProductoRepository productoRepository;
    //Prueba unitaria para verificar la recuperacion de todos los productos.

    @Test
    public void testProductoRepositoryGetAll(){
        List<Producto> productos = productoRepository.findAll();
        assertThat(productos).isNotNull();
    }

}**/