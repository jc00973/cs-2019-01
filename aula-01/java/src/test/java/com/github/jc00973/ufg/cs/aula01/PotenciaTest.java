package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PotenciaTest {

    @Test
    void testpotencia() {
        assertEquals(78125, AlgoritmosEmJava.potencia(5, 7));
        assertEquals(59049, AlgoritmosEmJava.potencia(3, 10));
        assertEquals(64, AlgoritmosEmJava.potencia(2, 6));
        assertEquals(102400000, AlgoritmosEmJava.potencia(40, 5));
        assertEquals(1331, AlgoritmosEmJava.potencia(11, 3));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.potencia(-17, 4));
    }
}