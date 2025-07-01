package com.example.aer.calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {

    private final CalculadoraService calculadoraService = new CalculadoraService();

    @Test
    void testSumar() {
        assertEquals(5, calculadoraService.sumar(2, 3));
    }

    @Test
    void testRestar() {
        assertEquals(1, calculadoraService.restar(4, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(12, calculadoraService.multiplicar(3, 4));
    }

    @Test
    void testDividir() {
        assertEquals(2, calculadoraService.dividir(4, 2));
    }

    @Test
    void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> calculadoraService.dividir(5, 0));
    }
}
