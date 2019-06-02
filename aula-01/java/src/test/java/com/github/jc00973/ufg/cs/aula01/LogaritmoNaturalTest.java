package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LogaritmoNaturalTest {

    @Test
    void testLogaritmoNatural() {
        assertEquals(2.5, AlgoritmosEmJava.logaritmoNatural(1, 3));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.logaritmoNatural(-17, 7));
    }
}