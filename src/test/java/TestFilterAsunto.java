import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ucp.Correo;
import com.ucp.FilterAsunto;

public class TestFilterAsunto {
    @Test 
    public void TestPorAsunto() {
     List<Correo> correos = new ArrayList<>();
     FilterAsunto filtro = new FilterAsunto();
 
     Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
     Correo correo2 = new Correo("oferta", "Contenido 1", "correo@example.com", "correo1@example.com");
     Correo correo3 = new Correo("importante", "Contenido 1", "correo@example.com", "correo@example.com");
 
     correos.add(correo1);
     correos.add(correo3);
     correos.add(correo2);
 
     String palabraClave = "oferta"; 
 
     List<Correo> correosFiltrados = filtro.filtrarPorAsunto(correos, palabraClave);
     

        assertNotNull(correosFiltrados);
        assertEquals(1, correosFiltrados.size());
        assertEquals("oferta", correosFiltrados.get(0).getAsunto());
    }
    @Test
    public void TestPorAsuntoVarios() {
        List<Correo> correos = new ArrayList<>();
        FilterAsunto filtro = new FilterAsunto();
        Correo correo1 = null; // Declarar correo1 fuera del bucle
    
        for (int i = 0; i < 10; i++) {
            int numero = 1; 
            String numeroComo = "" + numero; 
            correo1 = new Correo(numeroComo, numeroComo, numeroComo + "@example.com", numeroComo + "@example.com");
            correos.add(correo1);
        }
    
        // Ahora puedes agregar correos1 (que fue creado fuera del bucle) a la lista correos varias veces
        correos.add(correo1);
        correos.add(correo1);
        correos.add(correo1);
        
        String palabraClave = "1"; 
        List<Correo> correosFiltrados = filtro.filtrarPorAsunto(correos, palabraClave);
    
        assertNotNull(correosFiltrados);
        assertEquals(13, correosFiltrados.size()); // Debería haber 13 correos en total (10 del bucle + 3 agregados después)
        assertEquals("1", correosFiltrados.get(0).getAsunto());
     
    }



}
