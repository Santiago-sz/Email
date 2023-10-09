import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ucp.Contacto;


public class TestContacto {

    @Test
    public void crearContactoConCorreoValido() {
        Contacto contacto = new Contacto("Nombre", "Apellido", "correo@dominio.com");
    }

    //me entere que no es la unica manera //
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void crearContactoConCorreoInvalido1() {
        // Espera que se lance una excepción IllegalArgumentException con un mensaje específico
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Correo electrónico inválido");

        // Intenta crear un contacto con un correo electrónico inválido
        Contacto contacto = new Contacto("Nombre", "Apellido", "correoinvalido");

    }
    @Test
    public void testValidarEmailCorreoInvalido() {
     
        Contacto contacto = new Contacto();

       
        boolean resultado = contacto.validarEmail("correoejemplo.com");

      
        assertFalse(resultado);
    }
     @Test
    public void testValidarEmailCorreovalido() {
     
        Contacto contacto = new Contacto();

       
        boolean resultado = contacto.validarEmail("correoe@jemplo.com");

      
        assertTrue(resultado);
    }
    @Test(expected = IllegalArgumentException.class)
    public void crearContactoConCorreoInvalido() {
        // Intenta crear un contacto con un correo electrónico inválido
        // Esto debería lanzar una excepción IllegalArgumentException
        Contacto contacto = new Contacto("Nombre", "Apellido", "correoinvalido");

        // Si llega a este punto, la prueba fallará, ya que se espera una excepción
    }

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
    contacto.setEmail("juan.gonzalez@gmail.com");
    assertEquals(" ", contacto.getName());
    assertEquals(" ", contacto.getApellido());
    assertEquals("juan.gonzalez@gmail.com", contacto.getEmail());
    }

}
