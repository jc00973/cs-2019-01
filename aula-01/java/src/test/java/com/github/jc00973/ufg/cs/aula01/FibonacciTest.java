package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    @Test
    void testFibonacci() {
        assertEquals(2, AlgoritmosEmJava.fibonacci(2));
        assertEquals(3, AlgoritmosEmJava.fibonacci(3));
        assertEquals(8, AlgoritmosEmJava.fibonacci(5));
        assertEquals(34, AlgoritmosEmJava.fibonacci(8));
        assertEquals(144, AlgoritmosEmJava.fibonacci(11));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.fibonacci(-17));
    }
}