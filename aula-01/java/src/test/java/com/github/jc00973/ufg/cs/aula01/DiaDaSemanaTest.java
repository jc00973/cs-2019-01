package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiaDaSemanaTest {

    @Test
    void testdiaDaSemana() {
        assertEquals(5, AlgoritmosEmJava.diaDaSemana(25, 5, 2019));
        assertEquals(1, AlgoritmosEmJava.diaDaSemana(25, 6, 2019));
        assertEquals(0, AlgoritmosEmJava.diaDaSemana(1, 7, 2019));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.diaDaSemana(-17, 1, 2010));
    }
}