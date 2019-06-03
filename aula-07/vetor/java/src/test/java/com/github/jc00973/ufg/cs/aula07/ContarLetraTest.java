package com.github.jc00973.ufg.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.*;

public class ContarLetraTest {

    int[] resultado1 = {3, 2, 3, 2, 3};
    int[] resultado2 = {1, 1, 1};
    int[] resultado3 = {2, 2, 1, 2, 2, 1, 2, 1, 1, 2};

    @Test
    void testContarLetra() {
        assertArrayEquals(resultado1, AlgoritmosVetor.contarLetra("arara"));
        assertArrayEquals(resultado2, AlgoritmosVetor.contarLetra("ufg"));
        assertArrayEquals(resultado3, AlgoritmosVetor.contarLetra("engenharia"));
    }

}