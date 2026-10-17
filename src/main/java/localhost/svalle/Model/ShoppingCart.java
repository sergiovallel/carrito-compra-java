package localhost.svalle.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shopping_cart")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ShoppingCart {
    //llave primaria de la tabla.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idShoppingCart")
    private Long idShoppingCart;

    @Column(name = "idProducto")
    private Long idProducto;

    @Column(name = "codUsuario")
    private String codUsuario;

    private Integer cantidad;
}
