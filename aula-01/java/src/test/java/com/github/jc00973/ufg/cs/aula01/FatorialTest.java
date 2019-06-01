package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FatorialTest {

    @Test
    void testfatorial() {
        assertEquals(1, AlgoritmosEmJava.fatorial(1));
        assertEquals(2, AlgoritmosEmJava.fatorial(2));
        assertEquals(6, AlgoritmosEmJava.fatorial(3));
        assertEquals(24, AlgoritmosEmJava.fatorial(4));
        assertEquals(120, AlgoritmosEmJava.fatorial(5));
        assertEquals(720, AlgoritmosEmJava.fatorial(6));
        assertEquals(5040, AlgoritmosEmJava.fatorial(7));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.fatorial(-17));
    }
}