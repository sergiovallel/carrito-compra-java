package localhost.svalle.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long>{

    List<ShoppingCart> findByCodUsuario(String codUsuario);

    void deleteBycodUsuario(String codUsuario);

}
