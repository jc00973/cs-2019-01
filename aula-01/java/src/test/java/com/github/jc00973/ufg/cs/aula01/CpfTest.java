package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CpfTest {

    int cpfTeste1[] = {0, 0, 5, 6, 8, 7, 4, 8, 8, 1, 6, 2};
    int cpfTeste2[] = {0, 2, 2, 2, 7, 1, 5, 3, 8, 2, 2, 0};
    int cpfTeste3[] = {0, 0, 0, 1, 7, 5, 5, 0, 6, 2, 9, 9};
    int cpfTeste4[] = {0, 3, 0, 5, 4, 0, 0, 4, 0, 0, 4, 0};
    int cpfTeste5[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2};
    int cpfTeste6[] = {0, 1, 9, 1, 2};
    int cpfTeste7[] = {0, -1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2};
    int cpfTeste8[] = {0, 111, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2};
    int cpfTeste9[] = {};

    @Test
    void testCpf() {
        assertEquals(true, AlgoritmosEmJava.cpf(cpfTeste1));
        assertEquals(true, AlgoritmosEmJava.cpf(cpfTeste2));
        assertEquals(true, AlgoritmosEmJava.cpf(cpfTeste3));
        assertEquals(false, AlgoritmosEmJava.cpf(cpfTeste4));
        assertEquals(false, AlgoritmosEmJava.cpf(cpfTeste5));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.cpf(cpfTeste6));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.cpf(cpfTeste7));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.cpf(cpfTeste8));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.cpf(null));
    }
}