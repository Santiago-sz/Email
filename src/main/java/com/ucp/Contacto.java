package com.ucp;

public class Contacto {
    
    private String name = " ";
    private String apellido = " ";
    private String emailS =" ";

    public Contacto(String name , String apellido , String emailS){
        this.name = name;
        this.apellido = apellido;
        this.emailS = emailS;
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

    public String getEmailS() {
        return emailS;
    }

    public void setEmailS(String emailS){
         this.emailS = emailS;
    }

    public void setContacto(String name, String apellido, String emailS){
        this.name = name;
        this.apellido = apellido;
        this.emailS = emailS;
    }

    }
