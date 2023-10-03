import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Cartero;
import com.ucp.Correo;

public class TestCartero {
    
    @Test
    public void testEmailCartero() {
    Cartero cartero = new Cartero();
    Buzon buzon = new Buzon("correo@example.com", new ArrayList<>(), new ArrayList<>());
    
    Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
    cartero.agregarbuzones(buzon);
    cartero.enviarEmail(correo1);

     assertEquals(1, buzon.getBandejaSalida().size());
    }

    @Test
    public void testenviarEmailCartero1() {
        Cartero cartero = new Cartero();
        Buzon buzon = new Buzon("correo@example.com", new ArrayList<>(), new ArrayList<>());
        Buzon buzon2 = new Buzon("correo1@example.com", new ArrayList<>(), new ArrayList<>());
    
        // Crear instancias de Correo
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
        Correo correo2 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
        Correo correo3 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo@example.com");
    
        cartero.agregarbuzones(buzon); 
        cartero.agregarbuzones(buzon2); // Add buzon to the cartero's list of buzones
        cartero.enviarEmail(correo1);
        cartero.enviarEmail(correo2);
        cartero.enviarEmail(correo3);
    

        assertEquals(3, buzon.getBandejaSalida().size());
        assertEquals(2, buzon2.getBandejaEntrada().size());
        assertEquals(1, buzon.getBandejaEntrada().size());
    }
    @Test
public void testenviarEmailCartero3() {
    Cartero cartero = new Cartero();
    Buzon buzon = new Buzon("correo@example.com", new ArrayList<>(), new ArrayList<>());
    Buzon buzon2 = new Buzon("correo1@example.com", new ArrayList<>(), new ArrayList<>());

    // Crear instancias de Correo
    Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", Arrays.asList("correo1@example.com"));
    Correo correo2 = new Correo("Asunto 2", "Contenido 2", "correo@example.com", Arrays.asList("correo1@example.com"));
    Correo correo3 = new Correo("Asunto 3", "Contenido 3", "correo@example.com", Arrays.asList("correo1@example.com"));

    cartero.agregarbuzones(buzon);  // Agrega el buzon al listado de buzones del cartero
    cartero.agregarbuzones(buzon2); // Agrega el segundo buzon al listado de buzones del cartero

    // Envía los correos electrónicos
    cartero.enviarEmail(correo1);
    cartero.enviarEmail(correo2);
    cartero.enviarEmail(correo3);

    // Verifica que los correos electrónicos se han enviado correctamente
    assertEquals(3, buzon.getBandejaSalida().size());  // Se enviaron 3 correos desde este buzon
    assertEquals(3, buzon2.getBandejaEntrada().size()); // Se recibieron 2 correos en el buzon2
    assertEquals(0, buzon2.getBandejaSalida().size());
}

}
