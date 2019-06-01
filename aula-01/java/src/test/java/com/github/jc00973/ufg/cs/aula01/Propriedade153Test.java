package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Propriedade153Test {

    @Test
    void testpropriedade153() {
        assertEquals(true, AlgoritmosEmJava.propriedade153(153));
        assertEquals(false, AlgoritmosEmJava.propriedade153(998));
        assertEquals(false, AlgoritmosEmJava.propriedade153(302));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.propriedade153(-17));
    }
}