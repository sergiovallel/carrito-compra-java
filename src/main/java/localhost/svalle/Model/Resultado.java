package localhost.svalle.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Resultado {
    public static final String OK = "OK";
    public static final String NO = "NO";

    private int errno;
    private String resultado;
    private String mensaje;
}
