import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Cartero;
import com.ucp.Correo;
import com.ucp.FilterAsuntoContenidos;

public class TestAsuntoContenido {

  @Test
public void TestFilterAsuntoContenidos1() {
    Buzon buzon = new Buzon("correo@example.com", null, null);
    FilterAsuntoContenidos filtro = new FilterAsuntoContenidos();
    Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
    Correo correo2 = new Correo("Asunto 2", "Contenido 1", "correo@example.com", "correo1@example.com");
    Correo correo3 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");

    buzon.getBandejaEntrada().add(correo1);
    buzon.getBandejaEntrada().add(correo2);
    buzon.getBandejaEntrada().add(correo3);

    String palabraClaveAsunto = "1";
    String palabraClaveContenido = "Contenido 1";

    List<Correo> correosFiltrados = filtro.filtrarPorAsuntoContenido(buzon, palabraClaveAsunto, palabraClaveContenido);

    assertNotNull(correosFiltrados);
    assertEquals(2, correosFiltrados.size());
    assertEquals("Asunto 1", correosFiltrados.get(0).getAsunto());
    assertEquals("Asunto 1", correosFiltrados.get(1).getAsunto());
}

@Test
    public void testEnviarYFiltrarPorAsuntoYContenido() {
      Cartero cartero = new Cartero();
        Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());
        

        // Crear instancias de Correo
        Correo correo1 = new Correo("Mascota vieja", "Perro negro", "correo@gmail.com", "correo1@gmail.com");
        Correo correo2 = new Correo("Asunto 2", "Gato", "correo@gmail.com", "correo1@gmail.com");
        Correo correo3 = new Correo("Mascota nueva", "Perro azul", "correo@gmail.com", "correo1@gmail.com");
        Correo correo4 = new Correo("Saludo", "Hola como estas", "correo@gmail.com", "correo1@gmail.com");

        
        cartero.agregarbuzones(buzon);
        
        cartero.enviarEmail(correo1);
        cartero.enviarEmail(correo2);
        cartero.enviarEmail(correo3);
        cartero.enviarEmail(correo4);

        FilterAsuntoContenidos filtro = new FilterAsuntoContenidos();
        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoContenido(buzon, "Mascota","Perro");

        assertEquals(2, correosFiltrados.size());
     

       }
    }

