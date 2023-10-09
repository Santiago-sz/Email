package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Correo {

    private String asunto = "";
    private String contenido = "";
    private String remitente;
    private List<String> para;

    public Correo(String asunto, String contenido, String remitente, String paraUnico) {
        if (remitente == null || remitente.isEmpty()) {
            throw new IllegalArgumentException("Correo electrónico inválido");
        }
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
        this.para = new ArrayList<>();
        this.para.add(paraUnico);
    }

    public Correo(String asunto, String contenido, String remitente, List<String> paraVarios) {
        if (remitente == null || remitente.isEmpty()) {
            throw new IllegalArgumentException("Correo electrónico inválido");
        }
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
        this.para = new ArrayList<>(paraVarios);
    }

    public Correo() {
    }

    public List<String> getPara() {
        return para;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getContenido() {
        return contenido;
    }
}