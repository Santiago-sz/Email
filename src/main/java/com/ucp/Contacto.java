package com.ucp;

public class Contacto {
    
    private String name = " ";
    private String apellido = " ";
    private String email =" ";

    
    public Contacto(String name, String apellido, String emailS) {
        this.name = name;
        this.apellido = apellido;
        
        // Validar el correo electrónico antes de asignarlo
        if (validarEmail(emailS)) {
            this.email = emailS;
        } else {
            // Si el correo no es válido, lanzar una excepción o asignar un valor por defecto
            // En este ejemplo, lanzamos una excepción IllegalArgumentException
            throw new IllegalArgumentException("Correo electrónico inválido");
        }
    }
    
    // Método para validar el correo electrónico
    public boolean validarEmail(String email) {
        // Verificar si contiene "@"
        if (email.contains("@")) {
            return true;
        } else {
            return false;
        }
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
    }
