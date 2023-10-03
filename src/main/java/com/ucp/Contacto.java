package com.ucp;

import java.util.List;

public class Contacto {
    
    private String name = " ";
    private String apellido = " ";
    private String email =" ";

    public Contacto(String name , String apellido , String emailS){
        this.name = name;
        this.apellido = apellido;
        this.email = emailS;
    }
    
    public Contacto(){
    }


    public String getName() {
        return name;
    }
    public void setName(String name){
         this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido){
         this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
         this.email = email;
    }

    public void setContacto(String name, String apellido, String email){
        this.name = name;
        this.apellido = apellido;
        this.email = email;
    }

    public List<Contacto> getBandejaSalida() {
        return null;
    }

    }
