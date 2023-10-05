import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ucp.Correo;
import com.ucp.Filter;

public class TestFilterCorreosEnteros {
    @Test
   public void TestFilterCorreosEnteros() {
     List<Correo> correos = new ArrayList<>();
        Filter filtro = new Filter();

        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
        Correo correo2 = new Correo("oferta", "oferta", "correo@example.com", "correo1@example.com");
        Correo correo3 = new Correo("importante", "Contenido 1", "correo@example.com", "correo@example.com");

        correos.add(correo1);
        correos.add(correo3);
        correos.add(correo2);

        List<String> palabrasClave = Arrays.asList("oferta", "importante");

        List<Correo> correosFiltrados = filtro.filtrarCorreos(correos, palabrasClave);

        assertNotNull(correosFiltrados);
        assertEquals(2, correosFiltrados.size());
        assertEquals("importante", correosFiltrados.get(0).getAsunto());
        assertEquals("oferta", correosFiltrados.get(1).getAsunto());
  }
}
