package com.github.jc00973.ufg.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EncontrarMenorTemperaturaTest {

    float[] temperaturas1 = {0, -12, 42, 6, 21, 27, 24, 28, -28, 21, 26, 22, 33, 36, 12, 15, 13};

    @Test
    void testEncontrarMenorTemperatura() {
        assertEquals(-28, AlgoritmosVetor.encontrarMenorTemperatura(temperaturas1));
    }

}