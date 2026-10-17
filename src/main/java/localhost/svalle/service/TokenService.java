package localhost.svalle.service;
//Creacion de Tokens, unicos, aleatorios.

import org.springframework.stereotype.Service;
import java.security.SecureRandom;
import java.util.UUID;

@Service
public class TokenService {
    private String token;

    //Constructor. se crea un token aleatorio en hexadecimal.
    public TokenService(){
        this.token = generarTokenAleatorio();
    }

    public TokenService(String tokenValue){
        if (tokenValue != null && !tokenValue.isEmpty()){
            this.token = tokenValue;
        }
    }

    private String generarTokenAleatorio(){
        SecureRandom secureRandom = new SecureRandom ();
        byte[] bytes = new byte[16];
        secureRandom.nextBytes(bytes);

        StringBuilder sb = new StringBuilder();
        for (byte b : bytes){
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
    public String getValue(){
        return this.token;
    }

    public static String getGuidv4(){
        return UUID.randomUUID().toString();
    }
}
