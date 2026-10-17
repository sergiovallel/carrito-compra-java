package localhost.svalle.service;
//Aqui se ve si el usuario tiene sesion abierta y sino se le crea un identificador unico
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import java.util.UUID;

//logica de negocio no de datos, gestionada como un componente DEL SISTEMA.
@Service
public class Auth {
    public String getUsuario(HttpSession session) {
        String codUsr = (String) session.getAttribute("codUsr");
        if (codUsr == null) {
            //Se genera un Identificador Unico.
            codUsr = UUID.randomUUID().toString();

            session.setAttribute("codUsr", codUsr);
        }
        return codUsr;
    }
}
