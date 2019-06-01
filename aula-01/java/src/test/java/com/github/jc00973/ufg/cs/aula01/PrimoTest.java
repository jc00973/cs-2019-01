package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrimoTest {

    @Test
    void testPrimo() {
        assertEquals(true, AlgoritmosEmJava.primo(2));
        assertEquals(true, AlgoritmosEmJava.primo(3));
        assertEquals(true, AlgoritmosEmJava.primo(5));
        assertEquals(false, AlgoritmosEmJava.primo(4));
        assertEquals(false, AlgoritmosEmJava.primo(6));
        assertEquals(false, AlgoritmosEmJava.primo(8));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.primo(-17));
    }
}