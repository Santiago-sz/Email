
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Cartero;
import com.ucp.Correo;
import com.ucp.FilterContenido;

public class TestFilterContenido {
    @Test
    public void TestPorContenido() {
    
    Buzon buzon = new Buzon("correo@example.com", null, null);
    FilterContenido filtro = new FilterContenido();
    Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
    Correo correo2 = new Correo("Asunto 2", "Contenido 2", "correo@example.com", "correo1@example.com");
    Correo correo3 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");

    buzon.getBandejaEntrada().add(correo1);
    buzon.getBandejaEntrada().add(correo2);
    buzon.getBandejaEntrada().add(correo3);

    String palabraClave = "2";

    List<Correo> correosFiltrados = filtro.filtrarPorContenido(buzon, palabraClave);

        assertNotNull(correosFiltrados);
        assertEquals(1, correosFiltrados.size());
        assertEquals("Contenido 2", correosFiltrados.get(0).getContenido());
    }
    
    @Test
    public void TestPorContenido1(){
    
    Buzon buzon = new Buzon("correo@example.com", null, null);
    FilterContenido filtro = new FilterContenido();
    Correo correo1 = new Correo("Asunto 1", "oferta", "correo@example.com", "correo1@example.com");
    Correo correo2 = new Correo("Asunto 2", "Contenido 2", "correo@example.com", "correo1@example.com");
    Correo correo3 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
    Correo correo4 = new Correo("Asunto 1", "oferta", "correo@example.com", "correo1@example.com");
    Correo correo5 = new Correo("Asunto 2", "Contenido 2", "correo@example.com", "correo1@example.com");
    Correo correo6 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");


    buzon.getBandejaEntrada().add(correo4);
    buzon.getBandejaEntrada().add(correo5);
    buzon.getBandejaEntrada().add(correo6);   
    buzon.getBandejaEntrada().add(correo1);
    buzon.getBandejaEntrada().add(correo2);
    buzon.getBandejaEntrada().add(correo3);
 
     String palabraClave = "oferta"; // Cambia a una sola palabra clave
 
     List<Correo> correosFiltrados = filtro.filtrarPorContenido(buzon, palabraClave);


        assertNotNull(correosFiltrados);
        assertEquals(2, correosFiltrados.size());
        assertEquals("oferta", correosFiltrados.get(0).getContenido());

    }
    
    @Test
    public void testEnviarYFiltrarPorContenido() {
        Cartero cartero = new Cartero();
        Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());

        // Crear instancias de Correo
        Correo correo1 = new Correo("Asunto 1", "Perro negro", "correo@gmail.com", "correo1@gmail.com");
        Correo correo2 = new Correo("Asunto 2", "Gato", "correo@gmail.com", "correo1@gmail.com");
        Correo correo3 = new Correo("Asunto 3", "Perro azul", "correo@gmail.com", "correo1@gmail.com");

        
        cartero.agregarbuzones(buzon);

      
        cartero.enviarEmail(correo1);
        cartero.enviarEmail(correo2);
        cartero.enviarEmail(correo3);

        FilterContenido filtro = new FilterContenido();
        List<Correo> correosFiltrados = filtro.filtrarPorContenido(buzon, "Perro");

       
        assertEquals(2, correosFiltrados.size());
     
    }

}
