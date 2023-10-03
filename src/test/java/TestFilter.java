import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Correo;
import com.ucp.Filter;

public class TestFilter {
    @Test
   public void TestCreateEmail() {
     List<Correo> correos = new ArrayList<>();
        Buzon buzon = new Buzon("correo@example.com", null, null);
        Buzon buzon2 = new Buzon("correo@example.com", null, null);
         Buzon buzon3 = new Buzon("correo@example.com", null, null);
        Correo correo1 = new Correo("Oferta especial", "Hola, tenemos una oferta especial para ti", buzon);
        Correo correo2 = new Correo("Importante", "Por favor, revisa este mensaje importante", buzon2);
        Correo correo3 = new Correo("Reunión", "Reunión programada para el próximo martes", buzon3);


        List<String> palabrasClave = Arrays.asList("oferta", "importante");

        Filter filtro = new Filter();
        List<Correo> correosFiltrados = filtro.filtrarCorreos(correos, palabrasClave);

        System.out.println("Correos filtrados:");
        for (Correo correo : correosFiltrados) {
            System.out.println("Asunto: " + correo.getAsunto() + ", Remitente: " + correo.getRemitente());
        }
    }}
