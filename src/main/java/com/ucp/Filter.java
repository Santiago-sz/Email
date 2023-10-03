package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Filter {

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
        String contenidoCorreo = correo.getAsunto() + " " + correo.getContenido() + " " + correo.getRemitente().getEmailInterno();
        for (String palabraClave : palabrasClave) {
            if (contenidoCorreo.toLowerCase().contains(palabraClave.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    
    public List<Correo> filtrarPorAsunto(List<Correo> correos, String palabraClave) {
        List<Correo> correosFiltrados = new ArrayList<>();
        for (Correo correo : correos) {
            if (contienePalabraClaveEnAsunto(correo, palabraClave)) {
                correosFiltrados.add(correo);
            }
        }
        return correosFiltrados;
    }

    public List<Correo> filtrarPorRemitente(List<Correo> correos, String palabraClave) {
        List<Correo> correosFiltrados = new ArrayList<>();
        for (Correo correo : correos) {
            if (contienePalabraClaveEnRemitente(correo, palabraClave)) {
                correosFiltrados.add(correo);
            }
        }
        return correosFiltrados;
    }

    public List<Correo> filtrarPorContenido(List<Correo> correos, String palabraClave) {
        List<Correo> correosFiltrados = new ArrayList<>();
        for (Correo correo : correos) {
            if (contienePalabraClaveEnContenido(correo, palabraClave)) {
                correosFiltrados.add(correo);
            }
        }
        return correosFiltrados;
    }

    private boolean contienePalabraClaveEnAsunto(Correo correo, String palabraClave) {
        return correo.getAsunto().toLowerCase().contains(palabraClave.toLowerCase());
    }

    private boolean contienePalabraClaveEnRemitente(Correo correo, String palabraClave) {
        return correo.getRemitente().getEmailInterno().toLowerCase().contains(palabraClave.toLowerCase());
    }

    private boolean contienePalabraClaveEnContenido(Correo correo, String palabraClave) {
        return correo.getContenido().toLowerCase().contains(palabraClave.toLowerCase());
    }

}

