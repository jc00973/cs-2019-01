package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RaizTest {

    @Test
    void testRaiz() {
        assertEquals(1, AlgoritmosEmJava.raiz(1, 100));
        assertEquals(2, AlgoritmosEmJava.raiz(4, 100));
        assertEquals(3, AlgoritmosEmJava.raiz(9, 100));
        assertEquals(4, AlgoritmosEmJava.raiz(16, 100));
        assertEquals(5, AlgoritmosEmJava.raiz(25, 100));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.raiz(-17, 100));
    }
}