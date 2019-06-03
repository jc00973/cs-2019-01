package com.github.jc00973.ufg.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SomaNumerosImparesTest {

    int[] vetorTeste = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};

    @Test
    void testNumerosImpares() {
        assertEquals(25, AlgoritmosVetor.somaNumerosImpares(vetorTeste));
    }

}