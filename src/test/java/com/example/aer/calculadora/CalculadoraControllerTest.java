package com.example.aer.calculadora;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(CalculadoraController.class)
public class CalculadoraControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CalculadoraService calculadoraService;

    @Test
    void testSumar() throws Exception {
        when(calculadoraService.sumar(2, 3)).thenReturn(5);

        mockMvc.perform(get("/api/calculadora/sumar")
                        .param("a", "2")
                        .param("b", "3"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }
/*
    @Test
    void testDividirPorCero() throws Exception {
        when(calculadoraService.dividir(4, 0)).thenThrow(new ArithmeticException("No se puede dividir por cero"));

        mockMvc.perform(get("/api/calculadora/dividir")
                        .param("a", "4")
                        .param("b", "0"))
                .andExpect(status().isInternalServerError());
    }*/
}

