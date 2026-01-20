package ejercicios.ejercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EcuacionSegundoGradoTest {
    EcuacionSegundoGrado e1, e2, e3, e4;
    @BeforeEach
    void setUp() {
        e1 = new EcuacionSegundoGrado(1, 2 , -15);
        e2 = new EcuacionSegundoGrado(6, 2 , -4);
        e3 = new EcuacionSegundoGrado(6, 2 , 4);
        e4 = new EcuacionSegundoGrado(10, 10 , 10);
    }

    @Test
    void calcularX1() {
        assertEquals(3, e1.calcularX1());
        assertEquals(6667, Math.round(e2.calcularX1() * 10000));
        assertEquals(Double.NaN, e3.calcularX1());
        assertTrue(Double.isNaN( e4.calcularX1() ));
    }

    @Test
    void calcularX2() {
        assertEquals(-5, e1.calcularX2());
        assertEquals(-1, e2.calcularX2());
        assertEquals(Double.NaN, e3.calcularX2());
        assertTrue(Double.isNaN( e4.calcularX2() ));
    }
}