package com.github.jc00973.ufg.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuantidadeElementosIguaisTest {

    int[] vetorTeste = {0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};

    @Test
    void testQuantidadeElementosIguais() {
        assertEquals(4, AlgoritmosVetor.quantidadeElementosIguais(vetorTeste, 1));
    }

}