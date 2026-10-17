package localhost.svalle.service;
//Control de los mensajes temporales que aparecen en pantalla.

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FlashService {
    //Definicion de constantes
    public static final String EXITO = "Exito! :)";
    public static final String INFO = "Info";
    public static final String AVISO = "Aviso";
    public static final String ERROR = "ERROR! :(";

    private static final String FLASH_SESSION_KEY = "flash_notificaciones";

    //Agrega un mensaje
    public void agregarMensaje(HttpSession session, String mensaje, String tipo, String alt){
        //Creacion de la lista de notificaciones de la sesion o se crea una.
        @SuppressWarnings("unchecked")
        List<Map<String, String>> notificaciones = (List<Map<String, String>>) session.getAttribute(FLASH_SESSION_KEY);

        if(notificaciones == null){
            notificaciones = new ArrayList<>();
        }
        //Mapa de mensaje como en PHP.
        Map<String, String> itemMensaje = new HashMap<>();
        itemMensaje.put("cuerpo", mensaje);
        itemMensaje.put("tipo", tipo!= null ? tipo : EXITO);
        itemMensaje.put("alt", alt != null ? alt : "");

        //Agregar mensaje a la lista.
        notificaciones.add(itemMensaje);
        session.setAttribute(FLASH_SESSION_KEY, notificaciones);
        }
        //Obtener mensajes almacenados y borrarlos de la sesion asi se muestran 1 sola vez
        public List<Map<String, String>> getMensajes(HttpSession session){

            //Recuperacion de las notificaciones de la sesion.
            @SuppressWarnings("unchecked")
            List<Map<String, String>> notificaciones = (List<Map<String, String>>) session.getAttribute(FLASH_SESSION_KEY);

            //Si se encuentran mensajes, se borran de la sesion de inmediato.
            if (notificaciones != null){
                session.removeAttribute(FLASH_SESSION_KEY);
            }
            //Se retorna la lista de mensajes.
            return notificaciones != null ? notificaciones : new ArrayList<>();
        }

    }
