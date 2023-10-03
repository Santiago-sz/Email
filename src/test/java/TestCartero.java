import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Cartero;
import com.ucp.Correo;

public class TestCartero {
    
    @Test
    public void testEmailCartero() {
    Cartero cartero = new Cartero();
    Buzon buzon = new Buzon("correo@example.com", new ArrayList<>(), new ArrayList<>());
    Buzon buzon2 = new Buzon("correo1@example.com", new ArrayList<>(), new ArrayList<>());
    
    Correo correo1 = new Correo("Asunto 1", "Contenido 1", buzon, buzon2);
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
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", buzon, buzon2);
        Correo correo2 = new Correo("Asunto 1", "Contenido 1", buzon, buzon2);
        Correo correo3 = new Correo("Asunto 1", "Contenido 1", buzon, buzon);
    
        cartero.agregarbuzones(buzon);  // Add buzon to the cartero's list of buzones
        cartero.enviarEmail(correo1);
        cartero.enviarEmail(correo2);
        cartero.enviarEmail(correo3);
    

        assertEquals(3, buzon.getBandejaSalida().size());
        assertEquals(2, buzon2.getBandejaEntrada().size());
        assertEquals(1, buzon.getBandejaEntrada().size());
    }
}
