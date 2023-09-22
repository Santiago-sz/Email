package com.ucp;

import java.util.List;

public class Email {

    private String asunto = "";
    private String contenido = "";
    private Contacto remitente;
    private List<String> destinatarios;


    public Email(String asunto, String contenido, Contacto remitente, List<String> destinatarios) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
        this.destinatarios = destinatarios;
    }

    void getEmail(){
        return ;
    }

    void setEmail(Contacto remitente, String asunto, String contenido) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
    }

    public void enviarEmail(Contacto remitente,List<String> destinatarios) {
       
        remitente.guardarEnBandejaSalida();
 

    }






}
