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

      Correo email = new Correo("Asunto del Email", "Contenido del Email",buzon, para);
      Correo email1 = new Correo();

      assertNotEquals(email,email1);
   }

   @Test
   public void TestCreateEmailpara() {
       
      Buzon buzon = new Buzon("correo@example.com", null, null);
      Correo email1 = new Correo();
      Correo email = new Correo("Asunto del Email", "Contenido del Email",buzon, buzon);

       assertNotEquals(email,email1);
   }

   @Test
   public void TestCreateEmail2() {
       
      Buzon buzon = new Buzon("correo@example.com", null, null);
      Buzon buzon1 = new Buzon("correo@example.com", null, null);
      Buzon buzon2 = new Buzon("correo@example.com", null, null);
      Buzon buzon3 = new Buzon("correo@example.com", null, null);

      Correo email = new Correo("Asunto del Email", "Contenido del Email",buzon, buzon);
      List<Buzon> para = new ArrayList<>();

      para.add(buzon1);
      para.add(buzon2);
      para.add(buzon3);

      Correo email1 = new Correo("Asunto del Email", "Contenido del Email",buzon, para);


       assertNotEquals(email,email1);
   }
   @Test
   public void testCrearEmailAsunto() {

       Buzon buzon = new Buzon("correo@example.com", null, null);
       Correo email = new Correo("Asunto del Email", "Contenido del Email",buzon, buzon);

       assertEquals("Asunto del Email",email.getAsunto());
   }
   @Test
   public void testCrearEmailcontenido() {

       Buzon buzon = new Buzon("correo@example.com", null, null);
       Correo email = new Correo("Asunto del Email", "Contenido del Email",buzon, buzon);

       assertEquals("Contenido del Email",email.getContenido());
   }

}