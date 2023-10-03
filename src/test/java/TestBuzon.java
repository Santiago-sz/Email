import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Correo;

public class TestBuzon {

     @Test
    public void testCrearBuzon() {

        Buzon buzon = new Buzon("correo@example.com", null, null);

        assertNotNull(buzon.getBandejaEntrada());
        assertNotNull(buzon.getBandejaSalida());
        assertTrue(buzon.getBandejaEntrada().isEmpty());
        assertTrue(buzon.getBandejaSalida().isEmpty());

    }

     @Test
    public void testCrearBuzon2() {

        Buzon buzon = new Buzon("correo@example.com", null, null);

        assertEquals("correo@example.com",buzon.getEmailInterno());
    }

    @Test
    public void testAgregarElementos() {
        Buzon buzon = new Buzon("correo@example.com", null, null);
        Buzon buzon2 = new Buzon("correo@example.com", null, null);
        
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", buzon, buzon2);
        Correo correo2 = new Correo("Asunto 1", "Contenido 1", buzon, buzon2);

        // Agregar elementos a la bandeja de entrada
        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);

        // Agregar elementos a la bandeja de enviados
        buzon.getBandejaSalida().add(correo1);

        // Verificar si los elementos se han agregado correctamente
        assertEquals(2, buzon.getBandejaEntrada().size()); // Debería haber 2 elementos en la bandeja de entrada
        assertEquals(1, buzon.getBandejaSalida().size()); // Debería haber 1 elemento en la bandeja de enviados
        assertTrue(buzon.getBandejaEntrada().contains(correo1)); // La bandeja de entrada debe contener correo1
        assertTrue(buzon.getBandejaEntrada().contains(correo2)); // La bandeja de entrada debe contener correo2
        assertTrue(buzon.getBandejaSalida().contains(correo1)); // La bandeja de enviados debe contener correo1
    }

}
