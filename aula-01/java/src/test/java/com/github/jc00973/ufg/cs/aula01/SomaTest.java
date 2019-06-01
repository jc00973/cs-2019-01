package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SomaTest {

    @Test
    void testsoma() {
        assertEquals(10, AlgoritmosEmJava.soma(4));
        assertEquals(15, AlgoritmosEmJava.soma(5));
        assertEquals(21, AlgoritmosEmJava.soma(6));
        assertEquals(28, AlgoritmosEmJava.soma(7));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.soma(-17));
    }
}