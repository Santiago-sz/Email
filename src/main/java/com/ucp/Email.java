package com.ucp;

import java.util.List;

public class Email {

    private String asunto = "";
    private String contenido = "";
    private Contacto remitente;
    private List<Contacto> Para;


    public Email(String asunto, String contenido, Contacto remitente, List<Contacto> Para) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
        this.Para = Para;
    }

    void getEmail(){
        return ;
    }

    void setEmail(Contacto remitente, String asunto, String contenido) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
    }

    public void enviarEmail() {
        // Guardar el correo en la bandeja de salida del remitente
        remitente.guardarEnBandejaSalida(this);

        // Guardar el correo en la bandeja de entrada de los destinatarios
        for (Contacto destinatario : Para) {
            destinatario.guardarEnBandejaEntrada(this);
        }
    }
}
