package com.ucp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterContenido {
    public List<Correo> filtrarPorContenido(Buzon buzon, String contenido) {
        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
        List<Correo> bandejaEnviados = buzon.getBandejaSalida();

        List<Correo> correosFiltradosEntrada = bandejaEntrada.stream().filter(correo -> correo.getContenido().contains(contenido)).collect(Collectors.toList());
        
        List<Correo> correosFiltradosEnviados = bandejaEnviados.stream().filter(correo -> correo.getContenido().contains(contenido)).collect(Collectors.toList());

        List<Correo> correosFiltrados = new ArrayList<>();
        correosFiltrados.addAll(correosFiltradosEntrada);
        correosFiltrados.addAll(correosFiltradosEnviados);

        return correosFiltrados;
    }
}
