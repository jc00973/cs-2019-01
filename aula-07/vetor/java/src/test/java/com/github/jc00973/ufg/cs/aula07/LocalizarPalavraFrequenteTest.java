package com.github.jc00973.ufg.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.*;

public class LocalizarPalavraFrequenteTest {

    @Test
    void testLocalizarPalavraFrequente() {
        assertEquals("Joao", AlgoritmosVetor.localizarPalavraFrequente("Joao Jose Joao Joao Joao Jose"));
        assertEquals("Sexta", AlgoritmosVetor.localizarPalavraFrequente("Quarta Sexta Quinta Sexta Sexta Quarta"));
    }

}