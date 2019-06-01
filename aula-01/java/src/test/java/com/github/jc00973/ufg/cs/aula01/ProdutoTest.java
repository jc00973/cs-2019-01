package com.github.jc00973.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProdutoTest {

    @Test
    void testproduto() {
        assertEquals(35, AlgoritmosEmJava.produto(5, 7));
        assertEquals(130, AlgoritmosEmJava.produto(13, 10));
        assertEquals(172, AlgoritmosEmJava.produto(2, 86));
        assertEquals(200, AlgoritmosEmJava.produto(40, 5));
        assertEquals(6006, AlgoritmosEmJava.produto(1001, 6));
        assertThrows(IllegalArgumentException.class,
                () -> AlgoritmosEmJava.produto(-17, 7));
    }
}