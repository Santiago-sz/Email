import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Cartero;
import com.ucp.Correo;
import com.ucp.FilterCorreosEnteros;

public class TestFilterCorreosEnteros {
  
  @Test
  public void testFiltrarPorAsuntoContenidoRemitente() {
      Buzon buzon = new Buzon("correo@example.com", null, null);
      FilterCorreosEnteros filtro = new FilterCorreosEnteros();

      Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
      Correo correo2 = new Correo("oferta", "oferta", "correo@example.com", "correo1@example.com");
      Correo correo3 = new Correo("importante", "Contenido 1", "correo@example.com", "correo@example.com");

      buzon.getBandejaEntrada().add(correo1);
      buzon.getBandejaEntrada().add(correo2);
      buzon.getBandejaEntrada().add(correo3);

      String palabraClaveAsunto = "oferta";
      String palabraClaveContenido = "oferta";
      String palabraClaveRemitente = "correo@example.com";

      List<Correo> correosFiltrados = filtro.filtrarPorAsuntoContenidoRemitente(buzon, palabraClaveAsunto, palabraClaveContenido, palabraClaveRemitente);

      assertNotNull(correosFiltrados);
      assertEquals(1, correosFiltrados.size());
      assertEquals("oferta", correosFiltrados.get(0).getAsunto());
  }

@Test
    public void testEnviarYFiltrarPorAsuntoYContenido() {
        Cartero cartero = new Cartero();
        Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());
        

        // Crear instancias de Correo
        Correo correo1 = new Correo("Mascota vieja", "Perro negro", "correo@gmail.com", "correo@gmail.com");
        Correo correo2 = new Correo("Asunto 2", "Gato", "correo@gmail.com", "correo1@gmail.com");
        Correo correo3 = new Correo("Mascota nueva", "Perro azul", "correo@gmail.com", "correo1@gmail.com");
        Correo correo4 = new Correo("Saludo", "Hola como estas", "correo@gmail.com", "correo1@gmail.com");

        
        cartero.agregarbuzones(buzon);
        
        cartero.enviarEmail(correo1);
        cartero.enviarEmail(correo2);
        cartero.enviarEmail(correo3);
        cartero.enviarEmail(correo4);

        FilterCorreosEnteros filtro = new FilterCorreosEnteros();

        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoContenidoRemitente(buzon, "Mascota","Perro","@gmail");
       
        assertEquals(3, correosFiltrados.size());
     
    }
    @Test
    public void testGetRemitente() {
        Correo correo = new Correo("Asunto", "Contenido", "remitente@example.com", "destinatario@example.com");
        String remitente = correo.getRemitente();
        assertEquals("remitente@example.com", remitente);
    }
    @Test
    public void testGetContenido() {
        Correo correo = new Correo("Asunto", "Contenido del correo", "remitente@example.com", "destinatario@example.com");
        String contenido = correo.getContenido();
        assertEquals("Contenido del correo", contenido);
    }

}
