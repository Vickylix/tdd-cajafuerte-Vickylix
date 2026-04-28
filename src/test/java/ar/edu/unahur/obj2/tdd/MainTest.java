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
        assertTrue(caja.EstadoActual());
    }
    @Test
    void LaCajaFuerteNoSeAbreConLaContraseñaIncorrecta(){
        CajaFuerte caja2 = new CajaFuerte(1234);
        assertFalse(caja2.AbrirCajaFuerte(2345));
        assertFalse(caja2.EstadoActual());
    }
    @Test
    void EstadoActualDeLaCajaFuerte(){
        CajaFuerte caja3 = new CajaFuerte(9876);
        assertFalse(caja3.EstadoActual());
    }
    @Test 
    void SaberContraseñaDeLaCajaFuerte(){
        CajaFuerte caja4 = new CajaFuerte(4567);
        int resultadoEsperado = caja4.getClave();
        assertTrue(resultadoEsperado == 4567);
    }
    @Test
    void CerrarUnaCajaFuerteLuegoDeAbrirla(){
        CajaFuerte caja5 = new CajaFuerte(1234);
        assertTrue(caja5.AbrirCajaFuerte(1234));
        assertFalse(caja5.CerrarCajaFuerte());
    }
}
