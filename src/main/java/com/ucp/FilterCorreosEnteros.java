package com.ucp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCorreosEnteros {
  /*     public List<Correo> filtrarCorreos(List<Correo> correos, List<String> palabrasClave) {
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
    } */ 
    
    public List<Correo> filtrarPorAsuntoContenidoRemitente(Buzon buzon, String palabraClaveAsunto, String palabraClaveContenido, String palabraClaveRemitente) {
    List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
    List<Correo> bandejaSalida = buzon.getBandejaSalida();

    List<Correo> correosFiltrados = new ArrayList<>();

    correosFiltrados.addAll(
        bandejaEntrada.stream()
            .filter(correo -> correo.getAsunto().contains(palabraClaveAsunto)
                              && correo.getContenido().contains(palabraClaveContenido)
                              && correo.getRemitente().contains(palabraClaveRemitente))
            .collect(Collectors.toList())
    );

    correosFiltrados.addAll(
        bandejaSalida.stream()
            .filter(correo -> correo.getAsunto().contains(palabraClaveAsunto)
                              && correo.getContenido().contains(palabraClaveContenido)
                              && correo.getRemitente().contains(palabraClaveRemitente))
            .collect(Collectors.toList())
    );

    return correosFiltrados;
}
}
