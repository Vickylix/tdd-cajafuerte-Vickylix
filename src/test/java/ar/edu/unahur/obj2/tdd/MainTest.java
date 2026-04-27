package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testMain() {

    }
    @Test
    void AbrirLaCajaFuerteUsandoContraseñaCorrecta(){
        CajaFuerte caja = new CajaFuerte(1234);
        assertTrue(caja.AbrirCajaFuerte(1234));
    }
    @Test
    void LaCajaFuerteNoSeAbreConLaContraseñaIncorrecta(){
        CajaFuerte caja2 = new CajaFuerte(1234);
        assertFalse(caja2.AbrirCajaFuerte(2345));
    }
    @Test
    void EstadoActualDeLaCajaFuerte(){
        CajaFuerte caja3 = new CajaFuerte(9876);
        
    }
}
