import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ucp.Buzon;
import com.ucp.Correo;


public class TestCorreo {

   @Test
   public void TestCreateEmail() {
      
      Buzon buzon = new Buzon("correo@example.com", null, null);
      Buzon buzon2 = new Buzon("correo@example.com", null, null);
      List<Buzon> para = new ArrayList<>();

      para.add(buzon);
      para.add(buzon2);

      Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
      Correo email1 = new Correo();

      assertNotEquals(correo1,email1);
   }

   @Test
   public void TestCreateEmailpara() {
      Correo email1 = new Correo();
      Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");

       assertNotEquals(correo1,email1);
   }

   @Test
   public void TestCreateEmail2() {
      Buzon buzon1 = new Buzon("correo1@example.com", null, null);
      Buzon buzon2 = new Buzon("correo@example.com", null, null);
      Buzon buzon3 = new Buzon("correo@example.com", null, null);

      Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
      List<Buzon> para = new ArrayList<>();

      para.add(buzon1);
      para.add(buzon2);
      para.add(buzon3);

      Correo correo2 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");


       assertNotEquals(correo1,correo2);
   }
   
   @Test
   public void testCrearEmailAsunto() {

       Buzon buzon = new Buzon("correo@example.com", null, null);
       Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");

       assertEquals("Asunto 1",correo1.getAsunto());
   }
   @Test
   public void testCrearEmailcontenido() {

       Buzon buzon = new Buzon("correo@example.com", null, null);
      Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");

       assertEquals("Contenido 1",correo1.getContenido());
   }

}