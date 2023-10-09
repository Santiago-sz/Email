import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Cartero;
import com.ucp.Correo;
import com.ucp.FilterRemitente;

public class TestFilterRemitente {

@Test
public void TestPorRemitente() {

    Buzon buzon = new Buzon("correo@example.com", null, null);
    FilterRemitente filtro = new FilterRemitente();
    Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo1@example.com", "correo1@example.com");
    Correo correo2 = new Correo("Asunto 2", "Contenido 1", "correo2@example.com", "correo1@example.com");
    Correo correo3 = new Correo("Asunto 1", "Contenido 1", "correo3@example.com", "correo1@example.com");

    buzon.getBandejaEntrada().add(correo1);
    buzon.getBandejaEntrada().add(correo2);
    buzon.getBandejaEntrada().add(correo3);

    String palabraClave = "@";

    List<Correo> correosFiltrados = filtro.filtrarPorRemitente(buzon, palabraClave);

    assertNotNull(correosFiltrados);
    assertEquals(3, correosFiltrados.size());
    assertEquals("correo1@example.com", correosFiltrados.get(0).getRemitente());
}
    @Test
    public void testEnviarYFiltrarPorRemitente() {
        Cartero cartero = new Cartero();
        Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());

        // Crear instancias de Correo
        Correo correo1 = new Correo("Asunto 1", "Perro negro", "correo@gmail.com", "correo1@gmail.com");
        Correo correo2 = new Correo("Asunto 2", "Gato", "correo@gmail.com", "correo1@gmail.com");
        Correo correo3 = new Correo("Asunto 3", "Perro azul", "correo@gmail.com", "correo1@gmail.com");
        Correo correo4 = new Correo("Asunto 1", "Perro negro", "correo@hotmail.com", "correo1@gmail.com");
        Correo correo5 = new Correo("Asunto 2", "Gato", "correo@hotmail.com", "correo1@gmail.com");
        Correo correo6 = new Correo("Asunto 3", "Perro azul", "correo@hotmail.com", "correo1@gmail.com");

        
        cartero.agregarbuzones(buzon);

      
        cartero.enviarEmail(correo1);
        cartero.enviarEmail(correo2);
        cartero.enviarEmail(correo3);
        cartero.enviarEmail(correo4);
        cartero.enviarEmail(correo5);
        cartero.enviarEmail(correo6);

        FilterRemitente filtro = new FilterRemitente();
        List<Correo> correosFiltrados = filtro.filtrarPorRemitente(buzon, "@gmail");

       
        assertEquals(3, correosFiltrados.size());

     
    }
}

