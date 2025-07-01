package com.example.aer.calculadora;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir por cero");
        return a / b;
    }
}
