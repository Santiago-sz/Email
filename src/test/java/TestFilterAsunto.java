import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ucp.Correo;
import com.ucp.Filter;

public class TestFilterAsunto {
    @Test 
    public void TestPorAsunto() {
     List<Correo> correos = new ArrayList<>();
     Filter filtro = new Filter();
 
     Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
     Correo correo2 = new Correo("oferta", "Contenido 1", "correo@example.com", "correo1@example.com");
     Correo correo3 = new Correo("importante", "Contenido 1", "correo@example.com", "correo@example.com");
 
     correos.add(correo1);
     correos.add(correo3);
     correos.add(correo2);
 
     String palabraClave = "oferta"; // Cambia a una sola palabra clave
 
     List<Correo> correosFiltrados = filtro.filtrarPorAsunto(correos, palabraClave);
     

        assertNotNull(correosFiltrados);
        assertEquals(1, correosFiltrados.size());
        assertEquals("oferta", correosFiltrados.get(0).getAsunto());
    }
}