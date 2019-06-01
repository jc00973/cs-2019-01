package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RazaoAureaTest {

    @Test
    void testRazaoAurea() {
        assertEquals(1.6180339887498947, AlgoritmosEmJava.razaoAurea(1, 2, 1000));
        assertEquals(1.618033988749895, AlgoritmosEmJava.razaoAurea(3, 7, 1000));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.razaoAurea(-3, 7, 1000));
    }
}