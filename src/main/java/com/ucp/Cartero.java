package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Cartero {

    private Buzon remitente;
    private List<Buzon> para;
    private Correo email;
 
    public Cartero(){
    }

    public Cartero(List<Buzon> para, Buzon remitente, Correo email) {
        this.para = new ArrayList<>(para);
        this.remitente = remitente;
        this.email = email;
    }

    public void agregarPara(Buzon usuario){
        para.add(usuario);
    }

    public List<Buzon> getPara() {
        return para;
    }

    public void setPara(List<Buzon> para) {
        this.para = para;
    }

    public void enviarEmail(Cartero cartero) {
        remitente.getBandejaSalida().add(email); // Agrega el correo electrónico a la bandeja de salida del remitente
        
        for (Buzon destinatario : para) {
            destinatario.getBandejaEntrada().add(email); // Agrega el correo electrónico a la bandeja de entrada del destinatario
        }
    }
}

