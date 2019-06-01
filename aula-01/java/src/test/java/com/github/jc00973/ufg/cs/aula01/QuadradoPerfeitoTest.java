package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuadradoPerfeitoTest {

    @Test
    void testQuadradoPerfeito() {
        assertEquals(true, AlgoritmosEmJava.quadradoPerfeito(1));
        assertEquals(true, AlgoritmosEmJava.quadradoPerfeito(4));
        assertEquals(true, AlgoritmosEmJava.quadradoPerfeito(9));
        assertEquals(true, AlgoritmosEmJava.quadradoPerfeito(16));
        assertEquals(true, AlgoritmosEmJava.quadradoPerfeito(25));
        assertEquals(false, AlgoritmosEmJava.quadradoPerfeito(2));
        assertEquals(false, AlgoritmosEmJava.quadradoPerfeito(3));
        assertEquals(false, AlgoritmosEmJava.quadradoPerfeito(5));
        assertEquals(false, AlgoritmosEmJava.quadradoPerfeito(6));
        assertEquals(false, AlgoritmosEmJava.quadradoPerfeito(7));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.quadradoPerfeito(-17));
    }
}