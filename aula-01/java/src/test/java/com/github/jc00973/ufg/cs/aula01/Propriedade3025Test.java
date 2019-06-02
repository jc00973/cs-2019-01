package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Propriedade3025Test {

    @Test
    void testPropriedade3025() {
        assertEquals(true, AlgoritmosEmJava.propriedade3025(3025));
        assertEquals(true, AlgoritmosEmJava.propriedade3025(1));
        assertEquals(false, AlgoritmosEmJava.propriedade3025(9988));
        assertEquals(false, AlgoritmosEmJava.propriedade3025(3024));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.propriedade3025(-17));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.propriedade3025(11111));
    }
}