package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PiTest {

    @Test
    void testPi() {
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.pi(-17));
    }
}