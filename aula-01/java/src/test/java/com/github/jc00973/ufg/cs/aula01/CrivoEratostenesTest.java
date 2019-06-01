package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CrivoEratostenesTest {

    int vetorTeste1[] = {0, 0, 0, 0, 0, 0};

    int vetorTeste2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    int vetorTeste3[] = {0, 0, 0, 0, 0, 0, 0, 0};

    int vetorTeste4[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    int vetorTeste5[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    int vetorTeste6[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    int vetorTeste7[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    int vetorTeste8[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0, 0};

    int vetorTeste9[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                         0, 0, 0, 0, 0, 0, 0, 0, 0};

    int vetorTeste10[] = {1, 2, 3, 4, 4, 3, 2};

    @Test
    void testCrivoEratostenes() {
        assertEquals(true, AlgoritmosEmJava.crivoEratostenes(vetorTeste1, 2));
        assertEquals(true, AlgoritmosEmJava.crivoEratostenes(vetorTeste2, 3));
        assertEquals(true, AlgoritmosEmJava.crivoEratostenes(vetorTeste3, 5));
        assertEquals(true, AlgoritmosEmJava.crivoEratostenes(vetorTeste7, 59));
        assertEquals(false, AlgoritmosEmJava.crivoEratostenes(vetorTeste4, 4));
        assertEquals(false, AlgoritmosEmJava.crivoEratostenes(vetorTeste5, 6));
        assertEquals(false, AlgoritmosEmJava.crivoEratostenes(vetorTeste6, 8));
        assertEquals(false, AlgoritmosEmJava.crivoEratostenes(vetorTeste8, 36));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.crivoEratostenes(vetorTeste9, -17));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.crivoEratostenes(vetorTeste10, 3));

    }
}