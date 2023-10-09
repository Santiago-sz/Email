import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void testCarteroGet() {
    
    List<Buzon> buzones = new ArrayList<>();
    Buzon buzon = new Buzon("correo@example.com", new ArrayList<>(), new ArrayList<>());
    Buzon buzon1 = new Buzon("correo1@example.com", new ArrayList<>(), new ArrayList<>());
    Buzon buzon2 = new Buzon("correo2@example.com", new ArrayList<>(), new ArrayList<>());

    buzones.add(buzon);
    buzones.add(buzon1);
    buzones.add(buzon2);

    Cartero cartero = new Cartero(buzones);

     assertEquals(buzones, cartero.getPara());
    }

    @Test
    public void testCrearCartero() {

    List<Buzon> buzones = new ArrayList<>();
    Buzon buzon = new Buzon("correo@example.com", new ArrayList<>(), new ArrayList<>());
    Buzon buzon1 = new Buzon("correo1@example.com", new ArrayList<>(), new ArrayList<>());
    Buzon buzon2 = new Buzon("correo2@example.com", new ArrayList<>(), new ArrayList<>());

    buzones.add(buzon);
    buzones.add(buzon1);
    buzones.add(buzon2);

    Cartero cartero = new Cartero(buzones);

    Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
    
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
        cartero.agregarbuzones(buzon2); 
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

    cartero.agregarbuzones(buzon);  
    cartero.agregarbuzones(buzon2); 

    // Envía los correos electrónicos
    cartero.enviarEmail(correo1);
    cartero.enviarEmail(correo2);
    cartero.enviarEmail(correo3);

    // Verifica que los correos electrónicos se han enviado correctamente
    assertEquals(3, buzon.getBandejaSalida().size());  
    assertEquals(3, buzon2.getBandejaEntrada().size()); 
    assertEquals(0, buzon2.getBandejaSalida().size());
}

}
