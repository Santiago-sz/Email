package com.ucp;

import java.util.List;

public class Contacto {
    
    private String name = "";
    private String apellido = "";
    private String emailS ="";
    private List<Email> bandejaEntrada;
    private List<Email> bandejaSalida;



    public Contacto(String name,String apellido,String emailS, List<Email> bandejaSalida, List<Email> bandejaEnatrada){
        this.name = name;
        this.apellido = apellido;
        this.emailS = emailS;
        this.bandejaEntrada = bandejaEnatrada;
        this.bandejaSalida = bandejaSalida;
    }
    
    void getContacto(){
        return;
    }

    void setContactos(String name,String apellido,String emailS, List<Email> bandejaSalida, List<Email> bandejaEnatrada){
        this.name = name;
        this.apellido = apellido;
        this.emailS = emailS;
        this.bandejaEntrada = bandejaEnatrada;
        this.bandejaSalida = bandejaSalida;
    }

     // Método para guardar un email en la bandeja de entrada
     public void guardarEnBandejaEntrada(Email email) {
        bandejaEntrada.add(email);
    }

    // Método para guardar un email en la bandeja de salida
    public void guardarEnBandejaSalida(Email email) {
        bandejaSalida.add(email);
    }





}
