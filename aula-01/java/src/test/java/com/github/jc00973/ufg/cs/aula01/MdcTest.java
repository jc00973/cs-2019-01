package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MdcTest {

    @Test
    void testMdc() {
        assertEquals(27, AlgoritmosEmJava.mdc(81, 54));
        assertEquals(27, AlgoritmosEmJava.mdc(54, 27));
        assertEquals(6, AlgoritmosEmJava.mdc(30, 12));
        assertEquals(5, AlgoritmosEmJava.mdc(25, 15));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.mdc(-17, 5));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.mdc(17, 50));
    }
}