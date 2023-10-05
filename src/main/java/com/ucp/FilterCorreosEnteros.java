package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class FilterCorreosEnteros {
       public List<Correo> filtrarCorreos(List<Correo> correos, List<String> palabrasClave) {
        List<Correo> correosFiltrados = new ArrayList<>();

        for (Correo correo : correos) {
            // Verificar si el asunto, contenido o remitente contiene alguna palabra clave
            if (contienePalabraClave(correo, palabrasClave)) {
                correosFiltrados.add(correo);
            }
        }

        return correosFiltrados;
    }

    private boolean contienePalabraClave(Correo correo, List<String> palabrasClave) {
        String contenidoCorreo = correo.getAsunto() + " " + correo.getContenido() + " " + correo.getRemitente();
        for (String palabraClave : palabrasClave) {
            if (contenidoCorreo.toLowerCase().contains(palabraClave.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
