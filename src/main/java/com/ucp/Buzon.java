package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Buzon {

        private String emailS ="";
        private List<Correo> bandejaEntrada ;
        private List<Correo> bandejaSalida ;

        public Buzon(){
        }

        public Buzon (String emailS,List<Correo> bandejaEntrada,List<Correo> bandejaSalida){
        this.emailS = emailS;
        this.bandejaEntrada = bandejaEntrada = new ArrayList<>();
        this.bandejaSalida =bandejaSalida = new ArrayList<>();   
    }

        public List<Correo> getBandejaSalida() {
            return bandejaSalida;
        }

        public List<Correo> getBandejaEntrada() {
            return bandejaEntrada;
        }

        public String getEmailS(){
            return emailS;
        }



}
