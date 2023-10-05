
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ucp.Correo;
import com.ucp.FilterContenido;

public class TestFilterContenido {
    @Test
    public void TestPorContenido() {
     List<Correo> correos = new ArrayList<>();
     FilterContenido filtro = new FilterContenido();
 
     Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
     Correo correo2 = new Correo("oferta", "oferta", "correo@example.com", "correo1@example.com");
     Correo correo3 = new Correo("importante", "Contenido 1", "correo@example.com", "correo@example.com");
 
     correos.add(correo1);
     correos.add(correo3);
     correos.add(correo2);
 
     String palabraClave = "oferta"; // Cambia a una sola palabra clave
 
     List<Correo> correosFiltrados = filtro.filtrarPorContenido(correos, palabraClave);
     

        assertNotNull(correosFiltrados);
        assertEquals(1, correosFiltrados.size());
        assertEquals("oferta", correosFiltrados.get(0).getAsunto());
    }
}
