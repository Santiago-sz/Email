import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ucp.Contacto;
import com.ucp.Correo;


public class TestCorreo {
  

   @Test
   public void TestCreateContacto() {
      Contacto contacto = new Contacto();
      Contacto contacto1 = new Contacto("Juan", "González", "juan.gonzalez@gmail.com");
      
      assertNotEquals(contacto,contacto1);
   }
   @Test
   public void TestCreateEmail() {
      // Crear dos objetos de tipo Contacto
      Contacto contacto1 = new Contacto("Juan", "González", "juan@gmail.com");
      Contacto contacto2 = new Contacto("Ana", "Pérez", "ana@gmail.com");

      // Crear una lista de destinatarios
      List<Contacto> para = new ArrayList<>();
      para.add(contacto1);
      para.add(contacto2);

      // Crear un objeto de tipo Email con asunto, contenido, remitente y destinatarios
      Correo email = new Correo("Asunto del Email", "Contenido del Email", contacto1, para);
      Correo email1 = new Correo();

      assertNotEquals(email,email1);
   }

   @Test
   public void TestEnviarteEmail() {
      Contacto contacto1 = new Contacto("Juan", "González", "juan@gmail.com");
      Contacto contacto2 = new Contacto("Ana", "Pérez", "ana@gmail.com");

      List<Contacto> destinatarios = new ArrayList<>();
      destinatarios.add(contacto1);
      destinatarios.add(contacto2);

      // Crear un objeto de tipo Email con asunto, contenido, remitente y destinatarios
      Correo email = new Correo("Asunto del Email", "Contenido del Email", contacto1, destinatarios);

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