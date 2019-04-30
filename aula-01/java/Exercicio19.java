package com.github.jc00973.cs.aula1.java;

public class Exercicio19 {

	public static int fibonacci(int n) {

		int a = 0;
		int c = 1;

		if ((n == 0) || (n == 1)) {
			return n;
		}

		int i = 2;

		while (i <= n) {
			int t = c;
			c = c + a;
			a = t;
			i = i + 1;
		}

		return c;
	}
}
