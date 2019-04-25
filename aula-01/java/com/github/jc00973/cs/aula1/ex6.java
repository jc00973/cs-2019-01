package com.github.jc00973.cs.aula1;

public class ex6 {

    public static int fatorial(int n) {

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }

    public static void main(String args[]) {
        System.out.println(fatorial(4));
    }
}
