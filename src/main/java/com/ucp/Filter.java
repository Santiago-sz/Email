package com.ucp;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    
}
    public void testGetBandejaSalida() {
        List<Correo> bandejaSalida = new ArrayList<>();
        Buzon buzon = new Buzon("example@example.com", new ArrayList<>(), bandejaSalida);
         
        assertNotNull(buzon.getBandejaSalida());
        assertTrue(buzon.getBandejaSalida().isEmpty());
    }
