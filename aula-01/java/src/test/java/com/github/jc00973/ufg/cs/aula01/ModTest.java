package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ModTest {

    @Test
    void testmod() {
        assertEquals(0, AlgoritmosEmJava.mod(25, 5));
        assertEquals(1, AlgoritmosEmJava.mod(25, 4));
        assertEquals(1, AlgoritmosEmJava.mod(100, 99));
        assertEquals(2, AlgoritmosEmJava.mod(20, 3));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.mod(-17, 1));
    }
}