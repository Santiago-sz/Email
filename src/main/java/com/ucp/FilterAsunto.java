package com.ucp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAsunto {

  /*  List<Correo> correosPorFiltrados = new ArrayList<>();


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
    } */
    
    public List<Correo> filtrarPorAsunto(Buzon buzon, String asunto) {
        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
        List<Correo> bandejaEnviados = buzon.getBandejaSalida();

        
        List<Correo> correosFiltradosEntrada = bandejaEntrada.stream().filter(correo -> correo.getAsunto().contains(asunto)).collect(Collectors.toList());

        
        List<Correo> correosFiltradosEnviados = bandejaEnviados.stream().filter(correo -> correo.getAsunto().contains(asunto)).collect(Collectors.toList());

        List<Correo> correosFiltrados = new ArrayList<>();
        correosFiltrados.addAll(correosFiltradosEntrada);
        correosFiltrados.addAll(correosFiltradosEnviados);

        return correosFiltrados;
    }
}
