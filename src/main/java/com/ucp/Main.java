import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Correo> correos = new ArrayList<>();
        correos.add(new Correo("Oferta especial", "Hola, tenemos una oferta especial para ti", "ofertas@example.com"));
        correos.add(new Correo("Importante", "Por favor, revisa este mensaje importante", "admin@example.com"));
        correos.add(new Correo("Reunión", "Reunión programada para el próximo martes", "jefe@example.com"));

        List<String> palabrasClave = Arrays.asList("oferta", "importante");

        FiltroCorreo filtro = new FiltroCorreo();
        List<Correo> correosFiltrados = filtro.filtrarCorreos(correos, palabrasClave);

        System.out.println("Correos filtrados:");
        for (Correo correo : correosFiltrados) {
            System.out.println("Asunto: " + correo.getAsunto() + ", Remitente: " + correo.getRemitente());
        }
    }
}
