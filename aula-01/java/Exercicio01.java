package com.github.jc00973.cs.aula1.java;

public class Exercicio01 {

    public static boolean propriedade3025(int n) {

        int i = n / 100;
        int j = n % 100;

        return Math.pow((i + j), 2) == n;
    }
}
