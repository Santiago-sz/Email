import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Correo;

public class TestBuzon {

     @Test
    public void testCrearBuzon2() {

        Buzon buzon = new Buzon("correo@example.com", null, null);

       assertNotNull(buzon);
    }
    @Test
    public void testCrearBuzon() {

        Buzon buzon = new Buzon("correo@example.com", null, null);

        assertNotNull(buzon.getBandejaEntrada());
        assertNotNull(buzon.getBandejaSalida());
        assertTrue(buzon.getBandejaEntrada().isEmpty());
        assertTrue(buzon.getBandejaSalida().isEmpty());

    }
         @Test
    public void testCrearBuzon3() {

        Buzon buzon = new Buzon("correo@example.com", null, null);

       assertEquals("correo@example.com",buzon.getEmailInterno());
    }
    @Test
    public void testAgregarElementos() {
        Buzon buzon = new Buzon("correo@example.com", null, null);
        
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
        Correo correo2 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");

        // Agregar elementos a la bandeja de entrada
        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);

        // Agregar elementos a la bandeja de enviados
        buzon.getBandejaSalida().add(correo1);

        // Verificar si los elementos se han agregado correctamente
        assertEquals(2, buzon.getBandejaEntrada().size()); 
        assertEquals(1, buzon.getBandejaSalida().size()); 
        assertTrue(buzon.getBandejaEntrada().contains(correo1)); 
        assertTrue(buzon.getBandejaEntrada().contains(correo2));
        assertTrue(buzon.getBandejaSalida().contains(correo1));
    }
}
