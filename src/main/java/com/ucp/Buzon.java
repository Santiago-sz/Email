package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Buzon {

        private String emailInterno ="";
        private List<Correo> bandejaEntrada ;
        private List<Correo> bandejaSalida ;

        public Buzon (String emailInterno,List<Correo> bandejaEntrada,List<Correo> bandejaSalida){
        this.emailInterno = emailInterno;
        this.bandejaEntrada = new ArrayList<>();
        this.bandejaSalida = new ArrayList<>();   
    }

        public List<Correo> getBandejaSalida() {
            return bandejaSalida;
        }

        public List<Correo> getBandejaEntrada() {
            return bandejaEntrada;
        }

        public String getEmailInterno(){
            return emailInterno;
        }

}
