import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Correo;
import com.ucp.Filter;

public class TestFilter {
@Test
   public void TestFilter1() {
     List<Correo> correos = new ArrayList<>();
        Filter filtro = new Filter();
        Buzon buzon = new Buzon("correo@example.com", null, null);

        Correo correo1 = new Correo("Oferta especial", "Hola, tenemos una oferta especial para ti", buzon);
        Correo correo2 = new Correo("Important", "Por favor, revisa este mensaje importante", buzon);
        Correo correo3 = new Correo("Reunión", "Reunión programada para el próximo martes", buzon);

        correos.add(correo1);
        correos.add(correo3);
        correos.add(correo2);

        List<String> palabrasClave = Arrays.asList("oferta", "importante");

        List<Correo> correosFiltrados = filtro.filtrarCorreos(correos, palabrasClave);

        assertNotNull(correosFiltrados);
        assertEquals(2, correosFiltrados.size());
        assertEquals("Oferta especial", correosFiltrados.get(0).getAsunto());
        assertEquals("Important", correosFiltrados.get(1).getAsunto());
    }
}

