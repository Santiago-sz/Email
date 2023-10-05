package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class FilterContenido {

        public List<Correo> filtrarPorContenido(List<Correo> correos, String palabraClave) {
        List<Correo> correosFiltrados = new ArrayList<>();
        for (Correo correo : correos) {
            if (contienePalabraClaveEnContenido(correo, palabraClave)) {
                correosFiltrados.add(correo);
            }
        }
        return correosFiltrados;
    }

    private boolean contienePalabraClaveEnContenido(Correo correo, String palabraClave) {
        return correo.getContenido().toLowerCase().contains(palabraClave.toLowerCase());
    }
}
