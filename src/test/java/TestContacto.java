import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.Contacto;


public class TestContacto {
 
    @Test
   public void TestCreateContacto0() {
      Contacto contacto = new Contacto();
      Contacto contacto1 = new Contacto("Juan", "González", "juan.gonzalez@gmail.com");
      
      assertNotEquals(contacto,contacto1);
   }

   @Test
   public void TestCreateContacto1() {
      Contacto contacto = new Contacto();
      contacto.setContacto("Juan", "González", "juan.gonzalez@gmail.com");
      
    assertEquals("Juan", contacto.getName());
    assertEquals("González", contacto.getApellido());
    assertEquals("juan.gonzalez@gmail.com", contacto.getEmail());
   }

    @Test
    public void TestCreateContacto2() {

    Contacto contacto = new Contacto();

    assertEquals(" ", contacto.getName());
    assertEquals(" ", contacto.getApellido());
    assertEquals(" ", contacto.getEmail());
    }

    @Test
    public void TestCreateContacto3() {

    Contacto contacto = new Contacto();
        contacto.setName("juan");
    assertEquals("juan", contacto.getName());
    assertEquals(" ", contacto.getApellido());
    assertEquals(" ", contacto.getEmail());
    }

    @Test
    public void TestCreateContacto4() {

    Contacto contacto = new Contacto();
        contacto.setApellido("González");
    assertEquals(" ", contacto.getName());
    assertEquals("González", contacto.getApellido());
    assertEquals(" ", contacto.getEmail());
    }

    @Test
    public void TestCreateContacto5() {
    Contacto contacto = new Contacto();
        contacto.setEmailS("juan.gonzalez@gmail.com");
    assertEquals(" ", contacto.getName());
    assertEquals(" ", contacto.getApellido());
    assertEquals("juan.gonzalez@gmail.com", contacto.getEmail());
    }




}
