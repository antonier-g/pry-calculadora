package com.example.aer.calculadora;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/sumar")
    public int sumar(@RequestParam int a, @RequestParam int b) {
        return calculadoraService.sumar(a, b);
    }

    @GetMapping("/restar")
    public int restar(@RequestParam int a, @RequestParam int b) {
        return calculadoraService.restar(a, b);
    }

    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int a, @RequestParam int b) {
        return calculadoraService.multiplicar(a, b);
    }

    @GetMapping("/dividir")
    public int dividir(@RequestParam int a, @RequestParam int b) {
        return calculadoraService.dividir(a, b);
    }
}
