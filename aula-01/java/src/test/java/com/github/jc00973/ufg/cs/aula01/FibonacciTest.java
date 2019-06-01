package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    @Test
    void calculaFibonacciCorreto() {
        assertEquals(21, AlgoritmosEmJava.fibonacci(8));
    }

    @Test
    void verificaArgumentosInvalidos() {
        int[] poli_array = new int[]{};
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.fibonacci(-1));
    }
}