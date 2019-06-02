package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PiTest {

    @Test
    void testPi() {
        assertEquals(3.14159265359, AlgoritmosEmJava.pi(1000), 0.01);
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.pi(-17));
    }
}