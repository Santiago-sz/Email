package com.ucp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cartero {

    private List<Buzon> buzones = new ArrayList<>();
    private Correo email;
 
    public Cartero(){
    }

    public Cartero(List<Buzon> buzones, Correo email) {
        this.buzones = new ArrayList<>(buzones);
        this.email = email;
    }

    public void agregarbuzones(Buzon usuario){
        buzones.add(usuario);
    }

    public List<Buzon> getPara() {
        return buzones;
    }
    public void getCorreo(){

    }

    public Correo getEmail() {
        return email;
    }

    public void setPara(List<Buzon> para) {
        this.buzones = para;
    }

    public void enviarEmail(Correo email) {
        Buzon remitente = email.getRemitente();
        
        Optional<Buzon> buzonDestinatario = buzones.stream().filter(buzon -> buzon.getEmailInterno().equals(remitente.getEmailInterno())).findFirst();
    
        buzonDestinatario.ifPresent(destinatario -> destinatario.getBandejaSalida().add(email));
        email.getPara().forEach(b -> b.getBandejaEntrada().add(email));
    }
}

