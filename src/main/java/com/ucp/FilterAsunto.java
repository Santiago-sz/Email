package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class FilterAsunto {
     public List<Correo> filtrarPorAsunto(List<Correo> correos, String palabraClave) {
        List<Correo> correosFiltrados = new ArrayList<>();
        for (Correo correo : correos) {
            if (contienePalabraClaveEnAsunto(correo, palabraClave)) {
                correosFiltrados.add(correo);
            }
        }
        return correosFiltrados;
    }
    
    private boolean contienePalabraClaveEnAsunto(Correo correo, String palabraClave) {
        return correo.getAsunto().toLowerCase().contains(palabraClave.toLowerCase());
    }
}
