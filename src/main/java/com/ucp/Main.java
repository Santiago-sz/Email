package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Contacto contacto1 = new Contacto("Juan", "González", "juan@gmail.com");
      Contacto contacto2 = new Contacto("Ana", "Pérez", "ana@gmail.com");

      List<Contacto> destinatarios = new ArrayList<>();
      destinatarios.add(contacto1);
      destinatarios.add(contacto2);

      // Crear un objeto de tipo Email con asunto, contenido, remitente y destinatarios
      Email email = new Email("Asunto del Email", "Contenido del Email", contacto1, destinatarios);

        email.enviarEmail();
    

      // Ahora puedes verificar que el email se encuentra en las bandejas de entrada y salida
      for (Contacto destinatario : destinatarios) {
         if (destinatario.getBandejaEntrada().contains(email)) {
            System.out.println("El email se encuentra en la bandeja de entrada de " + destinatario.getName());
         } else {
            System.out.println("El email NO se encuentra en la bandeja de entrada de " + destinatario.getName());
         }
      }

      if (contacto1.getBandejaSalida().contains(email)) {
         System.out.println("El email se encuentra en la bandeja de salida de " + contacto1.getName());
      } else {
         System.out.println("El email NO se encuentra en la bandeja de salida de " + contacto1.getName());
      }
   }
}
