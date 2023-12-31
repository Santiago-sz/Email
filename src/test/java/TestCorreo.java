import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ucp.Buzon;
import com.ucp.Cartero;
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

       Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");

       assertEquals("Asunto 1",correo1.getAsunto());
   }
   @Test
   public void testCrearEmailcontenido() {

      Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");

       assertEquals("Contenido 1",correo1.getContenido());
   }
   @Test
   public void testCrearEmailParaVarios() {

      List<String> para = new ArrayList<>();
      
      para.add("correo1@example.com");
      para.add("correo@example.com");
      para.add("estenoesuncorreo@example.com");
      para.add("tuex@");


      Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", para);

      
      assertEquals(4,correo1.getPara().size());
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testCorreoInvalido() {
       new Correo("Asunto", "Contenido", "", new ArrayList<>());
   }

        @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

      @Test
    public void crearCorreoInvalido1() {
        // Espera que se lance una excepción IllegalArgumentException con un mensaje específico
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Correo electrónico inválido");

        // Intenta crear un contacto con un correo electrónico inválido
        Correo correo = new Correo("Asunto", "Contenido del correo", "", "destinatario@example.com");

    }
       @Test
   public void TestCreateEmail100() {
      Buzon buzon1 = new Buzon("correo@example.com", null, null);
      Buzon buzon2 = new Buzon("correo@example.com", null, null);
        Cartero cartero= new Cartero();
    cartero.agregarbuzones(buzon1);


      Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo@example.com");

      for(int i=0;i<100;i++){
        cartero.enviarEmail(correo1);
      }

      Correo correo2 = new Correo("Asunto 1", "Contenido 1", "correo1@example.com", "correo1@example.com");


      assertEquals(100, buzon1.getBandejaSalida().size()); 
       assertEquals(100, buzon1.getBandejaEntrada().size()); 
   }

   }
   