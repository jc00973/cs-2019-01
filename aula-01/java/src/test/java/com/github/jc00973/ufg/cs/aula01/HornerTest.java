package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HornerTest {

    int vetorTeste[] = {1, 1, 1, 1, 1, 0};

    @Test
    void testHorner() {
        assertEquals(5, AlgoritmosEmJava.horner(1, 5, vetorTeste));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.horner(1, -5, vetorTeste));
    }
}