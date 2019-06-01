package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Mdc2Test {

    @Test
    void testMdc2() {
        assertEquals(27, AlgoritmosEmJava.mdc2(81, 54));
        assertEquals(27, AlgoritmosEmJava.mdc2(54, 27));
        assertEquals(6, AlgoritmosEmJava.mdc2(30, 12));
        assertEquals(5, AlgoritmosEmJava.mdc2(25, 15));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.mdc2(-17, 5));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.mdc2(17, 50));
    }
}