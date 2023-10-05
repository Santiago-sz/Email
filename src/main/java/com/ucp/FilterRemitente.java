package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class FilterRemitente {

    public List<Correo> filtrarPorRemitente(List<Correo> correos, String palabraClave) {
        List<Correo> correosFiltrados = new ArrayList<>();
        for (Correo correo : correos) {
            if (contienePalabraClaveEnRemitente(correo, palabraClave)) {
                correosFiltrados.add(correo);
            }
        }
        return correosFiltrados;
    }
    private boolean contienePalabraClaveEnRemitente(Correo correo, String palabraClave) {
        return correo.getRemitente().toLowerCase().contains(palabraClave.toLowerCase());
    }
}