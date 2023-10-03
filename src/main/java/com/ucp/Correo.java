package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Correo {

    private String asunto = "";
    private String contenido = "";
    private Buzon remitente;
    private List<Buzon> para;


    public Correo(String asunto, String contenido, Buzon remitente, Buzon paraUnico) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
        this.para = new ArrayList<>();
        this.para.add(paraUnico);
    }
     public Correo(String asunto, String contenido, Buzon remitente, List<Buzon> paraVarios) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
        this.para = new ArrayList<>();
        this.para = paraVarios;
    }
        public Correo(String asunto, String contenido, Buzon remitente) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
    }

     public Correo(){
    }

    public List<Buzon> getPara() {
        return para;
    }
    
    public String getAsunto() {
        return asunto;
    }


    public Buzon getRemitente(){
    return remitente;
    }

    public String getContenido() {
        return contenido;
    }
    
}
