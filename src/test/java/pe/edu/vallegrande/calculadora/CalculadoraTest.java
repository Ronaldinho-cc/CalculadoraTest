package pe.edu.vallegrande.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora cal;

    @BeforeEach
    void setup() {
        System.out.println("\n===== Iniciando prueba =====");
        cal = new Calculadora();
    }

    @Test
    void testSumar() {
        System.out.println("Probando sumar: 5 + 3 = 8");
        assertEquals(8, cal.sumar(5, 3));
    }

    @Test
    void testRestarPositivos() {
        System.out.println("Probando restar: 10 - 4 = 6");
        assertEquals(6, cal.restar(10, 4));
    }

    @Test
    void testRestarNegativos() {
        System.out.println("Probando restar: -5 - (-3) = -2");
        assertEquals(-2, cal.restar(-5, -3));
    }

    @Test
    void testMultiplicarPositivos() {
        System.out.println("Probando multiplicar: 4 * 3 = 12");
        assertEquals(12, cal.multiplicar(4, 3));
    }

    @Test
    void testMultiplicarConCero() {
        System.out.println("Probando multiplicar: 4 * 0 = 0");
        assertEquals(0, cal.multiplicar(4, 0));
    }

    @Test
    void testMultiplicarNegativos() {
        System.out.println("Probando multiplicar: -2 * 3 = -6");
        assertEquals(-6, cal.multiplicar(-2, 3));
    }

    @Test
    void testDividirNormal() {
        System.out.println("Probando dividir: 10 / 2 = 5");
        assertEquals(5, cal.dividir(10, 2));
    }

    @Test
    void testDividirPorCero() {
        System.out.println("Probando dividir entre cero - excepcion esperada");
        assertThrows(ArithmeticException.class, () -> cal.dividir(10, 0));
    }

    @Test
    void testPorcentajeNormal() {
        System.out.println("Probando porcentaje: 25 de 200 = 12.5%");
        assertEquals(12.5, cal.porcentaje(25, 200));
    }

    @Test
    void testPorcentajeDivisionPorCero() {
        System.out.println("Probando porcentaje con total = 0 - excepcion esperada");
        assertThrows(ArithmeticException.class, () -> cal.porcentaje(10, 0));
    }

    @Test
    void testRaizCuadradaPositivo() {
        System.out.println("Probando raiz cuadrada de 16 = 4");
        assertEquals(4, cal.raizCuadrada(16));
    }

    @Test
    void testRaizCuadradaNegativo() {
        System.out.println("Probando raiz cuadrada negativa - excepcion esperada");
        assertThrows(IllegalArgumentException.class, () -> cal.raizCuadrada(-9));
    }
}
