package com.ucp;

import java.util.List;

public class Correo {

    private String asunto = "";
    private String contenido = "";
    private Contacto remitente;

    private List<Contacto> Para;


    public Correo(String asunto, String contenido, Contacto remitente) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
    }

     public Correo(){
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(){
         this.asunto = asunto;
    }

    public void getRemitente(){
    return ;
    }

     public void setRemitente(){
         this.remitente = remitente;
    }

    public String getContenido() {
        return contenido;
    }
    public void setContenido(){
         this.contenido = contenido;
    }



    public void setCorreo(String asunto, String contenido, Contacto remitente) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
    }
    
}
